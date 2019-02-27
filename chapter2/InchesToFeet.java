package chapter2;

public class InchesToFeet {
    private Integer inches;
    public Integer getInches(){
        return inches;
    }
    public void setInches(Integer valor){
        inches=valor;
    }
    public InchesToFeet(){
        inches=86;
    }
    public InchesToFeet(Integer x){
        inches=x;
    }
    public String convertir(){
        Integer feet=inches/12;
        Integer sobra=inches%12;
        return String.format("Son" +feet+", pies con "+sobra+ "pulgadas");
    }
}
