import javax.faces.event.ActionEvent;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class ManagedBean {
    public ManagedBean() {
    }


    public void save(ActionEvent actionEvent) {
        // Add event code here...
        
        save();
    }
    
    
    public void save() {
        // Add event code here...
        
        // call from here
          OperationBinding ob = executeOperation("Commit");
          ob.execute();
    }
    
    
    /*****Generic Method to Get BindingContainer**/
        public BindingContainer getBindings() {
            return BindingContext.getCurrent().getCurrentBindingsEntry();
        }

        /**
         * Generic Method to execute operation
         * */
        public  OperationBinding  executeOperation (String operation) {
            OperationBinding ob =
                getBindings().getOperationBinding(operation);
            
           return  ob;

        }

          
            
}
