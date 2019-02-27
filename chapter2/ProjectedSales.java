
package chapter2;

public class ProjectedSales {
    final Double porcent=0.10;
    private Integer totalNorth;
    private Integer totalSouth;
    
    public Integer getTotalNorth(){
       return totalNorth; 
    }
    public Integer setTotalNorth(Integer sales){
        return totalNorth=sales;
    }
    public Integer getTotalSouth(){
        return totalSouth; 
    }
    public Integer setTotalSouth(Integer sales2){
        return totalSouth=sales2;
    }
    public ProjectedSales(){
       totalNorth=4000;
       totalSouth=5500;
   }
    public ProjectedSales(Integer x){
        totalNorth=x;
        totalSouth=x;
    }
    public String totalSales(){
        Double tN=totalNorth*porcent;
        Double tS=totalSouth*porcent;
        return String.format("Division norte: +tN+ Division sur: +tS+"); 
    }
}
