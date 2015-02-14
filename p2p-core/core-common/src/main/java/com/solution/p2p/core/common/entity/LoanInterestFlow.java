package com.solution.p2p.core.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanInterestFlow implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long loanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.expect_amount
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private BigDecimal expectAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.expect_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date expectDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_interest_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.id
     *
     * @return the value of loan_interest_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.id
     *
     * @param id the value for loan_interest_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.loan_id
     *
     * @return the value of loan_interest_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.loan_id
     *
     * @param loanId the value for loan_interest_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.expect_amount
     *
     * @return the value of loan_interest_flow.expect_amount
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public BigDecimal getExpectAmount() {
        return expectAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.expect_amount
     *
     * @param expectAmount the value for loan_interest_flow.expect_amount
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setExpectAmount(BigDecimal expectAmount) {
        this.expectAmount = expectAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.expect_date
     *
     * @return the value of loan_interest_flow.expect_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getExpectDate() {
        return expectDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.expect_date
     *
     * @param expectDate the value for loan_interest_flow.expect_date
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setExpectDate(Date expectDate) {
        this.expectDate = expectDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.state
     *
     * @return the value of loan_interest_flow.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.state
     *
     * @param state the value for loan_interest_flow.state
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_interest_flow.created_time
     *
     * @return the value of loan_interest_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_interest_flow.created_time
     *
     * @param createdTime the value for loan_interest_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoanInterestFlow flow = (LoanInterestFlow) o;

        if (id != null ? !id.equals(flow.id) : flow.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LoanInterestFlow{" +
                "id=" + id +
                ", loanId=" + loanId  +
                ", expectAmount=" + expectAmount +
                ", expectDate=" + expectDate +
                ", state='" + state + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}