
package Main;

import chapter2.MilesToFeet;
import chapter2.MilesToFeetInteractive;


public class Principal_miles {
    public static void main(String [] args){
    MilesToFeet milla = new MilesToFeet();
        System.out.println("\nEjercicio 4");
        System.out.println(milla);
   
    MilesToFeetInteractive miles = new MilesToFeetInteractive((float) 8.5);
        System.out.println(miles);

}
}
