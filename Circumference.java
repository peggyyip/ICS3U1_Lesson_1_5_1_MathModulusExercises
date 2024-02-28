class Circumference extends ConsoleProgram {

  /**
  * Write a program Circumference.java that computes the circumference of a circle given a radius from user entry.
  * @author:P. Yip
  */
  
  public void run() {
    // naming variables
    double dblRadius;
    double dblCircumference;

    // calculate and output
    dblRadius = readDouble("Enter radius: ");
    dblCircumference = 2 * Math.PI * dblRadius;
    System.out.println("The circumference of this circle is: " + dblCircumference);

      // accurate to solutions
  }
}