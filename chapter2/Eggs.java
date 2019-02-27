
package chapter2;

public class Eggs {
    private static float PRED=(float)3.25;
    private static float PREI=(float)0.45;
    private Integer cantidadh;
   
    public Eggs(Integer cantidadh){
        this.cantidadh=cantidadh;
    }

    @Override
    public String toString(){
        return String.format("ordeno %d huevo. Son %d docenas a $%.2f y %d "
                + "huevos sueltos a $%.2f centavos por un total de $%.2f",this.getCantidadh(),
                this.getCantidadh()/12,PRED,this.getCantidadh()%12,PREI,
                ((this.getCantidadh()/12)*PRED)+((this.getCantidadh()%12)*PREI) );
    }
    
    public static float getPRED() {
        return PRED;
    }

    public static void setPRED(float aPRED) {
        PRED = aPRED;
    }

    public static float getPREI() {
        return PREI;
    }
    
    public static void setPREI(float aPREI) {
        PREI = aPREI;
    }
 
    public Integer getCantidadh() {
        return cantidadh;
    }

    public void setCantidadh(Integer cantidadh) {
        this.cantidadh = cantidadh;
    } 

}
