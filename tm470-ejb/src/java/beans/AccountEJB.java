
package beans;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@Stateless
public class AccountEJB {
    
    @Inject
    private EntityManager em;
    
    public Account findAccountById(String username) {
        return em.find(Account.class, username);
    }
    
}
