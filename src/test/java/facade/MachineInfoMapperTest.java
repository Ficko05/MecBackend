/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Mechineinfo;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.DayCyclingAverageChartPoints;

/**
 *
 * @author steven
 */
public class MachineInfoMapperTest {
    
    public MachineInfoMapperTest() {
    }
    
    @Before
    public void setUp() {
    }

   // @Test
//    public void testGetAll() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//        MachineInfoMapper machineMapper = new MachineInfoMapper(emf);
//        List<Mechineinfo> data = machineMapper.getAll();
//        //assertEquals(data.size(), 20);
//        assertEquals(true, true);
//        
//    }
    
}
