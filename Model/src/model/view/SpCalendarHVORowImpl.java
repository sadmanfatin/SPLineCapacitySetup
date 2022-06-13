package model.view;

import model.entity.SpCalendarHEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jun 12 12:36:13 BDT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SpCalendarHVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        MonthId {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getMonthId();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setMonthId((Number)value);
            }
        }
        ,
        MonthName {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getMonthName();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setMonthName((String)value);
            }
        }
        ,
        MonthNumber {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getMonthNumber();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setMonthNumber((Number)value);
            }
        }
        ,
        MonthSerial {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getMonthSerial();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setMonthSerial((Number)value);
            }
        }
        ,
        NumberOfDays {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getNumberOfDays();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setNumberOfDays((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        WeeklyHoliday {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getWeeklyHoliday();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setWeeklyHoliday((String)value);
            }
        }
        ,
        Year {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getYear();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setYear((Number)value);
            }
        }
        ,
        WorkingdayCount {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getWorkingdayCount();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setWorkingdayCount((Number)value);
            }
        }
        ,
        HolidayCount {
            public Object get(SpCalendarHVORowImpl obj) {
                return obj.getHolidayCount();
            }

            public void put(SpCalendarHVORowImpl obj, Object value) {
                obj.setHolidayCount((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(SpCalendarHVORowImpl object);

        public abstract void put(SpCalendarHVORowImpl object, Object value);

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

    public static final int MONTHID = AttributesEnum.MonthId.index();
    public static final int MONTHNAME = AttributesEnum.MonthName.index();
    public static final int MONTHNUMBER = AttributesEnum.MonthNumber.index();
    public static final int MONTHSERIAL = AttributesEnum.MonthSerial.index();
    public static final int NUMBEROFDAYS = AttributesEnum.NumberOfDays.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int WEEKLYHOLIDAY = AttributesEnum.WeeklyHoliday.index();
    public static final int YEAR = AttributesEnum.Year.index();
    public static final int WORKINGDAYCOUNT = AttributesEnum.WorkingdayCount.index();
    public static final int HOLIDAYCOUNT = AttributesEnum.HolidayCount.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SpCalendarHVORowImpl() {
    }

    /**
     * Gets SpCalendarHEO entity object.
     * @return the SpCalendarHEO
     */
    public SpCalendarHEOImpl getSpCalendarHEO() {
        return (SpCalendarHEOImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for MONTH_ID using the alias name MonthId.
     * @return the MONTH_ID
     */
    public Number getMonthId() {
        return (Number) getAttributeInternal(MONTHID);
    }

    /**
     * Sets <code>value</code> as attribute value for MONTH_ID using the alias name MonthId.
     * @param value value to set the MONTH_ID
     */
    public void setMonthId(Number value) {
        setAttributeInternal(MONTHID, value);
    }

    /**
     * Gets the attribute value for MONTH_NAME using the alias name MonthName.
     * @return the MONTH_NAME
     */
    public String getMonthName() {
        return (String) getAttributeInternal(MONTHNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for MONTH_NAME using the alias name MonthName.
     * @param value value to set the MONTH_NAME
     */
    public void setMonthName(String value) {
        setAttributeInternal(MONTHNAME, value);
    }

    /**
     * Gets the attribute value for MONTH_NUMBER using the alias name MonthNumber.
     * @return the MONTH_NUMBER
     */
    public Number getMonthNumber() {
        return (Number) getAttributeInternal(MONTHNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for MONTH_NUMBER using the alias name MonthNumber.
     * @param value value to set the MONTH_NUMBER
     */
    public void setMonthNumber(Number value) {
        setAttributeInternal(MONTHNUMBER, value);
    }

    /**
     * Gets the attribute value for MONTH_SERIAL using the alias name MonthSerial.
     * @return the MONTH_SERIAL
     */
    public Number getMonthSerial() {
        return (Number) getAttributeInternal(MONTHSERIAL);
    }

    /**
     * Sets <code>value</code> as attribute value for MONTH_SERIAL using the alias name MonthSerial.
     * @param value value to set the MONTH_SERIAL
     */
    public void setMonthSerial(Number value) {
        setAttributeInternal(MONTHSERIAL, value);
    }

    /**
     * Gets the attribute value for NUMBER_OF_DAYS using the alias name NumberOfDays.
     * @return the NUMBER_OF_DAYS
     */
    public Number getNumberOfDays() {
        return (Number) getAttributeInternal(NUMBEROFDAYS);
    }

    /**
     * Sets <code>value</code> as attribute value for NUMBER_OF_DAYS using the alias name NumberOfDays.
     * @param value value to set the NUMBER_OF_DAYS
     */
    public void setNumberOfDays(Number value) {
        setAttributeInternal(NUMBEROFDAYS, value);
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
     * Gets the attribute value for WEEKLY_HOLIDAY using the alias name WeeklyHoliday.
     * @return the WEEKLY_HOLIDAY
     */
    public String getWeeklyHoliday() {
        return (String) getAttributeInternal(WEEKLYHOLIDAY);
    }

    /**
     * Sets <code>value</code> as attribute value for WEEKLY_HOLIDAY using the alias name WeeklyHoliday.
     * @param value value to set the WEEKLY_HOLIDAY
     */
    public void setWeeklyHoliday(String value) {
        setAttributeInternal(WEEKLYHOLIDAY, value);
    }

    /**
     * Gets the attribute value for YEAR using the alias name Year.
     * @return the YEAR
     */
    public Number getYear() {
        return (Number) getAttributeInternal(YEAR);
    }

    /**
     * Sets <code>value</code> as attribute value for YEAR using the alias name Year.
     * @param value value to set the YEAR
     */
    public void setYear(Number value) {
        setAttributeInternal(YEAR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WorkingdayCount.
     * @return the WorkingdayCount
     */
    public Number getWorkingdayCount() {
        return (Number) getAttributeInternal(WORKINGDAYCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WorkingdayCount.
     * @param value value to set the  WorkingdayCount
     */
    public void setWorkingdayCount(Number value) {
        setAttributeInternal(WORKINGDAYCOUNT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HolidayCount.
     * @return the HolidayCount
     */
    public Number getHolidayCount() {
        return (Number) getAttributeInternal(HOLIDAYCOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HolidayCount.
     * @param value value to set the  HolidayCount
     */
    public void setHolidayCount(Number value) {
        setAttributeInternal(HOLIDAYCOUNT, value);
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
