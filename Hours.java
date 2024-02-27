class Hours extends ConsoleProgram {

  /**
  * Write a program that lets you enter a number of hours, 
    and that converts it to days and hours. 
    For example, 111 hours = 4 days and 15 hours.
  * @author: P.Yip
  */
  
  public void run() {
    // naming variables
    double dblHours;
    int intDays;
    int intExtraHours;

    // calculations
    dblHours = readDouble ("Hours: ");
    intDays = (int) dblHours / 24;
    intExtraHours = (int) dblHours % 24;

    // printing
    System.out.println(intDays + " days and " + intExtraHours + " hours.");

  }
}