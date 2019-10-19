package com.lmash.mysqltest.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SignInExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public SignInExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
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
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSignInIdIsNull() {
            addCriterion("sign_in_id is null");
            return (Criteria) this;
        }

        public Criteria andSignInIdIsNotNull() {
            addCriterion("sign_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andSignInIdEqualTo(Integer value) {
            addCriterion("sign_in_id =", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotEqualTo(Integer value) {
            addCriterion("sign_in_id <>", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThan(Integer value) {
            addCriterion("sign_in_id >", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_in_id >=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThan(Integer value) {
            addCriterion("sign_in_id <", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdLessThanOrEqualTo(Integer value) {
            addCriterion("sign_in_id <=", value, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdIn(List<Integer> values) {
            addCriterion("sign_in_id in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotIn(List<Integer> values) {
            addCriterion("sign_in_id not in", values, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_id between", value1, value2, "signInId");
            return (Criteria) this;
        }

        public Criteria andSignInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_in_id not between", value1, value2, "signInId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSignInDateIsNull() {
            addCriterion("sign_in_date is null");
            return (Criteria) this;
        }

        public Criteria andSignInDateIsNotNull() {
            addCriterion("sign_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignInDateEqualTo(Date value) {
            addCriterionForJDBCDate("sign_in_date =", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sign_in_date <>", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sign_in_date >", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_in_date >=", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateLessThan(Date value) {
            addCriterionForJDBCDate("sign_in_date <", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sign_in_date <=", value, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateIn(List<Date> values) {
            addCriterionForJDBCDate("sign_in_date in", values, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sign_in_date not in", values, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_in_date between", value1, value2, "signInDate");
            return (Criteria) this;
        }

        public Criteria andSignInDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sign_in_date not between", value1, value2, "signInDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x_sign_in
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 17 10:35:41 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x_sign_in
     *
     * @mbg.generated Thu Oct 17 10:35:41 CST 2019
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