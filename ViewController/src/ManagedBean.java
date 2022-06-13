import java.sql.CallableStatement;


import java.sql.Date;

import java.util.Calendar;

import java.util.Locale;

import javax.faces.event.ActionEvent;

import javax.faces.event.PhaseEvent;

import model.service.AppModuleImpl;

import model.view.MonthSearchVOImpl;

import model.view.MonthSearchVORowImpl;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanRadio;
import oracle.adf.view.rich.component.rich.input.RichSelectManyCheckbox;
import oracle.adf.view.rich.component.rich.input.RichSelectManyChoice;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class ManagedBean {
    private RichSelectManyChoice linesForUpdateWh;
    private RichInputDate startDateForUpdatingWh;
    private RichInputText updatingWh;
    private RichInputDate endDateForUpdatingWh;
    private RichSelectManyCheckbox multiSelectCheckBox;
    private RichSelectBooleanRadio allLineUpdateRadio;
    private RichSelectBooleanCheckbox selectAllLines;

    public ManagedBean() {
    }
    AppModuleImpl appM = getAppModuleImpl();

    public AppModuleImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("AppModuleDataControl"); // Name of application module in datacontrolBinding.cpx
        AppModuleImpl appM = (AppModuleImpl)dc.getDataProvider();
        return appM;
    }
    
    public void onPageLoad(PhaseEvent phaseEvent) {
        // Add event code here...

        if (!AdfFacesContext.getCurrentInstance().isPostback()) {

           //  System.out.println("========================== in on page load mmm  ====================== ");
         
             setCurrentMonthFromList();   
             
             updateHolidayOfHolidayCalendar();
             
        
        }

    }
    
    private void setCurrentMonthFromList() {    
           
      //   System.out.println("  ========================== in setCurrentMonth()     ==========================" );

           ViewObject searchVo = appM.getMonthSearchVO1();
           Row currentMonthRow = null  ;
                                

           Calendar mCalendar = Calendar.getInstance();    
                  String month = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
                  
                    Integer year = Calendar.getInstance().get(Calendar.YEAR);
                    
           currentMonthRow = searchVo.getRow(new Key(new Object[]{month, year}));       
               
           searchVo.setCurrentRow(currentMonthRow);
   
           
           
       }
  
    private void updateHolidayOfHolidayCalendar() {

        ViewObject vo = appM.getMonthSearchVO1();
       MonthSearchVORowImpl currentRow ;      
        currentRow = (MonthSearchVORowImpl)vo.getCurrentRow();
        
        currentRow.updateHolidayForHolidayCalendar();
              
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


    public void setLinesForUpdateWh(RichSelectManyChoice linesForUpdateWh) {
        this.linesForUpdateWh = linesForUpdateWh;
    }

    public RichSelectManyChoice getLinesForUpdateWh() {
        return linesForUpdateWh;
    }

    public void setStartDateForUpdatingWh(RichInputDate startDateForUpdatingWh) {
        this.startDateForUpdatingWh = startDateForUpdatingWh;
    }

    public RichInputDate getStartDateForUpdatingWh() {
        return startDateForUpdatingWh;
    }

    public void setUpdatingWh(RichInputText updatingWh) {
        this.updatingWh = updatingWh;
    }

    public RichInputText getUpdatingWh() {
        return updatingWh;
    }

    public void setEndDateForUpdatingWh(RichInputDate endDateForUpdatingWh) {
        this.endDateForUpdatingWh = endDateForUpdatingWh;
    }

    public RichInputDate getEndDateForUpdatingWh() {
        return endDateForUpdatingWh;
    }

    public void updateWorkingHour(ActionEvent actionEvent) {
        // Add event code here...
    //ViewObject lineVo  = appM.getLineNoLOV1();
      String orgId = (String)appM.getMonthSearchVO1().getCurrentRow().getAttribute("OrgId");
      String workingHour = (String)this.getUpdatingWh().getValue();
      java.util.Date startDate = (java.util.Date)this.getStartDateForUpdatingWh().getValue();
      java.util.Date endDate = (java.util.Date) this.getEndDateForUpdatingWh().getValue();
      Boolean allLines = (Boolean)this.getSelectAllLines().getValue();
      String lineNo ;

      
      if(allLines ){
          lineNo = "-1" ; // -1 for all lines           
          updateLineWorkingHour(orgId, lineNo , startDate , endDate ,  workingHour ) ;                  
      }
      
      else{
          
          ViewObject lineVo = appM.getLineNoLOV1();
          lineVo.setRangeSize(100);
          Row[] lineRows = lineVo.getAllRowsInRange();
          
          for(Row lineRow : lineRows){
              if(lineRow.getAttribute("SelectLine") != null && lineRow.getAttribute("SelectLine").toString().equals("y") ){
                  lineNo = (String)lineRow.getAttribute("Line");              
                  updateLineWorkingHour(orgId, lineNo , startDate , endDate ,  workingHour ) ;           
              }                            
          }                   
      }
        
      appM.getMonthWiseDailyWorkingHourVO1().executeQuery();
    }

   

    public void setAllLineUpdateRadio(RichSelectBooleanRadio allLineUpdateRadio) {
        this.allLineUpdateRadio = allLineUpdateRadio;
    }

    public RichSelectBooleanRadio getAllLineUpdateRadio() {
        return allLineUpdateRadio;
    }

    public void setSelectAllLines(RichSelectBooleanCheckbox selectAllLines) {
        this.selectAllLines = selectAllLines;
    }

    public RichSelectBooleanCheckbox getSelectAllLines() {
        return selectAllLines;
    }

    private void updateLineWorkingHour(String orgId, String lineNo, java.util.Date startDate, java.util.Date endDate, String workingHour) {
        
        String statement = "BEGIN APPS.SP_LINE_UPDATE_WH(:1, :2, :3, :4, :5); END;";
        CallableStatement cs =  appM.getDBTransaction().createCallableStatement(statement, 1);
        
        try {
            cs.setInt(1, Integer.parseInt(orgId));
            cs.setInt(2, Integer.parseInt(lineNo));
            cs.setDate(3, new java.sql.Date( startDate.getTime()));
            cs.setDate(4,new java.sql.Date( endDate.getTime()));
            cs.setInt(5, Integer.parseInt(workingHour));
            cs.execute();
        }
        catch(Exception e){
           e.printStackTrace() ;
        }  
        
        
    }
}
