package com.gythtglxt.dataobject;

import java.util.Date;

public class MedCostDO extends MedCostDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.RECOND_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String recondCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.SPECIFICATIONS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String specifications;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.PRICE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.LEVEL
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.MONEY
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Double money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_natmeha_med_cost.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    private Date itemupdateat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.RECOND_CODE
     *
     * @return the value of tb_natmeha_med_cost.RECOND_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getRecondCode() {
        return recondCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.RECOND_CODE
     *
     * @param recondCode the value for tb_natmeha_med_cost.RECOND_CODE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setRecondCode(String recondCode) {
        this.recondCode = recondCode == null ? null : recondCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.SPECIFICATIONS
     *
     * @return the value of tb_natmeha_med_cost.SPECIFICATIONS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.SPECIFICATIONS
     *
     * @param specifications the value for tb_natmeha_med_cost.SPECIFICATIONS
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.PRICE
     *
     * @return the value of tb_natmeha_med_cost.PRICE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.PRICE
     *
     * @param price the value for tb_natmeha_med_cost.PRICE
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.NUM
     *
     * @return the value of tb_natmeha_med_cost.NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.NUM
     *
     * @param num the value for tb_natmeha_med_cost.NUM
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.LEVEL
     *
     * @return the value of tb_natmeha_med_cost.LEVEL
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.LEVEL
     *
     * @param level the value for tb_natmeha_med_cost.LEVEL
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.MONEY
     *
     * @return the value of tb_natmeha_med_cost.MONEY
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Double getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.MONEY
     *
     * @param money the value for tb_natmeha_med_cost.MONEY
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.CREATER
     *
     * @return the value of tb_natmeha_med_cost.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.CREATER
     *
     * @param creater the value for tb_natmeha_med_cost.CREATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.itemCreateAt
     *
     * @return the value of tb_natmeha_med_cost.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.itemCreateAt
     *
     * @param itemcreateat the value for tb_natmeha_med_cost.itemCreateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.UPDATER
     *
     * @return the value of tb_natmeha_med_cost.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.UPDATER
     *
     * @param updater the value for tb_natmeha_med_cost.UPDATER
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_natmeha_med_cost.itemUpdateAt
     *
     * @return the value of tb_natmeha_med_cost.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_natmeha_med_cost.itemUpdateAt
     *
     * @param itemupdateat the value for tb_natmeha_med_cost.itemUpdateAt
     *
     * @mbg.generated Thu Nov 26 00:22:00 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }
}