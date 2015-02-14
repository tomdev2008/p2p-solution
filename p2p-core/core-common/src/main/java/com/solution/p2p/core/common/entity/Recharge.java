package com.solution.p2p.core.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Recharge implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.bank_code
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private String bankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.card_no
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private String cardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    private Date createdTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.id
     *
     * @return the value of recharge.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.id
     *
     * @param id the value for recharge.id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.user_id
     *
     * @return the value of recharge.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.user_id
     *
     * @param userId the value for recharge.user_id
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.amount
     *
     * @return the value of recharge.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.amount
     *
     * @param amount the value for recharge.amount
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.bank_code
     *
     * @return the value of recharge.bank_code
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.bank_code
     *
     * @param bankCode the value for recharge.bank_code
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.card_no
     *
     * @return the value of recharge.card_no
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.card_no
     *
     * @param cardNo the value for recharge.card_no
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.state
     *
     * @return the value of recharge.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.state
     *
     * @param state the value for recharge.state
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge.created_time
     *
     * @return the value of recharge.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge.created_time
     *
     * @param createdTime the value for recharge.created_time
     *
     * @mbggenerated Wed Nov 05 12:13:35 CST 2014
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recharge recharge = (Recharge) o;

        if (id != null ? !id.equals(recharge.id) : recharge.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Recharge{" +
                "id=" + id +
                ", userId=" + userId  +
                ", amount=" + amount +
                ", bankCode='" + bankCode + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", state='" + state + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}