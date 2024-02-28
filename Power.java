class Power extends ConsoleProgram {

  /**
  * Write a program Power.java that let you enter two numbers a,b, and that prints out a^b
  * @author: P. Yip
  */
  
  public void run() {
    // define variables
    double dblBase;
    double dblExponent;
    double dblPower;
    
    // user input
    dblBase = readDouble("Enter base: ");
    dblExponent = readDouble("Enter exponent: ");

    // output
    dblPower = Math.pow(dblBase, dblExponent);
    System.out.println(dblBase + " to the power of " + dblExponent + " is " + dblPower);
    
  }
}