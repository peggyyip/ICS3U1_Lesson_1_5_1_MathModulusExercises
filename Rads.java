class Rads extends ConsoleProgram {

  /**
  * Write a program that converts degree measures to radian measures
  * @author: P.Yip
  */
  
  public void run() {
    // naming variables
    double dblDegrees;
    double dblRadians;

    // calculations and printing
    dblDegrees = readDouble("Input degree: ");
    dblRadians = Math.toRadians(dblDegrees);
    System.out.println("The radian measures to: " + dblRadians);
    
  }
}