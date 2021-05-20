import java.util.Scanner; 
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guesswork2 {  
  public static void main(String[] args) throws IOException {    
    Random random = new Random();    
    int randNum = random.nextInt(100);    
    int guess = 0;    
    int attempts = 0;
    int bestGuess = 0;    
    int starth = 0;
    int startm = 0;
    double startmili = 0.0;
    boolean play = true;
    Scanner sc = new Scanner(System.in);     
    File file = new File("saves.txt");
    Scanner in = new Scanner(file);
    while(in.hasNextLine()) {
      String word = in.nextLine();
      if(word.charAt(0) == 'A') { //Attempts
        bestGuess = Integer.parseInt(word.substring(9, word.length()).trim());
      }
    }
    System.out.println("Please enter your name, just for saving purposes.");
      String name = sc.nextLine();
    
    while(play) {
    LocalTime tiem = LocalTime.now();
    String start = tiem.toString();
    if(start.charAt(2) == ':') {
    	starth = Integer.valueOf(start.substring(0, 2));
        startm = Integer.valueOf(start.substring(3, 5));
        startmili = Double.valueOf(start.substring(6, start.length()));
    } else if(start.charAt(1) == ':') {
    	starth = Integer.valueOf(start.substring(0, 1));
        startm = Integer.valueOf(start.substring(2, 5));
        startmili = Double.valueOf(start.substring(5, start.length()));
    }
    
    LocalDate preformatday = LocalDate.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String day = preformatday.format(myFormatObj);

    
    System.out.println("Welcome to the Number Guessing Game!");    
    System.out.println("This is the best guess so far! Tries: " + bestGuess);    
    System.out.println("Guess a number between 1 and 100");    
    guess = sc.nextInt();    
    while(guess != randNum){      
      if(randNum>guess){        
        System.out.println("Your guess was too low, try again:");        
        guess = sc.nextInt();      
      }else if(randNum<guess){        
        System.out.println("Your guess was too high, try again:");        
        guess = sc.nextInt();      
      }      attempts++;    
    }    
  PrintWriter cummy = new PrintWriter(new FileWriter(file)); 
  LocalTime enddy = LocalTime.now();
  String end = enddy.toString();
  int endh = 0;
  int endm = 0;
  double endmili = 0.0;
  if(end.charAt(2) == ':') {
    endh = Integer.valueOf(end.substring(0, 2));
    endm = Integer.valueOf(end.substring(3, 5));
    endmili = Double.valueOf(end.substring(6, end.length()));
  } else if(end.charAt(1) == ':') {
	  endh = Integer.valueOf(end.substring(0, 1));
	  endm = Integer.valueOf(end.substring(2, 4));
	  endmili = Double.valueOf(end.substring(5, end.length()));
  }
  String finalh = String.valueOf(endh - starth);
  String finalm = String.valueOf(endm - startm);
  String finalmili = String.valueOf(endmili - startmili);
  String finality = finalh + ":" + finalm + finalmili;
  cummy.println("Name: " + name); 
  cummy.println("Date: " + day);
  cummy.println("Time: "+ finality); 
  cummy.println("Attempts: " + attempts);
  System.out.println("You win! You guessed it in " + attempts + " tries!");  
  System.out.println("Would you like to play again?");
  String response = sc.next();
  if(response.equals("y")) {
	  day = "";
	  finality = "";
	  attempts = 0;
  }else {
    cummy.close();
    in.close();
    sc.close();
    play = false;
  }
  }
  }
}
