package com.solution.p2p.core.common.entity;

import java.io.Serializable;
import java.util.Date;

public class LoanAuditFlow implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long loanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long currentUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long nextUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Long nextRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private String auditResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column loan_audit_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.id
     *
     * @return the value of loan_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.id
     *
     * @param id the value for loan_audit_flow.id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.loan_id
     *
     * @return the value of loan_audit_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.loan_id
     *
     * @param loanId the value for loan_audit_flow.loan_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.current_user_id
     *
     * @return the value of loan_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getCurrentUserId() {
        return currentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.current_user_id
     *
     * @param currentUserId the value for loan_audit_flow.current_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setCurrentUserId(Long currentUserId) {
        this.currentUserId = currentUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.next_user_id
     *
     * @return the value of loan_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getNextUserId() {
        return nextUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.next_user_id
     *
     * @param nextUserId the value for loan_audit_flow.next_user_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setNextUserId(Long nextUserId) {
        this.nextUserId = nextUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.next_role_id
     *
     * @return the value of loan_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Long getNextRoleId() {
        return nextRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.next_role_id
     *
     * @param nextRoleId the value for loan_audit_flow.next_role_id
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setNextRoleId(Long nextRoleId) {
        this.nextRoleId = nextRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.note
     *
     * @return the value of loan_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.note
     *
     * @param note the value for loan_audit_flow.note
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.audit_result
     *
     * @return the value of loan_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public String getAuditResult() {
        return auditResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.audit_result
     *
     * @param auditResult the value for loan_audit_flow.audit_result
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column loan_audit_flow.created_time
     *
     * @return the value of loan_audit_flow.created_time
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column loan_audit_flow.created_time
     *
     * @param createdTime the value for loan_audit_flow.created_time
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

        LoanAuditFlow flow = (LoanAuditFlow) o;

        if (id != null ? !id.equals(flow.id) : flow.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "LoanAuditFlow{" +
                "id=" + id +
                ", loanId=" + loanId  +
                ", currentUserId=" + currentUserId +
                ", nextUserId=" + nextUserId +
                ", nextRoleId=" + nextRoleId +
                ", note='" + note + '\'' +
                ", auditResult='" + auditResult + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}