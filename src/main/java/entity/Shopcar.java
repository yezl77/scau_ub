package entity;

import java.io.Serializable;

public class Shopcar implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcar.id
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcar.userid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcar.itemid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    private Integer itemid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcar.id
     *
     * @return the value of shopcar.id
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcar.id
     *
     * @param id the value for shopcar.id
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcar.userid
     *
     * @return the value of shopcar.userid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcar.userid
     *
     * @param userid the value for shopcar.userid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcar.itemid
     *
     * @return the value of shopcar.itemid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcar.itemid
     *
     * @param itemid the value for shopcar.itemid
     *
     * @mbggenerated Sat Jun 09 19:24:53 CST 2018
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }
}