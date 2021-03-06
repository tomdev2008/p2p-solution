package com.solution.p2p.core.loan.dao;

import java.util.List;

import com.solution.p2p.core.common.entity.LoanWarrant;
import com.solution.p2p.core.common.entity.LoanWarrantExample;
import org.apache.ibatis.annotations.Param;

public interface LoanWarrantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int countByExample(LoanWarrantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByExample(LoanWarrantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insert(LoanWarrant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int insertSelective(LoanWarrant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    List<LoanWarrant> selectByExample(LoanWarrantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    LoanWarrant selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") LoanWarrant record, @Param("example") LoanWarrantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByExample(@Param("record") LoanWarrant record, @Param("example") LoanWarrantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKeySelective(LoanWarrant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loan_warrant
     *
     * @mbggenerated Wed Nov 05 12:06:21 CST 2014
     */
    int updateByPrimaryKey(LoanWarrant record);
}