class FtoC extends ConsoleProgram {

  /**
  * Write a program that lets you enter a degree measure in Fahrenheit, and that prints the result in celsius degree measure:
    c =5/9(f - 32) (Note: be careful with integer division)
  * @author: P. Yip
  */
  
  public void run() {
    // naming variables
    double dblDegreeinFahrenheit;
    double dblDegreeinCelsius;

    // calculations
    dblDegreeinFahrenheit = readDouble("Enter a degree measure in Fahrenheit: ");
    dblDegreeinCelsius = (dblDegreeinFahrenheit - 32) * 5.0 / 9.0;

    // printing
    System.out.println("c = " + dblDegreeinCelsius);
  
  }
}