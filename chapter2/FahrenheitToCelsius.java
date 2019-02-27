
package chapter2;

public class FahrenheitToCelsius {
    private Integer f;
    public static final float CINCO_NOV=(float)0.5555556;
    public FahrenheitToCelsius(Integer f){
        this.f=f;
    }
   
    public Integer getF() {
        return f;
    }

    public void setF(Integer f) {
        this.f = f;
    }
    public float celsius(){
        return((this.getF()-32)*(CINCO_NOV));
    }
    @Override
    public String toString(){
        return String.format("La temperatura en Fahrenheit es: %d\nLa temperatura en Celsius es: %f",this.getF(),this.celsius());
    }

}
