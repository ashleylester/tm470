
package backingbeans;

import beans.Account;
import beans.AccountEJB;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "accountController")
@SessionScoped
public class AccountController implements Serializable {
    
    @Inject
    private AccountEJB accountEJB;
    private Account account = new Account();
    
    public AccountController() {
    }
    
    public Account getAccount() {
        return account;
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
