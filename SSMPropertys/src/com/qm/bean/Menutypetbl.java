package com.qm.bean;

import java.io.Serializable;

public class Menutypetbl implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Menutypetbl [id=" + id + ", name=" + name + "]";
	}

	public Menutypetbl(){
		
	}
	private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}