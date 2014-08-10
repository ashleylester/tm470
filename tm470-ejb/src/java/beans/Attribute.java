
package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Attribute implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @ManyToOne
    private Property uprn;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "elementdetail_id")
    private ElementDetail elementDetail;
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
    
    public Attribute() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Property getUprn() {
        return uprn;
    }

    public void setUprn(Property uprn) {
        this.uprn = uprn;
    }

    public ElementDetail getElementDetail() {
        return elementDetail;
    }

    public void setElementDetail(ElementDetail elementDetail) {
        this.elementDetail = elementDetail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
    
    
}
