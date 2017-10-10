package com.qm.bean;

import java.io.Serializable;

public class Orderdetaitbl implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Orderdetaitbl [id=" + id + ", menuid=" + menuid + ", orderid=" + orderid + ", num=" + num + ", remark="
				+ remark + "]";
	}

	public Orderdetaitbl(){}
	private Integer id;

    private Integer menuid;

    private Integer orderid;

    private Integer num;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}