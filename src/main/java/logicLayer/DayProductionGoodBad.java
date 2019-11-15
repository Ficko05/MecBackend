package logicLayer;

import entity.Mechineinfo;
import java.util.Date;
import java.util.List;
import utils.DayProductionChartPoints;

public class DayProductionGoodBad {

    private List<Mechineinfo> dataPull;

    public DayProductionGoodBad(List<Mechineinfo> dataPull) {
        this.dataPull = dataPull;
    }

    public DayProductionChartPoints countGoodBadProduction() {
        boolean bool = true;
        Date dateTime;
        Integer good = 0;
        Integer bad = 0;
        DayProductionChartPoints DPCP = new DayProductionChartPoints();

        for (int i = 0; i < dataPull.size() - 1; i++) {
            if (bool)/*IF dataPull.get(i).getDate > dateTime???*/ {
                for (int j = i; j < dataPull.size() - 1; j++) {
                    if (bool)/*IF dataPull.get(i).getDate > dateTime(x hour)*/ {
                        if (dataPull.get(j).getStatus() == 1) {
                            good++;
                        } else {
                            bad++;
                        }
                    } else {
                        DPCP.addGood(good);
                        DPCP.addBad(bad);
                        good = 0;
                        bad = 0;
                        //dateTime + 1 hour
                    }

                }
                break; //not sure if right
            }
        }
        return DPCP;
    }

}
