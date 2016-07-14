package com.snaillove.standard.model;

public class Protocol {
	private String id;
	private String byteSet;
	private String descriptionSet;
	private String remarks;
	private String sequence;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getByteSet() {
		return byteSet;
	}
	public void setByteSet(String byteSet) {
		this.byteSet = byteSet;
	}
	public String getDescriptionSet() {
		return descriptionSet;
	}
	public void setDescriptionSet(String descriptionSet) {
		this.descriptionSet = descriptionSet;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	@Override
	public String toString() {
		return "Protocol [id=" + id + ", byteSet=" + byteSet + ", descriptionSet=" + descriptionSet + ", remarks="
				+ remarks + ", sequence=" + sequence + "]";
	}
	
	
	
	
}
