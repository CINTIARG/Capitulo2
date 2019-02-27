
package chapter2;

public class Dollars {
    private Integer Dolar;
    private static float V=(float)0.2;
    private static float D=(float)0.10;
    private static float C=(float)0.05;
    private static float U=(float)0.01;
    
    public Dollars(Integer dolar){
        this.Dolar=dolar;
    }

    @Override
    public String toString(){
        return String.format("%d dolares es equivalente a %.0f monedas de 20, %.0f monedas de 10, %.0f monedas de 5 o %.0f monedas de 1",this.getDolar(),this.getDolar()/V,this.getDolar()/D,this.getDolar()/C,this.getDolar()/U);
    }
    public Integer getDolar() {
        return Dolar;
    }

    public void setDolar(Integer Dolar) {
        this.Dolar = Dolar;
    }

    public static float getV() {
        return V;
    }

    public static void setV(float aV) {
        V = aV;
    }

    public static float getD() {
        return D;
    }

    public static void setD(float aD) {
        D = aD;
    }

    public static float getC() {
        return C;
    }

    public static void setC(float aC) {
        C = aC;
    }

    public static float getU() {
        return U;
    }

    public static void setU(float aU) {
        U = aU;
    }
}
