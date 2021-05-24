import java.awt.Point;
import java.util.ArrayList;
public class Cannonball {
  double xpos;
  double ypos;
  double Viy;
  double Vix;
  final static double g = 9.81;

  public Cannonball(double xpos) {
    this.xpos = xpos;
  }

  public void move(double deltaSec) { //will change xpos, ypos and Viy to match flying thru the air
    //deltax = Vix*t + .5*a*t^2
    double deltaY = Viy * deltaSec - .5 * g * deltaSec * deltaSec;
    ypos += deltaY;
    double deltaX = Vix * deltaSec;
    xpos = xpos + deltaX;
    Viy = Viy - g * deltaSec;
    
  }

  public Point getLocation() {
    int x = (int)xpos;
    int y = (int)ypos;
    return new Point(x,y); //?
  }

  public ArrayList<Point>shoot(double Vi, double theta, double deltaSec) {
    ArrayList<Point> points = new ArrayList<Point>();
    this.Vix = Vi * Math.cos(theta);
    this.Viy = Vi * Math.sin(theta);
    move(deltaSec);
    points.add(getLocation());

    while(ypos > 0) {
      move(deltaSec);
      points.add(getLocation()); //really doesn't like this
    }
    
    return points;
  }
}