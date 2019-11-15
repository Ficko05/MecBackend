
package facade;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import entity.Mechineinfo;

/**
 *
 * @author Ficko
 */
public class MachineInfoMapper {
    
    
     EntityManagerFactory emf;

    public MachineInfoMapper(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public List<Mechineinfo> getAll() {

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        TypedQuery<Mechineinfo> query = em.createNamedQuery("Mechineinfo.findAll", Mechineinfo.class);

        List<Mechineinfo> MachineInfos = query.getResultList();

        return MachineInfos;

    }
    
}
