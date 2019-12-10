package logicLayer;

import entity.Mechineinfo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import utils.DayCyclingAverageChartPoints;

/**
 *
 * @author Ficko
 */
public class OnMaxCyceling {

    private double onMaxAverage;
    private List<Mechineinfo> dataPull;
    
    private double aFixtureValue, bFixtureValue, cFixtureValue, dFixtureValue, fixtureAverageValue;
    private int countA, countB, countC, countD;
    private String fixtureTimeStamp;
    
    
    public DayCyclingAverageChartPoints onMaxAverageGraph(List<Mechineinfo> dataPull) {
        DayCyclingAverageChartPoints DCACP = new DayCyclingAverageChartPoints();
//        for (int i = 0; i < dataPull.size() - 1; i++) {
//            
//            switch (dataPull.get(i).getFixtur()) {
//
//                case "A":
//                    countA++;
//                     aFixtureValue = aFixtureValue + dataPull.get(i).getOnMaxN();
//
//                    if (countA % 2 == 0) {
//                        DCACP.addaFixture(aFixtureValue);
////                        fixtureAverageValue = aFixtureValue + bFixtureValue + cFixtureValue + dFixtureValue / 120;
////                        DCACP.addfixtureAverage(fixtureAverageValue);
////                        fixtureAverageValue = 0;
////                        aFixtureValue = 0;
//                        countA = 0;
//                    }
//
//                    break;
//                case "B":
//                    countB++;
//                     bFixtureValue = bFixtureValue + dataPull.get(i).getOnMaxN();
//
//                    if (countB % 2 == 0) {
//                        DCACP.addbFixture(bFixtureValue);
////                        fixtureAverageValue = aFixtureValue + bFixtureValue + cFixtureValue + dFixtureValue / 120;
////                        DCACP.addfixtureAverage(fixtureAverageValue);
////                        fixtureAverageValue = 0;
////                        bFixtureValue = 0;
//                        countB = 0;
//                    }
//
//                    break;
//                case "C":
//                    countC++;
//                     cFixtureValue = cFixtureValue + dataPull.get(i).getOnMaxN();
//
//                    if (countC % 2 == 0) {
//                        DCACP.addcFixture(cFixtureValue);
////                        fixtureAverageValue = aFixtureValue + bFixtureValue + cFixtureValue + dFixtureValue / 120;
////                        DCACP.addfixtureAverage(fixtureAverageValue);
////                        fixtureAverageValue = 0;
////                        cFixtureValue = 0;
//                        countC = 0;
//                    }
//
//                    break;
//                case "D":
//                    countD++;
//                     dFixtureValue = dFixtureValue + dataPull.get(i).getOnMaxN();
//
//                    if (countD % 2 == 0) {
//                        DCACP.adddFixture(dFixtureValue);
//                        
//                        fixtureAverageValue = (aFixtureValue + bFixtureValue + cFixtureValue + dFixtureValue )/ 4;
//                        DCACP.addfixtureAverage(fixtureAverageValue);
//                        
//                        DateFormat dateFormat = new SimpleDateFormat("hh:mm");  
//                        fixtureTimeStamp = dateFormat.format(dataPull.get(i).getDate());
//                        
//                        fixtureAverageValue = 0;
//                        dFixtureValue = 0;
//                        countD = 0;
//                    }
//
//                default:
//                    System.out.println("no parameter was meet");
//            }
//
//        }
        DayCyclingAverageChartPoints DCACP2 = new DayCyclingAverageChartPoints();
        DCACP2.addaFixture(3.00);
        DCACP2.addbFixture(3.00);
        DCACP2.addcFixture(3.00);
        DCACP2.adddFixture(3.00);
        DCACP2.addfixtureAverage(3.00);
        return DCACP2;
    }

}
