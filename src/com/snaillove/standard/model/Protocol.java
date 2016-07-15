package com.snaillove.standard.model;

public class Protocol {
	private String byteSet;
	private String descriptionSet;
	private String remarks;
	private String sequence;
	private String correlation; // 后面有几个是对应的
	
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
	public String getCorrelation() {
		return correlation;
	}
	public void setCorrelation(String correlation) {
		this.correlation = correlation;
	}
	
}
