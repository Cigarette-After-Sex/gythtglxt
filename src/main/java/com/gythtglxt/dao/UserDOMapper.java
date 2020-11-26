package com.gythtglxt.dao;

import com.gythtglxt.dataobject.UserDO;
import com.gythtglxt.dataobject.UserDOKey;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int deleteByPrimaryKey(UserDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    UserDO selectByPrimaryKey(UserDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    int updateByPrimaryKey(UserDO record);
}