package model.entity;

import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 05 18:18:32 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpLineCapacityLEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CapacityLId {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getCapacityLId();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setCapacityLId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        DateVal {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getDateVal();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setDateVal((Date)value);
            }
        }
        ,
        LineNo {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getLineNo();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setLineNo((Number)value);
            }
        }
        ,
        WorkingHour {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getWorkingHour();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setWorkingHour((Number)value);
            }
        }
        ,
        MonthSerial {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getMonthSerial();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setMonthSerial((Number)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(SpLineCapacityLEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(SpLineCapacityLEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpLineCapacityLEOImpl object);

        public abstract void put(SpLineCapacityLEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int CAPACITYLID = AttributesEnum.CapacityLId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int DATEVAL = AttributesEnum.DateVal.index();
    public static final int LINENO = AttributesEnum.LineNo.index();
    public static final int WORKINGHOUR = AttributesEnum.WorkingHour.index();
    public static final int MONTHSERIAL = AttributesEnum.MonthSerial.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpLineCapacityLEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.SpLineCapacityLEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for CapacityLId, using the alias name CapacityLId.
     * @return the CapacityLId
     */
    public Number getCapacityLId() {
        return (Number)getAttributeInternal(CAPACITYLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CapacityLId.
     * @param value value to set the CapacityLId
     */
    public void setCapacityLId(Number value) {
        setAttributeInternal(CAPACITYLID, value);
    }

    /**
     * Gets the attribute value for OrgId, using the alias name OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number)getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrgId.
     * @param value value to set the OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for DateVal, using the alias name DateVal.
     * @return the DateVal
     */
    public Date getDateVal() {
        return (Date)getAttributeInternal(DATEVAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateVal.
     * @param value value to set the DateVal
     */
    public void setDateVal(Date value) {
        setAttributeInternal(DATEVAL, value);
    }

    /**
     * Gets the attribute value for LineNo, using the alias name LineNo.
     * @return the LineNo
     */
    public Number getLineNo() {
        return (Number)getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineNo.
     * @param value value to set the LineNo
     */
    public void setLineNo(Number value) {
        setAttributeInternal(LINENO, value);
    }

    /**
     * Gets the attribute value for WorkingHour, using the alias name WorkingHour.
     * @return the WorkingHour
     */
    public Number getWorkingHour() {
        return (Number)getAttributeInternal(WORKINGHOUR);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkingHour.
     * @param value value to set the WorkingHour
     */
    public void setWorkingHour(Number value) {
        setAttributeInternal(WORKINGHOUR, value);
    }

    /**
     * Gets the attribute value for MonthSerial, using the alias name MonthSerial.
     * @return the MonthSerial
     */
    public Number getMonthSerial() {
        return (Number)getAttributeInternal(MONTHSERIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for MonthSerial.
     * @param value value to set the MonthSerial
     */
    public void setMonthSerial(Number value) {
        setAttributeInternal(MONTHSERIAL, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date)getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @param capacityLId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number capacityLId) {
        return new Key(new Object[]{capacityLId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);

        oracle.jbo.server.SequenceImpl s =
        new oracle.jbo.server.SequenceImpl("SP_LINE_CAPACITY_SETUP_L_S",  getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        this.setCapacityLId(sVal);
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Map sessionScope = ADFContext.getCurrent().getSessionScope();
             String user = (String)sessionScope.get("userId");
             
        //        System.out.println("Document No -->" + getSrNoString());
              
             if (DML_UPDATE == operation) {
                 try {
                     setLastUpdatedDate((Date)Date.getCurrentDate());
                     setLastUpdatedBy(new oracle.jbo.domain.Number(user));              
                     
                 } catch (SQLException f) {
                     f.printStackTrace();
                 }
             }
         
        super.doDML(operation, e);
    }
}
