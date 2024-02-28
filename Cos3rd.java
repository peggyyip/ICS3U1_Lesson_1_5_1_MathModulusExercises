class Cos3rd extends ConsoleProgram {

  /**
  * 
  Write a program Cos3rd.java that lets you enter two sides of a triangle and the contained angle, and that will use the cosine law to calculate the third side: 
  If the sides are a,b and the angle is C, then the third side is  a2+b2-2abcosC
  * @author: P. Yip
  */
  
  public void run() {
     // Define the variables
     double dblSideA;
     double dblSideB;
     double dblAngleC;
     double dblSideC;
 
     // user input
     dblSideA = readDouble("What is the length of side A: ");
     dblSideB = readDouble("What is the length of side B: ");
     dblAngleC = readDouble("What is the degree of angle C: ");
 
     // Calculate the third side using cosine law
     dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(Math.toRadians(dblAngleC)));
    
     // Output side c
     System.out.println("The length of side c is: " + dblSideC);
    
  }
}