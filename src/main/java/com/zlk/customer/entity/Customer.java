package com.zlk.customer.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName： customer
 * @Description：
 * @Author： yzh
 * @Date： 2019/10/9 19:54
 */

public class Customer {
    private Integer id;
    private String cusName;
    private String address;
    private String phone;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Customer(Integer id, String cusName, String address, String phone, String status, Date createTime) {
        this.id = id;
        this.cusName = cusName;
        this.address = address;
        this.phone = phone;
        this.status = status;
        this.createTime = createTime;
    }

    public Customer() {
    }
}
