
package Main;

import chapter2.CarlysEventPrice;

public class Princiapal_Carly {
    public static void main (String [] args){
        CarlysEventPrice ca = new CarlysEventPrice(60);
        System.out.println(ca.lema());
        System.out.println(ca.toString());
        System.out.println("Evento grande: "+ca.taman());

    }
}
