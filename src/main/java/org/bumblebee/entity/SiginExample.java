package org.bumblebee.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SiginExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public SiginExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSiginIdIsNull() {
            addCriterion("sigin_id is null");
            return (Criteria) this;
        }

        public Criteria andSiginIdIsNotNull() {
            addCriterion("sigin_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiginIdEqualTo(Integer value) {
            addCriterion("sigin_id =", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdNotEqualTo(Integer value) {
            addCriterion("sigin_id <>", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdGreaterThan(Integer value) {
            addCriterion("sigin_id >", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sigin_id >=", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdLessThan(Integer value) {
            addCriterion("sigin_id <", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdLessThanOrEqualTo(Integer value) {
            addCriterion("sigin_id <=", value, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdIn(List<Integer> values) {
            addCriterion("sigin_id in", values, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdNotIn(List<Integer> values) {
            addCriterion("sigin_id not in", values, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdBetween(Integer value1, Integer value2) {
            addCriterion("sigin_id between", value1, value2, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sigin_id not between", value1, value2, "siginId");
            return (Criteria) this;
        }

        public Criteria andSiginDateIsNull() {
            addCriterion("sigin_date is null");
            return (Criteria) this;
        }

        public Criteria andSiginDateIsNotNull() {
            addCriterion("sigin_date is not null");
            return (Criteria) this;
        }

        public Criteria andSiginDateEqualTo(Date value) {
            addCriterion("sigin_date =", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateNotEqualTo(Date value) {
            addCriterion("sigin_date <>", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateGreaterThan(Date value) {
            addCriterion("sigin_date >", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sigin_date >=", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateLessThan(Date value) {
            addCriterion("sigin_date <", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateLessThanOrEqualTo(Date value) {
            addCriterion("sigin_date <=", value, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateIn(List<Date> values) {
            addCriterion("sigin_date in", values, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateNotIn(List<Date> values) {
            addCriterion("sigin_date not in", values, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateBetween(Date value1, Date value2) {
            addCriterion("sigin_date between", value1, value2, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginDateNotBetween(Date value1, Date value2) {
            addCriterion("sigin_date not between", value1, value2, "siginDate");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdIsNull() {
            addCriterion("sigin_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdIsNotNull() {
            addCriterion("sigin_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdEqualTo(Integer value) {
            addCriterion("sigin_user_id =", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdNotEqualTo(Integer value) {
            addCriterion("sigin_user_id <>", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdGreaterThan(Integer value) {
            addCriterion("sigin_user_id >", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sigin_user_id >=", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdLessThan(Integer value) {
            addCriterion("sigin_user_id <", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("sigin_user_id <=", value, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdIn(List<Integer> values) {
            addCriterion("sigin_user_id in", values, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdNotIn(List<Integer> values) {
            addCriterion("sigin_user_id not in", values, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdBetween(Integer value1, Integer value2) {
            addCriterion("sigin_user_id between", value1, value2, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sigin_user_id not between", value1, value2, "siginUserId");
            return (Criteria) this;
        }

        public Criteria andSiginStateIsNull() {
            addCriterion("sigin_state is null");
            return (Criteria) this;
        }

        public Criteria andSiginStateIsNotNull() {
            addCriterion("sigin_state is not null");
            return (Criteria) this;
        }

        public Criteria andSiginStateEqualTo(Integer value) {
            addCriterion("sigin_state =", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateNotEqualTo(Integer value) {
            addCriterion("sigin_state <>", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateGreaterThan(Integer value) {
            addCriterion("sigin_state >", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sigin_state >=", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateLessThan(Integer value) {
            addCriterion("sigin_state <", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateLessThanOrEqualTo(Integer value) {
            addCriterion("sigin_state <=", value, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateIn(List<Integer> values) {
            addCriterion("sigin_state in", values, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateNotIn(List<Integer> values) {
            addCriterion("sigin_state not in", values, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateBetween(Integer value1, Integer value2) {
            addCriterion("sigin_state between", value1, value2, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginStateNotBetween(Integer value1, Integer value2) {
            addCriterion("sigin_state not between", value1, value2, "siginState");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdIsNull() {
            addCriterion("sigin_room_id is null");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdIsNotNull() {
            addCriterion("sigin_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdEqualTo(Integer value) {
            addCriterion("sigin_room_id =", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdNotEqualTo(Integer value) {
            addCriterion("sigin_room_id <>", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdGreaterThan(Integer value) {
            addCriterion("sigin_room_id >", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sigin_room_id >=", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdLessThan(Integer value) {
            addCriterion("sigin_room_id <", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("sigin_room_id <=", value, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdIn(List<Integer> values) {
            addCriterion("sigin_room_id in", values, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdNotIn(List<Integer> values) {
            addCriterion("sigin_room_id not in", values, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("sigin_room_id between", value1, value2, "siginRoomId");
            return (Criteria) this;
        }

        public Criteria andSiginRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sigin_room_id not between", value1, value2, "siginRoomId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sigin
     *
     * @mbggenerated do_not_delete_during_merge Tue Sep 25 20:06:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sigin
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}