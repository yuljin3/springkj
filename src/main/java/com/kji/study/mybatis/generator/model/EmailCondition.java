package com.kji.study.mybatis.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmailCondition {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmailCondition() {
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

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(String value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(String value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(String value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(String value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(String value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(String value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLike(String value) {
            addCriterion("request_id like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotLike(String value) {
            addCriterion("request_id not like", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<String> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<String> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(String value1, String value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(String value1, String value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(Long value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(Long value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(Long value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(Long value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(Long value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<Long> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<Long> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(Long value1, Long value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(Long value1, Long value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNull() {
            addCriterion("request_ip is null");
            return (Criteria) this;
        }

        public Criteria andRequestIpIsNotNull() {
            addCriterion("request_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIpEqualTo(String value) {
            addCriterion("request_ip =", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotEqualTo(String value) {
            addCriterion("request_ip <>", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThan(String value) {
            addCriterion("request_ip >", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpGreaterThanOrEqualTo(String value) {
            addCriterion("request_ip >=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThan(String value) {
            addCriterion("request_ip <", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLessThanOrEqualTo(String value) {
            addCriterion("request_ip <=", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpLike(String value) {
            addCriterion("request_ip like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotLike(String value) {
            addCriterion("request_ip not like", value, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpIn(List<String> values) {
            addCriterion("request_ip in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotIn(List<String> values) {
            addCriterion("request_ip not in", values, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpBetween(String value1, String value2) {
            addCriterion("request_ip between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andRequestIpNotBetween(String value1, String value2) {
            addCriterion("request_ip not between", value1, value2, "requestIp");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnIsNull() {
            addCriterion("attach_file_yn is null");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnIsNotNull() {
            addCriterion("attach_file_yn is not null");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnEqualTo(String value) {
            addCriterion("attach_file_yn =", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnNotEqualTo(String value) {
            addCriterion("attach_file_yn <>", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnGreaterThan(String value) {
            addCriterion("attach_file_yn >", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnGreaterThanOrEqualTo(String value) {
            addCriterion("attach_file_yn >=", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnLessThan(String value) {
            addCriterion("attach_file_yn <", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnLessThanOrEqualTo(String value) {
            addCriterion("attach_file_yn <=", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnLike(String value) {
            addCriterion("attach_file_yn like", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnNotLike(String value) {
            addCriterion("attach_file_yn not like", value, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnIn(List<String> values) {
            addCriterion("attach_file_yn in", values, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnNotIn(List<String> values) {
            addCriterion("attach_file_yn not in", values, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnBetween(String value1, String value2) {
            addCriterion("attach_file_yn between", value1, value2, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andAttachFileYnNotBetween(String value1, String value2) {
            addCriterion("attach_file_yn not between", value1, value2, "attachFileYn");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNull() {
            addCriterion("request_date is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNotNull() {
            addCriterion("request_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateEqualTo(Date value) {
            addCriterion("request_date =", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotEqualTo(Date value) {
            addCriterion("request_date <>", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThan(Date value) {
            addCriterion("request_date >", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("request_date >=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThan(Date value) {
            addCriterion("request_date <", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThanOrEqualTo(Date value) {
            addCriterion("request_date <=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateIn(List<Date> values) {
            addCriterion("request_date in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotIn(List<Date> values) {
            addCriterion("request_date not in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateBetween(Date value1, Date value2) {
            addCriterion("request_date between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotBetween(Date value1, Date value2) {
            addCriterion("request_date not between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andGroupYnIsNull() {
            addCriterion("group_yn is null");
            return (Criteria) this;
        }

        public Criteria andGroupYnIsNotNull() {
            addCriterion("group_yn is not null");
            return (Criteria) this;
        }

        public Criteria andGroupYnEqualTo(String value) {
            addCriterion("group_yn =", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnNotEqualTo(String value) {
            addCriterion("group_yn <>", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnGreaterThan(String value) {
            addCriterion("group_yn >", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnGreaterThanOrEqualTo(String value) {
            addCriterion("group_yn >=", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnLessThan(String value) {
            addCriterion("group_yn <", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnLessThanOrEqualTo(String value) {
            addCriterion("group_yn <=", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnLike(String value) {
            addCriterion("group_yn like", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnNotLike(String value) {
            addCriterion("group_yn not like", value, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnIn(List<String> values) {
            addCriterion("group_yn in", values, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnNotIn(List<String> values) {
            addCriterion("group_yn not in", values, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnBetween(String value1, String value2) {
            addCriterion("group_yn between", value1, value2, "groupYn");
            return (Criteria) this;
        }

        public Criteria andGroupYnNotBetween(String value1, String value2) {
            addCriterion("group_yn not between", value1, value2, "groupYn");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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