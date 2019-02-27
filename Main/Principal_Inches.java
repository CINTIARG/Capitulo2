package Main;

import chapter2.InchesToFeet;

public class Principal_Inches {
    public static void main(String[] args){
        
        InchesToFeet x= new InchesToFeet(115);
        System.out.println(x.convertir());
    
        InchesToFeet x2= new InchesToFeet(200);
        System.out.println(x.convertir());
        
        x.setInches(220);
        InchesToFeet y= new InchesToFeet();
    }
}
