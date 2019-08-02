package com.nucleus.model;


import java.util.Date;
//pojo class customer
public class Customer {
private String customerCode;
private String customerName;
private String customerAddress1;
private String customerAddress2;
private String customerPinCode;
private String email;
private String contactNo;
private String primaryContactPerson;
private String recordStatus;
private String flag;
private Date createDate;
private String createdBy;
private Date modifiedDate;
private String modifiedBy;
private Date authorizedDate;
private String authorizedBy;
public String getCustomerCode() {
	return customerCode;
}
public void setCustomerCode(String customerCode) {
	this.customerCode = customerCode;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress1() {
	return customerAddress1;
}
public void setCustomerAddress1(String customerAddress1) {
	this.customerAddress1 = customerAddress1;
}
public String getCustomerAddress2() {
	return customerAddress2;
}
public void setCustomerAddress2(String customerAddress2) {
	this.customerAddress2 = customerAddress2;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPrimaryContactPerson() {
	return primaryContactPerson;
}
public void setPrimaryContactPerson(String primaryContactPerson) {
	this.primaryContactPerson = primaryContactPerson;
}
public String getRecordStatus() {
	return recordStatus;
}
public void setRecordStatus(String recordStatus) {
	this.recordStatus = recordStatus;
}
public String getFlag() {
	return flag;
}
public void setFlag(String flag) {
	this.flag = flag;
}
public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}
public String getModifiedBy() {
	return modifiedBy;
}
public void setModifiedBy(String modifiedBy) {
	this.modifiedBy = modifiedBy;
}
public String getAuthorizedBy() {
	return authorizedBy;
}
public String getCustomerPinCode() {
	return customerPinCode;
}
public void setCustomerPinCode(String customerPinCode) {
	this.customerPinCode = customerPinCode;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}


public Date getCreateDate() {
	return createDate;
}
public void setCreateDate(Date createDate) {
	this.createDate = createDate;
}
public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public Date getAuthorizedDate() {
	return authorizedDate;
}
public void setAuthorizedDate(Date authorizedDate) {
	this.authorizedDate = authorizedDate;
}
public void setAuthorizedBy(String authorizedBy) {
	this.authorizedBy = authorizedBy;
}
public String toString() {
	return "Customer [customerCode=" + customerCode + ", customerName=" + customerName + ", customerAddress1="
			+ customerAddress1 + ", customerAddress2=" + customerAddress2 + ", customerPinCode=" + customerPinCode
			+ ", email=" + email + ", contactNo=" + contactNo + ", primaryContactPerson=" + primaryContactPerson
			+ ", recordStatus=" + recordStatus + ", flag=" + flag + ", createDate=" + createDate + ", createdBy="
			+ createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", authorizedDate="
			+ authorizedDate + ", authorizedBy=" + authorizedBy + "]";
}
}