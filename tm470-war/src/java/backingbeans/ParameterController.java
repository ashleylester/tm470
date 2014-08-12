
package backingbeans;

import beans.ElementGroup;
import beans.ParameterEJB;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "parameterController")
@Dependent
public class ParameterController {

    @Inject
    private ParameterEJB parameterEJB;
    
    public ParameterController() {
    }
    
    public List<ElementGroup> getElementGroups() {
        
        return null;
    }
}
