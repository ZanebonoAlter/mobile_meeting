package org.bumblebee.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNull() {
            addCriterion("room_state is null");
            return (Criteria) this;
        }

        public Criteria andRoomStateIsNotNull() {
            addCriterion("room_state is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStateEqualTo(String value) {
            addCriterion("room_state =", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotEqualTo(String value) {
            addCriterion("room_state <>", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThan(String value) {
            addCriterion("room_state >", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateGreaterThanOrEqualTo(String value) {
            addCriterion("room_state >=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThan(String value) {
            addCriterion("room_state <", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLessThanOrEqualTo(String value) {
            addCriterion("room_state <=", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateLike(String value) {
            addCriterion("room_state like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotLike(String value) {
            addCriterion("room_state not like", value, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateIn(List<String> values) {
            addCriterion("room_state in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotIn(List<String> values) {
            addCriterion("room_state not in", values, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateBetween(String value1, String value2) {
            addCriterion("room_state between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomStateNotBetween(String value1, String value2) {
            addCriterion("room_state not between", value1, value2, "roomState");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdIsNull() {
            addCriterion("room_create_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdIsNotNull() {
            addCriterion("room_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdEqualTo(Integer value) {
            addCriterion("room_create_id =", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdNotEqualTo(Integer value) {
            addCriterion("room_create_id <>", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdGreaterThan(Integer value) {
            addCriterion("room_create_id >", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_create_id >=", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdLessThan(Integer value) {
            addCriterion("room_create_id <", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_create_id <=", value, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdIn(List<Integer> values) {
            addCriterion("room_create_id in", values, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdNotIn(List<Integer> values) {
            addCriterion("room_create_id not in", values, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("room_create_id between", value1, value2, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_create_id not between", value1, value2, "roomCreateId");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeIsNull() {
            addCriterion("room_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeIsNotNull() {
            addCriterion("room_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeEqualTo(Date value) {
            addCriterion("room_create_time =", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeNotEqualTo(Date value) {
            addCriterion("room_create_time <>", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeGreaterThan(Date value) {
            addCriterion("room_create_time >", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("room_create_time >=", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeLessThan(Date value) {
            addCriterion("room_create_time <", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("room_create_time <=", value, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeIn(List<Date> values) {
            addCriterion("room_create_time in", values, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeNotIn(List<Date> values) {
            addCriterion("room_create_time not in", values, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeBetween(Date value1, Date value2) {
            addCriterion("room_create_time between", value1, value2, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("room_create_time not between", value1, value2, "roomCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoomLimitIsNull() {
            addCriterion("room_limit is null");
            return (Criteria) this;
        }

        public Criteria andRoomLimitIsNotNull() {
            addCriterion("room_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRoomLimitEqualTo(Integer value) {
            addCriterion("room_limit =", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitNotEqualTo(Integer value) {
            addCriterion("room_limit <>", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitGreaterThan(Integer value) {
            addCriterion("room_limit >", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_limit >=", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitLessThan(Integer value) {
            addCriterion("room_limit <", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitLessThanOrEqualTo(Integer value) {
            addCriterion("room_limit <=", value, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitIn(List<Integer> values) {
            addCriterion("room_limit in", values, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitNotIn(List<Integer> values) {
            addCriterion("room_limit not in", values, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitBetween(Integer value1, Integer value2) {
            addCriterion("room_limit between", value1, value2, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("room_limit not between", value1, value2, "roomLimit");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordIsNull() {
            addCriterion("room_password is null");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordIsNotNull() {
            addCriterion("room_password is not null");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordEqualTo(String value) {
            addCriterion("room_password =", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordNotEqualTo(String value) {
            addCriterion("room_password <>", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordGreaterThan(String value) {
            addCriterion("room_password >", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("room_password >=", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordLessThan(String value) {
            addCriterion("room_password <", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordLessThanOrEqualTo(String value) {
            addCriterion("room_password <=", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordLike(String value) {
            addCriterion("room_password like", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordNotLike(String value) {
            addCriterion("room_password not like", value, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordIn(List<String> values) {
            addCriterion("room_password in", values, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordNotIn(List<String> values) {
            addCriterion("room_password not in", values, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordBetween(String value1, String value2) {
            addCriterion("room_password between", value1, value2, "roomPassword");
            return (Criteria) this;
        }

        public Criteria andRoomPasswordNotBetween(String value1, String value2) {
            addCriterion("room_password not between", value1, value2, "roomPassword");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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