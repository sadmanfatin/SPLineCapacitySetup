package model.view;

import model.entity.SpLineCapacityHEOImpl;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 06 13:19:06 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpLineCapacityHVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CapacityHId {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getCapacityHId();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setCapacityHId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        NoOfLine {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getNoOfLine();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setNoOfLine((Number)value);
            }
        }
        ,
        EffStartDate {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getEffStartDate();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setEffStartDate((Date)value);
            }
        }
        ,
        EffEndDate {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getEffEndDate();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setEffEndDate((Date)value);
            }
        }
        ,
        CreationDate {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        LastUpdatedDate {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getLastUpdatedDate();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setLastUpdatedDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(SpLineCapacityHVORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(SpLineCapacityHVORowImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpLineCapacityHVORowImpl object);

        public abstract void put(SpLineCapacityHVORowImpl object,
                                 Object value);

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
    public SpLineCapacityHVORowImpl() {
    }

    /**
     * Gets SpLineCapacityHEO entity object.
     * @return the SpLineCapacityHEO
     */
    public SpLineCapacityHEOImpl getSpLineCapacityHEO() {
        return (SpLineCapacityHEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for CAPACITY_H_ID using the alias name CapacityHId.
     * @return the CAPACITY_H_ID
     */
    public Number getCapacityHId() {
        return (Number) getAttributeInternal(CAPACITYHID);
    }

    /**
     * Sets <code>value</code> as attribute value for CAPACITY_H_ID using the alias name CapacityHId.
     * @param value value to set the CAPACITY_H_ID
     */
    public void setCapacityHId(Number value) {
        setAttributeInternal(CAPACITYHID, value);
    }

    /**
     * Gets the attribute value for ORG_ID using the alias name OrgId.
     * @return the ORG_ID
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as attribute value for ORG_ID using the alias name OrgId.
     * @param value value to set the ORG_ID
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for NO_OF_LINE using the alias name NoOfLine.
     * @return the NO_OF_LINE
     */
    public Number getNoOfLine() {
        return (Number) getAttributeInternal(NOOFLINE);
    }

    /**
     * Sets <code>value</code> as attribute value for NO_OF_LINE using the alias name NoOfLine.
     * @param value value to set the NO_OF_LINE
     */
    public void setNoOfLine(Number value) {
        setAttributeInternal(NOOFLINE, value);
    }

    /**
     * Gets the attribute value for EFF_START_DATE using the alias name EffStartDate.
     * @return the EFF_START_DATE
     */
    public Date getEffStartDate() {
        return (Date) getAttributeInternal(EFFSTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFF_START_DATE using the alias name EffStartDate.
     * @param value value to set the EFF_START_DATE
     */
    public void setEffStartDate(Date value) {
        setAttributeInternal(EFFSTARTDATE, value);
    }

    /**
     * Gets the attribute value for EFF_END_DATE using the alias name EffEndDate.
     * @return the EFF_END_DATE
     */
    public Date getEffEndDate() {
        return (Date) getAttributeInternal(EFFENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for EFF_END_DATE using the alias name EffEndDate.
     * @param value value to set the EFF_END_DATE
     */
    public void setEffEndDate(Date value) {
        setAttributeInternal(EFFENDDATE, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Date getCreationDate() {
        return (Date) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
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
}
