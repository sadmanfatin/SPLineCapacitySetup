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
// ---    Sun Jun 05 18:26:49 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpLineCapacityHEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CapacityHId {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getCapacityHId();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setCapacityHId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        NoOfLine {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getNoOfLine();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setNoOfLine((Number)value);
            }
        }
        ,
        EffStartDate {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getEffStartDate();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setEffStartDate((Date)value);
            }
        }
        ,
        EffEndDate {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getEffEndDate();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setEffEndDate((Date)value);
            }
        }
        ,
        CreationDate {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(SpLineCapacityHEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(SpLineCapacityHEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpLineCapacityHEOImpl object);

        public abstract void put(SpLineCapacityHEOImpl object, Object value);

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
    public static final int CAPACITYHID = AttributesEnum.CapacityHId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int NOOFLINE = AttributesEnum.NoOfLine.index();
    public static final int EFFSTARTDATE = AttributesEnum.EffStartDate.index();
    public static final int EFFENDDATE = AttributesEnum.EffEndDate.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpLineCapacityHEOImpl() {
    }

    /**
     * Gets the attribute value for CapacityHId, using the alias name CapacityHId.
     * @return the CapacityHId
     */
    public Number getCapacityHId() {
        return (Number)getAttributeInternal(CAPACITYHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CapacityHId.
     * @param value value to set the CapacityHId
     */
    public void setCapacityHId(Number value) {
        setAttributeInternal(CAPACITYHID, value);
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
     * Gets the attribute value for NoOfLine, using the alias name NoOfLine.
     * @return the NoOfLine
     */
    public Number getNoOfLine() {
        return (Number)getAttributeInternal(NOOFLINE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoOfLine.
     * @param value value to set the NoOfLine
     */
    public void setNoOfLine(Number value) {
        setAttributeInternal(NOOFLINE, value);
    }

    /**
     * Gets the attribute value for EffStartDate, using the alias name EffStartDate.
     * @return the EffStartDate
     */
    public Date getEffStartDate() {
        return (Date)getAttributeInternal(EFFSTARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffStartDate.
     * @param value value to set the EffStartDate
     */
    public void setEffStartDate(Date value) {
        setAttributeInternal(EFFSTARTDATE, value);
    }

    /**
     * Gets the attribute value for EffEndDate, using the alias name EffEndDate.
     * @return the EffEndDate
     */
    public Date getEffEndDate() {
        return (Date)getAttributeInternal(EFFENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffEndDate.
     * @param value value to set the EffEndDate
     */
    public void setEffEndDate(Date value) {
        setAttributeInternal(EFFENDDATE, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
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
     * @param capacityHId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number capacityHId) {
        return new Key(new Object[]{capacityHId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.SpLineCapacityHEO");
        }
        return mDefinitionObject;
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {

        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =
        new oracle.jbo.server.SequenceImpl("SP_LINE_CAPACITY_SETUP_H_S",  getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        this.setCapacityHId(sVal);
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
             } else if (DML_INSERT == operation) {

                 try {
                   
                     setCreationDate((Date)Date.getCurrentDate());
                     setCreatedBy(new oracle.jbo.domain.Number(user));

                 } catch (SQLException f) {
                     f.printStackTrace();
                 }
             }
        //
         
        super.doDML(operation, e);
    }
}
