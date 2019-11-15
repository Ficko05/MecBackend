
package utils;

import java.util.List;


public class DayProductionChartPoints {
    
    private List<Integer> goodProduction;
    private List<Integer> badProduction;

    public DayProductionChartPoints() {
        
    }

   
    
    public void addGood(Integer good){
        goodProduction.add(good);
    }
    
    public void addBad(Integer bad){
        badProduction.add(bad);
    }

    public List<Integer> getGoodProduction() {
        return goodProduction;
    }

    public List<Integer> getBadProduction() {
        return badProduction;
    }
    
}
