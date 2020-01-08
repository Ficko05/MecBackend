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

    int badProdAt06, badProdAt07, badProdAt08, badProdAt09;
    int badProdAt10, badProdAt11, badProdAt12, badProdAt13, badProdAt14, badProdAt15, badProdAt16, badProdAt17, badProdAt18, badProdAt19;
    int badProdAt20, badProdAt21, badProdAt22, badProdAt23, badProdAt00;
    int goodProdAt06, goodProdAt07, goodProdAt08, goodProdAt09;
    int goodProdAt10, goodProdAt11, goodProdAt12, goodProdAt13, goodProdAt14, goodProdAt15, goodProdAt16, goodProdAt17, goodProdAt18, goodProdAt19;
    int goodProdAt20, goodProdAt21, goodProdAt22, goodProdAt23, goodProdAt00;

    public DayProductionGoodBad() {

    }

    public DayProductionChartPoints countGoodBadProduction(List<Mechineinfo> dataPull) {
        LocalDateTime myDate = LocalDateTime.now().withHour(6).withMinute(0).withSecond(0);
        myDate = myDate.withYear(2019).withMonth(12).withDayOfMonth(10);//TEST
        System.out.println(myDate.toString());//TEST
        DayProductionChartPoints DPCP = new DayProductionChartPoints();

        for (int i = 0; i < dataPull.size(); i++) {
            if (dataPull.get(i).getDate().isAfter(myDate))/*IF dataPull.get(i).getDate > dateTime???*/ {

                switch (dataPull.get(i).getDate().getHour()) {

                    case 6:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt06++;
                        } else {
                            badProdAt06++;
                        }
                        break;

                    case 7:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt07++;
                        } else {
                            badProdAt07++;
                        }
                        break;

                    case 8:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt08++;
                        } else {
                            badProdAt08++;
                        }
                        break;

                    case 9:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt09++;
                        } else {
                            badProdAt09++;
                        }
                        break;

                    case 10:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt10++;
                        } else {
                            badProdAt10++;
                        }
                        break;

                    case 11:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt11++;
                        } else {
                            badProdAt11++;
                        }
                        break;

                    case 12:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt12++;
                        } else {
                            badProdAt12++;
                        }
                        break;

                    case 13:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt13++;
                        } else {
                            badProdAt13++;
                        }
                        break;

                    case 14:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt14++;
                        } else {
                            badProdAt14++;
                        }
                        break;

                    case 15:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt15++;
                        } else {
                            badProdAt15++;
                        }
                        break;

                    case 16:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt16++;
                        } else {
                            badProdAt16++;
                        }
                        break;

                    case 17:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt17++;
                        } else {
                            badProdAt17++;
                        }
                        break;

                    case 18:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt18++;
                        } else {
                            badProdAt18++;
                        }
                        break;

                    case 19:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt19++;
                        } else {
                            badProdAt19++;
                        }
                        break;

                    case 20:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt20++;
                        } else {
                            badProdAt20++;
                        }
                        break;

                    case 21:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt21++;
                        } else {
                            badProdAt21++;
                        }
                        break;

                    case 22:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt22++;
                        } else {
                            badProdAt22++;
                        }
                        break;

                    case 23:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt23++;
                        } else {
                            badProdAt23++;
                        }
                        break;

                    case 00:
                        if (dataPull.get(i).getStatus() == 1) {
                            goodProdAt00++;
                        } else {
                            badProdAt00++;
                        }
                        break;

                    default:
                        break;
                }

//                for (int j = i; j < dataPull.size() - 1; j++) {
//                    if (dataPull.get(j).getDate().isBefore(myDate.plusHours(1)))/*IF dataPull.get(i).getDate > dateTime(x hour)*/ {
//                        if (dataPull.get(j).getStatus() == 1) {
//                            good++;
//                        } else {
//                            bad++;
//                        }
//                    } else {
//                        DPCP.addGood(good);
//                        DPCP.addBad(bad);
//                        good = 0;
//                        bad = 0;
//                        myDate.plusHours(1);
//                    }
//
//                }
//                break; //not sure if right
            }
        }
        DPCP.addGood(goodProdAt06);
        DPCP.addGood(goodProdAt07);
        DPCP.addGood(goodProdAt08);
        DPCP.addGood(goodProdAt09);
        DPCP.addGood(goodProdAt10);
        DPCP.addGood(goodProdAt11);
        DPCP.addGood(goodProdAt12);
        DPCP.addGood(goodProdAt13);
        DPCP.addGood(goodProdAt14);
        DPCP.addGood(goodProdAt15);
        DPCP.addGood(goodProdAt16);
        DPCP.addGood(goodProdAt17);
        DPCP.addGood(goodProdAt18);
        DPCP.addGood(goodProdAt19);
        DPCP.addGood(goodProdAt20);
        DPCP.addGood(goodProdAt21);
        DPCP.addGood(goodProdAt22);
        DPCP.addGood(goodProdAt23);
        DPCP.addGood(goodProdAt00);
        DPCP.addBad(badProdAt06);
        DPCP.addBad(badProdAt07);
        DPCP.addBad(badProdAt08);
        DPCP.addBad(badProdAt09);
        DPCP.addBad(badProdAt10);
        DPCP.addBad(badProdAt11);
        DPCP.addBad(badProdAt12);
        DPCP.addBad(badProdAt13);
        DPCP.addBad(badProdAt14);
        DPCP.addBad(badProdAt15);
        DPCP.addBad(badProdAt16);
        DPCP.addBad(badProdAt17);
        DPCP.addBad(badProdAt18);
        DPCP.addBad(badProdAt19);
        DPCP.addBad(badProdAt20);
        DPCP.addBad(badProdAt21);
        DPCP.addBad(badProdAt22);
        DPCP.addBad(badProdAt23);
        DPCP.addBad(badProdAt00);
//        System.out.println(myDate);
        return DPCP;
    }

    public DayProductionChartPoints alternativeMethod(List<Mechineinfo> dataPull) {
        LocalDateTime myDate = LocalDateTime.now().withHour(6).withMinute(0).withSecond(0);
        myDate = myDate.withYear(2019).withMonth(12).withDayOfMonth(10);//TEST
        DayProductionChartPoints DPCP = new DayProductionChartPoints();
        int Good = 0;
        int Bad = 0;
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < dataPull.size(); i++) {
                if (dataPull.get(i).getDate().isAfter(myDate) && dataPull.get(i).getDate().isBefore(myDate.plusHours(1))) {
                    if (dataPull.get(i).getStatus() == 1) {
                        Good++;
                    } else {
                        Bad++;
                    }
                }
            }
            DPCP.addGood(Good);
            DPCP.addBad(Bad);
            Good = 0;
            Bad = 0;
            myDate = myDate.plusHours(1);
        }

        return DPCP;
    }
}
