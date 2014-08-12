
package beans;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@Stateless
public class ParameterEJB {

    @Inject
    private EntityManager em;
    
    public List<Parameter> findAllParameters() {
        return em.createNamedQuery("findAllParameters", Parameter.class).getResultList();
    }
    
}
