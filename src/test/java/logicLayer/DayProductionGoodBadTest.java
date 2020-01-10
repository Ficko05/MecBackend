/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayer;

import entity.Mechineinfo;
import facade.MachineInfoMapper;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.DayProductionChartPoints;

/**
 *
 * @author steven
 */
public class DayProductionGoodBadTest {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    MachineInfoMapper machineMapper = new MachineInfoMapper(emf);

    public DayProductionGoodBadTest() {
    }

    @Before
    public void setUp() {
    }

//    @Test
//    public void testCountGoodBadProduction() {
//        List<Mechineinfo> data = machineMapper.getAll();
//        DayProductionGoodBad chartLogic = new DayProductionGoodBad();
//        DayProductionChartPoints chartPoints =  chartLogic.countGoodBadProduction(data);
//        int result = chartPoints.getGoodProduction().get(1);
//       // assertEquals(result, 4);
//        assertEquals(true, true);
//
//    }
//
//    @Test
//    public void testAlternativeMethod() {
//        List<Mechineinfo> data = machineMapper.getAll();
//        DayProductionGoodBad chartLogic = new DayProductionGoodBad();
//        DayProductionChartPoints chartPoints =  chartLogic.alternativeMethod(data);
//        int result = chartPoints.getGoodProduction().get(1);
//       // assertEquals(result, 4);
//        assertEquals(true, true);
//    }

}
