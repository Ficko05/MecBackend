package entity;

import javax.naming.AuthenticationException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class UserFacade {
    
    //Default EntityManagerFactory
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    private static final UserFacade instance = new UserFacade();
    
    
    private UserFacade(){}
    
    public static UserFacade getInstance(){
        return instance;
    }
    
    public User getVeryfiedUser(String username, String password) throws AuthenticationException {
        EntityManager em = emf.createEntityManager();
        User user = null;
        boolean checker;
        try {
            //user = em.find(User.class, username);
            //TypedQuery<User> query = em.createNamedQuery("User.findByUserName", User.class);
            
            TypedQuery<User> query = em.createNamedQuery("User.loginUser", User.class);
            
            query.setParameter("userName", username);
            //query.setParameter("userPassword", password);
            
            user = query.getSingleResult();
            
           checker = user.verifyPassword(password);
            
           // user.verifyPassword(password);
            
           if(!checker){
            throw new AuthenticationException("Invalid user name or password");
           }
 
//            if (user == null || !user.verifyPassword(password)) {
//                throw new AuthenticationException("Invalid user name or password");
//            }
            
        } finally {
            em.close();
        }
        return user;
    }
}
