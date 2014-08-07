
package backingbeans;

import beans.Account;
import beans.AccountEJB;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "accountController")
@Dependent
public class AccountController {
    
    @Inject
    private AccountEJB accountEJB;
    private Account account = new Account();
    
    public AccountController() {
    }
    
    public String authenticate() {
        account = accountEJB.findAccountById(account.getUsername());
        if (account == null) {
            return "login.xhtml";
        }
        else {
            return "home.xhtml";
        }
    }
    
}
