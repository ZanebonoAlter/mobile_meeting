package org.bumblebee.entity;

import java.util.ArrayList;
import java.util.List;

public class VotedetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Integer limitStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Integer limitEnd;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public VotedetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
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
     * This method corresponds to the database table votedetail
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
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
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
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Integer getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table votedetail
     *
     * @mbggenerated Tue Sep 25 20:06:45 CST 2018
     */
    public Integer getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table votedetail
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

        public Criteria andVdIdIsNull() {
            addCriterion("vd_id is null");
            return (Criteria) this;
        }

        public Criteria andVdIdIsNotNull() {
            addCriterion("vd_id is not null");
            return (Criteria) this;
        }

        public Criteria andVdIdEqualTo(Integer value) {
            addCriterion("vd_id =", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotEqualTo(Integer value) {
            addCriterion("vd_id <>", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThan(Integer value) {
            addCriterion("vd_id >", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vd_id >=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThan(Integer value) {
            addCriterion("vd_id <", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdLessThanOrEqualTo(Integer value) {
            addCriterion("vd_id <=", value, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdIn(List<Integer> values) {
            addCriterion("vd_id in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotIn(List<Integer> values) {
            addCriterion("vd_id not in", values, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdBetween(Integer value1, Integer value2) {
            addCriterion("vd_id between", value1, value2, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vd_id not between", value1, value2, "vdId");
            return (Criteria) this;
        }

        public Criteria andVdItemIsNull() {
            addCriterion("vd_item is null");
            return (Criteria) this;
        }

        public Criteria andVdItemIsNotNull() {
            addCriterion("vd_item is not null");
            return (Criteria) this;
        }

        public Criteria andVdItemEqualTo(String value) {
            addCriterion("vd_item =", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemNotEqualTo(String value) {
            addCriterion("vd_item <>", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemGreaterThan(String value) {
            addCriterion("vd_item >", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemGreaterThanOrEqualTo(String value) {
            addCriterion("vd_item >=", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemLessThan(String value) {
            addCriterion("vd_item <", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemLessThanOrEqualTo(String value) {
            addCriterion("vd_item <=", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemLike(String value) {
            addCriterion("vd_item like", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemNotLike(String value) {
            addCriterion("vd_item not like", value, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemIn(List<String> values) {
            addCriterion("vd_item in", values, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemNotIn(List<String> values) {
            addCriterion("vd_item not in", values, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemBetween(String value1, String value2) {
            addCriterion("vd_item between", value1, value2, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdItemNotBetween(String value1, String value2) {
            addCriterion("vd_item not between", value1, value2, "vdItem");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdIsNull() {
            addCriterion("vd_vote_id is null");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdIsNotNull() {
            addCriterion("vd_vote_id is not null");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdEqualTo(Integer value) {
            addCriterion("vd_vote_id =", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdNotEqualTo(Integer value) {
            addCriterion("vd_vote_id <>", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdGreaterThan(Integer value) {
            addCriterion("vd_vote_id >", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vd_vote_id >=", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdLessThan(Integer value) {
            addCriterion("vd_vote_id <", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("vd_vote_id <=", value, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdIn(List<Integer> values) {
            addCriterion("vd_vote_id in", values, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdNotIn(List<Integer> values) {
            addCriterion("vd_vote_id not in", values, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdBetween(Integer value1, Integer value2) {
            addCriterion("vd_vote_id between", value1, value2, "vdVoteId");
            return (Criteria) this;
        }

        public Criteria andVdVoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vd_vote_id not between", value1, value2, "vdVoteId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table votedetail
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
     * This class corresponds to the database table votedetail
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