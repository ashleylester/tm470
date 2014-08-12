
package beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="parameter_view")
@NamedQuery(name="findAllParameters", query="SELECT p FROM Parameter p")
public class Parameter implements Serializable {
    
    @Id
    private String id;
    @Column(name = "elementgroup_id")
    private String elementGroupId;
    @Column(name = "element_id")
    private String elementId;
    @Column(name = "elementdetail_id")
    private String elementDetailId;
    @Column(name = "elementdetail")
    private String elementDetail;
    @Column(name = "element")
    private String element;
    @Column(name = "elementgroup")
    private String elementGroup;
    private String lifecycle;
    @Column(name = "unit_of_measurement")
    private String measurement;
    
    public Parameter() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getElementGroupId() {
        return elementGroupId;
    }

    public void setElementGroupId(String elementGroupId) {
        this.elementGroupId = elementGroupId;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getElementDetailId() {
        return elementDetailId;
    }

    public void setElementDetailId(String elementDetailId) {
        this.elementDetailId = elementDetailId;
    }

    public String getElementDetail() {
        return elementDetail;
    }

    public void setElementDetail(String elementDetail) {
        this.elementDetail = elementDetail;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getElementGroup() {
        return elementGroup;
    }

    public void setElementGroup(String elementGroup) {
        this.elementGroup = elementGroup;
    }

    public String getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }
    
}
