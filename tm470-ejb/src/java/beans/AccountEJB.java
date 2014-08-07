/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

/**
 *
 * @author ashley
 */
@Named
@Stateless
public class AccountEJB {
    
    @Inject
    private EntityManager em;
    
    public Account findAccountById(String username) {
        return em.find(Account.class, username);
    }
    
}
