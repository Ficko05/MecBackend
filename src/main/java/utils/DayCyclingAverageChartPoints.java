package utils;

import java.util.List;

/**
 *
 * @author Ficko
 */
public class DayCyclingAverageChartPoints {
    
    private List<Double> aFixture;
    private List<Double> bFixture;
    private List<Double> cFixture;
    private List<Double> dFixture;
    private List<Double> fixtureAverage;
    private List<String> fixtureTimeStamp;
    
    public DayCyclingAverageChartPoints(){
        
    }
    
    public void addaFixture(Double a){
        aFixture.add(a);
    }
    public void addbFixture(Double b){
        bFixture.add(b);
    } 
    public void addcFixture(Double c){
        cFixture.add(c);
    } 
    public void adddFixture(Double d){
        dFixture.add(d);
    } 
    public void addfixtureAverage(Double fixtureAve){
        fixtureAverage.add(fixtureAve);
    } 
    public void addfixtureTimeStamp(String fixtureTimeS){
        fixtureTimeStamp.add(fixtureTimeS);
    } 
    
    
    

    public List<Double> getaFixture() {
        return aFixture;
    }

    public void setaFixture(List<Double> aFixture) {
        this.aFixture = aFixture;
    }

    public List<Double> getbFixture() {
        return bFixture;
    }

    public void setbFixture(List<Double> bFixture) {
        this.bFixture = bFixture;
    }

    public List<Double> getcFixture() {
        return cFixture;
    }

    public void setcFixture(List<Double> cFixture) {
        this.cFixture = cFixture;
    }

    public List<Double> getdFixture() {
        return dFixture;
    }

    public void setdFixture(List<Double> dFixture) {
        this.dFixture = dFixture;
    }

    public List<Double> getFixtureAverage() {
        return fixtureAverage;
    }

    public void setFixtureAverage(List<Double> fixtureAverage) {
        this.fixtureAverage = fixtureAverage;
    }

    public List<String> getFixtureTimeStamp() {
        return fixtureTimeStamp;
    }

    public void setFixtureTimeStamp(List<String> fixtureTimeStamp) {
        this.fixtureTimeStamp = fixtureTimeStamp;
    }
    
    
    
    
}
