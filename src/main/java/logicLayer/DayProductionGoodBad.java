package logicLayer;

import entity.Mechineinfo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javafx.util.converter.LocalDateStringConverter;
import org.eclipse.persistence.jpa.jpql.parser.DateTime;
import utils.DayProductionChartPoints;

public class DayProductionGoodBad {


    public DayProductionGoodBad() {

    }

    public DayProductionChartPoints countGoodBadProduction(List<Mechineinfo> dataPull) {
        boolean bool = true;
        LocalDateTime myDate = LocalDateTime.now().withHour(6).withMinute(0).withSecond(0);
        Integer good = 0;
        Integer bad = 0;
        DayProductionChartPoints DPCP = new DayProductionChartPoints();

        for (int i = 0; i < dataPull.size() - 1; i++) {
            if (dataPull.get(i).getDate().isAfter(myDate))/*IF dataPull.get(i).getDate > dateTime???*/ {
                for (int j = i; j < dataPull.size() - 1; j++) {
                    if (dataPull.get(j).getDate().isBefore(myDate.plusHours(1)))/*IF dataPull.get(i).getDate > dateTime(x hour)*/ {
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
                        myDate.plusHours(1);
                    }

                }
                break; //not sure if right
            }
        }
        return DPCP;
    }

}
