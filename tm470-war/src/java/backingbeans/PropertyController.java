
package backingbeans;

import beans.Property;
import beans.PropertyEJB;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "propertyController")
@RequestScoped
public class PropertyController {

    public PropertyController() {
    }

    @Inject
    private PropertyEJB propertyEJB;
    Property property = new Property();
    
    public Property getProperty() {
        return property;
    }
    
    public String createProperty() {
        property.setCreatedAt(new Date());
        propertyEJB.createProperty(property);
        FacesContext.getCurrentInstance().addMessage("createPropertyForm:confirmPropertyCreation", 
                new FacesMessage(FacesMessage.SEVERITY_INFO, 
                        "Property Created", "Property " + property.getUprn() + " has been created."));
        return "createProperty.xhtml";
    }
    
}
