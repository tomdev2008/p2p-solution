package com.solution.p2p.core.account.dao;

import com.solution.p2p.core.common.entity.CapitalAccountBankcard;
import com.solution.p2p.core.common.entity.CapitalAccountBankcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalAccountBankcardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int countByExample(CapitalAccountBankcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int deleteByExample(CapitalAccountBankcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int insert(CapitalAccountBankcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int insertSelective(CapitalAccountBankcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    List<CapitalAccountBankcard> selectByExample(CapitalAccountBankcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    CapitalAccountBankcard selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int updateByExampleSelective(@Param("record") CapitalAccountBankcard record, @Param("example") CapitalAccountBankcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int updateByExample(@Param("record") CapitalAccountBankcard record, @Param("example") CapitalAccountBankcardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int updateByPrimaryKeySelective(CapitalAccountBankcard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table capital_account_bankcard
     *
     * @mbggenerated Wed Nov 05 11:49:55 CST 2014
     */
    int updateByPrimaryKey(CapitalAccountBankcard record);
}