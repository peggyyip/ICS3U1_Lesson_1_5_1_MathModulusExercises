
class Km_to_Miles extends ConsoleProgram {

  /**
  * Write a program Km_to_Miles.java  that lets you enter a distance in kilometers and that converts it into miles. (1 km = 0.621371 miles)
  * @author: P. Yip
  */
  
  public void run() {
     // Define the variables
     double dblKilometers;
     double dblMiles;
 
     // Get the distance in Km from User
     dblKilometers = readDouble("How many kilometers?: ");
 
     // Convert number of kilometers to miles
     dblMiles = dblKilometers * 0.621371;
 
     // Output the results
     System.out.println(dblKilometers + " km is " + dblMiles + " miles.");
 
    
  }
}
