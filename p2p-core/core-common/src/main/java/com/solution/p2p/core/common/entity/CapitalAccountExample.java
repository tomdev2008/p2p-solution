package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CapitalAccountExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public CapitalAccountExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
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

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andCategaryIsNull() {
			addCriterion("categary is null");
			return (Criteria) this;
		}

		public Criteria andCategaryIsNotNull() {
			addCriterion("categary is not null");
			return (Criteria) this;
		}

		public Criteria andCategaryEqualTo(Integer value) {
			addCriterion("categary =", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryNotEqualTo(Integer value) {
			addCriterion("categary <>", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryGreaterThan(Integer value) {
			addCriterion("categary >", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryGreaterThanOrEqualTo(Integer value) {
			addCriterion("categary >=", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryLessThan(Integer value) {
			addCriterion("categary <", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryLessThanOrEqualTo(Integer value) {
			addCriterion("categary <=", value, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryIn(List<Integer> values) {
			addCriterion("categary in", values, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryNotIn(List<Integer> values) {
			addCriterion("categary not in", values, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryBetween(Integer value1, Integer value2) {
			addCriterion("categary between", value1, value2, "categary");
			return (Criteria) this;
		}

		public Criteria andCategaryNotBetween(Integer value1, Integer value2) {
			addCriterion("categary not between", value1, value2, "categary");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(BigDecimal value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(BigDecimal value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(BigDecimal value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(BigDecimal value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<BigDecimal> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<BigDecimal> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("amount not between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNull() {
			addCriterion("prod_id is null");
			return (Criteria) this;
		}

		public Criteria andProdIdIsNotNull() {
			addCriterion("prod_id is not null");
			return (Criteria) this;
		}

		public Criteria andProdIdEqualTo(Long value) {
			addCriterion("prod_id =", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotEqualTo(Long value) {
			addCriterion("prod_id <>", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThan(Long value) {
			addCriterion("prod_id >", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
			addCriterion("prod_id >=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThan(Long value) {
			addCriterion("prod_id <", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdLessThanOrEqualTo(Long value) {
			addCriterion("prod_id <=", value, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdIn(List<Long> values) {
			addCriterion("prod_id in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotIn(List<Long> values) {
			addCriterion("prod_id not in", values, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdBetween(Long value1, Long value2) {
			addCriterion("prod_id between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdIdNotBetween(Long value1, Long value2) {
			addCriterion("prod_id not between", value1, value2, "prodId");
			return (Criteria) this;
		}

		public Criteria andProdNameIsNull() {
			addCriterion("prod_name is null");
			return (Criteria) this;
		}

		public Criteria andProdNameIsNotNull() {
			addCriterion("prod_name is not null");
			return (Criteria) this;
		}

		public Criteria andProdNameEqualTo(String value) {
			addCriterion("prod_name =", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotEqualTo(String value) {
			addCriterion("prod_name <>", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameGreaterThan(String value) {
			addCriterion("prod_name >", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameGreaterThanOrEqualTo(String value) {
			addCriterion("prod_name >=", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLessThan(String value) {
			addCriterion("prod_name <", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLessThanOrEqualTo(String value) {
			addCriterion("prod_name <=", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameLike(String value) {
			addCriterion("prod_name like", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotLike(String value) {
			addCriterion("prod_name not like", value, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameIn(List<String> values) {
			addCriterion("prod_name in", values, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotIn(List<String> values) {
			addCriterion("prod_name not in", values, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameBetween(String value1, String value2) {
			addCriterion("prod_name between", value1, value2, "prodName");
			return (Criteria) this;
		}

		public Criteria andProdNameNotBetween(String value1, String value2) {
			addCriterion("prod_name not between", value1, value2, "prodName");
			return (Criteria) this;
		}

		public Criteria andProfitIsNull() {
			addCriterion("profit is null");
			return (Criteria) this;
		}

		public Criteria andProfitIsNotNull() {
			addCriterion("profit is not null");
			return (Criteria) this;
		}

		public Criteria andProfitEqualTo(BigDecimal value) {
			addCriterion("profit =", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitNotEqualTo(BigDecimal value) {
			addCriterion("profit <>", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitGreaterThan(BigDecimal value) {
			addCriterion("profit >", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("profit >=", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitLessThan(BigDecimal value) {
			addCriterion("profit <", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitLessThanOrEqualTo(BigDecimal value) {
			addCriterion("profit <=", value, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitIn(List<BigDecimal> values) {
			addCriterion("profit in", values, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitNotIn(List<BigDecimal> values) {
			addCriterion("profit not in", values, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("profit between", value1, value2, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("profit not between", value1, value2, "profit");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeIsNull() {
			addCriterion("profit_begin_time is null");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeIsNotNull() {
			addCriterion("profit_begin_time is not null");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeEqualTo(Date value) {
			addCriterionForJDBCDate("profit_begin_time =", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("profit_begin_time <>", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeGreaterThan(Date value) {
			addCriterionForJDBCDate("profit_begin_time >", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("profit_begin_time >=", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeLessThan(Date value) {
			addCriterionForJDBCDate("profit_begin_time <", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("profit_begin_time <=", value,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeIn(List<Date> values) {
			addCriterionForJDBCDate("profit_begin_time in", values,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeNotIn(List<Date> values) {
			addCriterionForJDBCDate("profit_begin_time not in", values,
					"profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("profit_begin_time between", value1,
					value2, "profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andProfitBeginTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("profit_begin_time not between", value1,
					value2, "profitBeginTime");
			return (Criteria) this;
		}

		public Criteria andLoanIdIsNull() {
			addCriterion("loan_id is null");
			return (Criteria) this;
		}

		public Criteria andLoanIdIsNotNull() {
			addCriterion("loan_id is not null");
			return (Criteria) this;
		}

		public Criteria andLoanIdEqualTo(Long value) {
			addCriterion("loan_id =", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotEqualTo(Long value) {
			addCriterion("loan_id <>", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThan(Long value) {
			addCriterion("loan_id >", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdGreaterThanOrEqualTo(Long value) {
			addCriterion("loan_id >=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThan(Long value) {
			addCriterion("loan_id <", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdLessThanOrEqualTo(Long value) {
			addCriterion("loan_id <=", value, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdIn(List<Long> values) {
			addCriterion("loan_id in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotIn(List<Long> values) {
			addCriterion("loan_id not in", values, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdBetween(Long value1, Long value2) {
			addCriterion("loan_id between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanIdNotBetween(Long value1, Long value2) {
			addCriterion("loan_id not between", value1, value2, "loanId");
			return (Criteria) this;
		}

		public Criteria andLoanNameIsNull() {
			addCriterion("loan_name is null");
			return (Criteria) this;
		}

		public Criteria andLoanNameIsNotNull() {
			addCriterion("loan_name is not null");
			return (Criteria) this;
		}

		public Criteria andLoanNameEqualTo(String value) {
			addCriterion("loan_name =", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotEqualTo(String value) {
			addCriterion("loan_name <>", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameGreaterThan(String value) {
			addCriterion("loan_name >", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameGreaterThanOrEqualTo(String value) {
			addCriterion("loan_name >=", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLessThan(String value) {
			addCriterion("loan_name <", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLessThanOrEqualTo(String value) {
			addCriterion("loan_name <=", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameLike(String value) {
			addCriterion("loan_name like", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotLike(String value) {
			addCriterion("loan_name not like", value, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameIn(List<String> values) {
			addCriterion("loan_name in", values, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotIn(List<String> values) {
			addCriterion("loan_name not in", values, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameBetween(String value1, String value2) {
			addCriterion("loan_name between", value1, value2, "loanName");
			return (Criteria) this;
		}

		public Criteria andLoanNameNotBetween(String value1, String value2) {
			addCriterion("loan_name not between", value1, value2, "loanName");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountIsNull() {
			addCriterion("total_loan_amount is null");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountIsNotNull() {
			addCriterion("total_loan_amount is not null");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountEqualTo(BigDecimal value) {
			addCriterion("total_loan_amount =", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountNotEqualTo(BigDecimal value) {
			addCriterion("total_loan_amount <>", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountGreaterThan(BigDecimal value) {
			addCriterion("total_loan_amount >", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("total_loan_amount >=", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountLessThan(BigDecimal value) {
			addCriterion("total_loan_amount <", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("total_loan_amount <=", value, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountIn(List<BigDecimal> values) {
			addCriterion("total_loan_amount in", values, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountNotIn(List<BigDecimal> values) {
			addCriterion("total_loan_amount not in", values, "totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("total_loan_amount between", value1, value2,
					"totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andTotalLoanAmountNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("total_loan_amount not between", value1, value2,
					"totalLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountIsNull() {
			addCriterion("returned_loan_amount is null");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountIsNotNull() {
			addCriterion("returned_loan_amount is not null");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountEqualTo(BigDecimal value) {
			addCriterion("returned_loan_amount =", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountNotEqualTo(BigDecimal value) {
			addCriterion("returned_loan_amount <>", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountGreaterThan(BigDecimal value) {
			addCriterion("returned_loan_amount >", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountGreaterThanOrEqualTo(
				BigDecimal value) {
			addCriterion("returned_loan_amount >=", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountLessThan(BigDecimal value) {
			addCriterion("returned_loan_amount <", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountLessThanOrEqualTo(BigDecimal value) {
			addCriterion("returned_loan_amount <=", value, "returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountIn(List<BigDecimal> values) {
			addCriterion("returned_loan_amount in", values,
					"returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountNotIn(List<BigDecimal> values) {
			addCriterion("returned_loan_amount not in", values,
					"returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("returned_loan_amount between", value1, value2,
					"returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andReturnedLoanAmountNotBetween(BigDecimal value1,
				BigDecimal value2) {
			addCriterion("returned_loan_amount not between", value1, value2,
					"returnedLoanAmount");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIsNull() {
			addCriterion("created_time is null");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIsNotNull() {
			addCriterion("created_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeEqualTo(Date value) {
			addCriterion("created_time =", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotEqualTo(Date value) {
			addCriterion("created_time <>", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeGreaterThan(Date value) {
			addCriterion("created_time >", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("created_time >=", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeLessThan(Date value) {
			addCriterion("created_time <", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
			addCriterion("created_time <=", value, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeIn(List<Date> values) {
			addCriterion("created_time in", values, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotIn(List<Date> values) {
			addCriterion("created_time not in", values, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeBetween(Date value1, Date value2) {
			addCriterion("created_time between", value1, value2, "createdTime");
			return (Criteria) this;
		}

		public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
			addCriterion("created_time not between", value1, value2,
					"createdTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table capital_account
	 * @mbggenerated  Mon Nov 03 14:54:07 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table capital_account
     *
     * @mbggenerated do_not_delete_during_merge Tue Oct 14 10:48:47 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}