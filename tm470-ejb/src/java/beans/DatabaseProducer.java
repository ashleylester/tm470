
package beans;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {
    
    @Produces
    @PersistenceContext(name = "tm470-ejbPU")
    private EntityManager em;
    
}
