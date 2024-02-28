class AreaSin extends ConsoleProgram {

  /**
  * Write a program AreaSin.java that uses the Math.sin() function to calculate the area of a triangle, given two sides and the contained angle:
    If the sides are a,b and the angle is C, then the area is: absinC2
  * @author: P. Yip
  */
  
  public void run() {
     // variables
     double dblSideA;
     double dblSideB;
     double dblAngleC;
     double dblArea;
 
     // user input
     dblSideA = readDouble("Enter side A of a triangle: ");
     dblSideB = readDouble("Enter side B of a triangle: ");
     dblAngleC = readDouble("Enter the angle contained by Side A and B: ");
 
     // Compute area
     dblArea = (dblSideA * dblSideB * Math.sin(Math.toRadians(dblAngleC))) / 2.0;
 
     // Output result
     System.out.println("The area is: " + dblArea);

    
  }
}