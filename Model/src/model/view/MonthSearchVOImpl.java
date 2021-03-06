package model.view;

import model.service.AppModuleImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jun 10 12:15:35 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MonthSearchVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public MonthSearchVOImpl() {
    }


    /**
     * Returns the bind variable value for p_org_id.
     * @return bind variable value for p_org_id
     */
    public String getp_org_id() {
        return (String)getNamedWhereClauseParam("p_org_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_org_id.
     * @param value value to bind as p_org_id
     */
    public void setp_org_id(String value) {
        setNamedWhereClauseParam("p_org_id", value);
    }

    @Override
    public boolean setCurrentRow(Row row) {
//        System.out.println("==================== setCurrentRow =======================" );
//         MonthSearchVORowImpl rowImpl = (MonthSearchVORowImpl)row;
//         rowImpl.setCurrentMonthFromMonthList();
//         rowImpl.updateHolidayForHolidayCalendar();
     
      return super.setCurrentRow(row);
         
    }

    @Override
    public Row next() {
        System.out.println("==================== next() =======================" );
        
        Row nextRow =  super.next();        
        MonthSearchVORowImpl rowImpl = (MonthSearchVORowImpl)nextRow;
        rowImpl.setCurrentMonthFromMonthList();
        rowImpl.updateHolidayForHolidayCalendar();
        return nextRow;
    }

    @Override
    public Row previous() {
        
        System.out.println("==================== previous() =======================" );
        Row previousRow = super.previous();
        MonthSearchVORowImpl rowImpl = (MonthSearchVORowImpl)previousRow;
        rowImpl.setCurrentMonthFromMonthList();
        rowImpl.updateHolidayForHolidayCalendar();
        return previousRow;
    }
}
