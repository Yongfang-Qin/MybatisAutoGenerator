package my.mybatis.generator.auto.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTypeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRowstampIsNull() {
            addCriterion("ROWSTAMP is null");
            return (Criteria) this;
        }

        public Criteria andRowstampIsNotNull() {
            addCriterion("ROWSTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andRowstampEqualTo(String value) {
            addCriterion("ROWSTAMP =", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampNotEqualTo(String value) {
            addCriterion("ROWSTAMP <>", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampGreaterThan(String value) {
            addCriterion("ROWSTAMP >", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampGreaterThanOrEqualTo(String value) {
            addCriterion("ROWSTAMP >=", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampLessThan(String value) {
            addCriterion("ROWSTAMP <", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampLessThanOrEqualTo(String value) {
            addCriterion("ROWSTAMP <=", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampLike(String value) {
            addCriterion("ROWSTAMP like", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampNotLike(String value) {
            addCriterion("ROWSTAMP not like", value, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampIn(List<String> values) {
            addCriterion("ROWSTAMP in", values, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampNotIn(List<String> values) {
            addCriterion("ROWSTAMP not in", values, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampBetween(String value1, String value2) {
            addCriterion("ROWSTAMP between", value1, value2, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andRowstampNotBetween(String value1, String value2) {
            addCriterion("ROWSTAMP not between", value1, value2, "rowstamp");
            return (Criteria) this;
        }

        public Criteria andPawprintIsNull() {
            addCriterion("PAWPRINT is null");
            return (Criteria) this;
        }

        public Criteria andPawprintIsNotNull() {
            addCriterion("PAWPRINT is not null");
            return (Criteria) this;
        }

        public Criteria andPawprintEqualTo(String value) {
            addCriterion("PAWPRINT =", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintNotEqualTo(String value) {
            addCriterion("PAWPRINT <>", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintGreaterThan(String value) {
            addCriterion("PAWPRINT >", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintGreaterThanOrEqualTo(String value) {
            addCriterion("PAWPRINT >=", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintLessThan(String value) {
            addCriterion("PAWPRINT <", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintLessThanOrEqualTo(String value) {
            addCriterion("PAWPRINT <=", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintLike(String value) {
            addCriterion("PAWPRINT like", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintNotLike(String value) {
            addCriterion("PAWPRINT not like", value, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintIn(List<String> values) {
            addCriterion("PAWPRINT in", values, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintNotIn(List<String> values) {
            addCriterion("PAWPRINT not in", values, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintBetween(String value1, String value2) {
            addCriterion("PAWPRINT between", value1, value2, "pawprint");
            return (Criteria) this;
        }

        public Criteria andPawprintNotBetween(String value1, String value2) {
            addCriterion("PAWPRINT not between", value1, value2, "pawprint");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(String value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(String value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(String value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(String value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(String value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(String value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLike(String value) {
            addCriterion("USERTYPE like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotLike(String value) {
            addCriterion("USERTYPE not like", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<String> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<String> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(String value1, String value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(String value1, String value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andSubmittedByIsNull() {
            addCriterion("SUBMITTED_BY is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedByIsNotNull() {
            addCriterion("SUBMITTED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedByEqualTo(String value) {
            addCriterion("SUBMITTED_BY =", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByNotEqualTo(String value) {
            addCriterion("SUBMITTED_BY <>", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByGreaterThan(String value) {
            addCriterion("SUBMITTED_BY >", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITTED_BY >=", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByLessThan(String value) {
            addCriterion("SUBMITTED_BY <", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByLessThanOrEqualTo(String value) {
            addCriterion("SUBMITTED_BY <=", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByLike(String value) {
            addCriterion("SUBMITTED_BY like", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByNotLike(String value) {
            addCriterion("SUBMITTED_BY not like", value, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByIn(List<String> values) {
            addCriterion("SUBMITTED_BY in", values, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByNotIn(List<String> values) {
            addCriterion("SUBMITTED_BY not in", values, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByBetween(String value1, String value2) {
            addCriterion("SUBMITTED_BY between", value1, value2, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedByNotBetween(String value1, String value2) {
            addCriterion("SUBMITTED_BY not between", value1, value2, "submittedBy");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNull() {
            addCriterion("SUBMITTED is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNotNull() {
            addCriterion("SUBMITTED is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedEqualTo(Date value) {
            addCriterion("SUBMITTED =", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotEqualTo(Date value) {
            addCriterion("SUBMITTED <>", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThan(Date value) {
            addCriterion("SUBMITTED >", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMITTED >=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThan(Date value) {
            addCriterion("SUBMITTED <", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThanOrEqualTo(Date value) {
            addCriterion("SUBMITTED <=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedIn(List<Date> values) {
            addCriterion("SUBMITTED in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotIn(List<Date> values) {
            addCriterion("SUBMITTED not in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedBetween(Date value1, Date value2) {
            addCriterion("SUBMITTED between", value1, value2, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotBetween(Date value1, Date value2) {
            addCriterion("SUBMITTED not between", value1, value2, "submitted");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("ISACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("ISACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(Short value) {
            addCriterion("ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(Short value) {
            addCriterion("ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(Short value) {
            addCriterion("ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(Short value) {
            addCriterion("ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(Short value) {
            addCriterion("ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(Short value) {
            addCriterion("ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<Short> values) {
            addCriterion("ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<Short> values) {
            addCriterion("ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(Short value1, Short value2) {
            addCriterion("ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(Short value1, Short value2) {
            addCriterion("ISACTIVE not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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