
package chapter2;

public class MilesToFeet {
   
    public static final int Pies = 5280;
    private float distancia;
    
    public MilesToFeet(){
       this.distancia=(float) 8.5;
    }
    public float getDistancia() {
        return distancia;
    }
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    @Override
    public String toString(){
        return String.format("the distance to my uncle’s house is:  %.2f",distancia*Pies);
    } 
}
