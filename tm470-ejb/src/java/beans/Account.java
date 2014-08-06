
package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Account implements Serializable {
    
    @Id
    private String username;
    @ManyToOne
    private Account approvedBy;
    @NotNull
    private String password;
    @NotNull
    private String name;
    @NotNull
    @Column(name = "is_superuser")
    private boolean isSuperuser;
    @NotNull
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    
    public Account() {
    }
    
    public Account(String username, String password, String name, boolean isSuperuser, Date createdAt) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.isSuperuser = isSuperuser;
        this.createdAt = createdAt;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isSuperuser() {
        return isSuperuser;
    }
    
    public void setSuperuser(boolean superuser) {
        this.isSuperuser = superuser;
    }
    
}
