class FtoC extends ConsoleProgram {

  /**
  * Write a program that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure:
    c =5/9(f - 32) (Note: be careful with integer division)
  * @author: P. Yip
  */
  
  public void run() {
    // naming variables
    double dblDegreesinFahrenheit;
    double dblDegreesinCelsius;

    // calculations
    dblDegreesinFahrenheit = readDouble("Enter a degree measure in Fahrenheit: ");
    dblDegreesinCelsius = (dblDegreesinFahrenheit - 32) * 5.0 / 9.0;

    // printing
    System.out.println("c = " + dblDegreesinCelsius);
  
    // accurate to solutions
  }
}