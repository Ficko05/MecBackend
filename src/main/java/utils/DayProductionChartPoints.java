
package utils;

import java.util.ArrayList;
import java.util.List;


public class DayProductionChartPoints {
    
    private List<Integer> goodProduction = new ArrayList<>();
    private List<Integer> badProduction = new ArrayList<>();

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
