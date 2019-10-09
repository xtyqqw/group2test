package com.zlk.product.entity;

/**
 * @ClassName： Product
 * @Description： 产品实体类
 * @Author： wy
 * @Date： 2019/10/9 20:32
 */
public class Product {
    /*产品id*/
    private Integer pid;
    /*产品名称*/
    private String pname;
    /*产品价格*/
    private double price;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
