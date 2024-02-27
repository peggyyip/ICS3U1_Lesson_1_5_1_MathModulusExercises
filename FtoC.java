class FtoC extends ConsoleProgram {

  /**
  * Write a program that lets you enter a degree measure in Fahrenheit, 
    and that prints the result in celsius degree measure:
    c =5/9(f - 32) (Note: be careful with integer division)
  * @author: P. Yip
  */
  
  public void run() {
    double dblDegreeinFahrenheit;
    int intDegreeinCelsius;

    dblDegreeinFahrenheit = readDouble("Enter a degree measure in Fahrenheit: ");
    intDegreeinCelsius = ((int)dblDegreeinFahrenheit - 32) *5/9;

    System.out.println("c = " + intDegreeinCelsius);
  
  }
}