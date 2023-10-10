package com.fdx.api.model51.modelimpl;

public class FiAttrEntity {

	private int attrid;
	private FiAttrEntity fiAttrEntity;
	private String parentprikey;
	private String name;
	private String value;

	public int getAttrid() {
		return attrid;
	}

	public void setAttrid(int attrid) {
		this.attrid = attrid;
	}

	public FiAttrEntity getFiAttrEntity() {
		return fiAttrEntity;
	}

	public void setFiAttrEntity(FiAttrEntity fiAttrEntity) {
		this.fiAttrEntity = fiAttrEntity;
	}

	public String getParentprikey() {
		return parentprikey;
	}

	public void setParentprikey(String parentprikey) {
		this.parentprikey = parentprikey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
