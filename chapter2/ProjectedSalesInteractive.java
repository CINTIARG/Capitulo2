package chapter2;

public class ProjectedSalesInteractive {
    private Integer totalNorth;
    private Integer totalSouth;
    
    public ProjectedSalesInteractive(Integer x){
        totalNorth=x;
    }
    public Integer getTotalNorth(){
        return totalNorth;
    }
    public void setTotalNorth(Integer x){
        totalNorth=x;
    }
     public Integer getTotalSouth(){
        return totalSouth;
    }
    public void setTotalSouth(Integer x){
        totalSouth=x;
    }
    public String convertir(){
        return String.format("Total de venta en Norte:"+totalNorth+ "Total de venta en Sur" +totalSouth);
    }
}
