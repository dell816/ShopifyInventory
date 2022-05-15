package com.ad.beans;

public class Member {
	
	// Creating Fields
	private int memberId;
	private String memberName;
	private String memberDate;
	private String member_type;
	private String address;
	private String expiry_date;
	
	
	//Constructors 	
	public Member() {
		
	}

	public Member(int memberId, String memberName, String address, String memberDate, String expiry_date,
			String member_type) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.address = address;
		this.memberDate = memberDate;
		this.expiry_date = expiry_date;
		this.member_type = member_type;
	}

	// Setting Getters and Setters
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberDate() {
		return memberDate;
	}
	public void setMemberDate(String memberDate) {
		this.memberDate = memberDate;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getMember_type() {
		return member_type;
	}
	public void setMember_type(String member_type) {
		this.member_type = member_type;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", Address=" + address + ", memberDate="
				+ memberDate + ", expiry_date=" + expiry_date + ", member_type=" + member_type + "]";
	}
	


}
