
package beans;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@Stateless
public class PropertyEJB {

    @Inject
    private EntityManager em;
    
    public Property createProperty(Property property) {
        em.persist(property);
        return property;
    }
    
}
