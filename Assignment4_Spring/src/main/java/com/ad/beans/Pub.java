package com.ad.beans;

//Publisher Class
public class Pub {

	private int pubId;
	private String pubName;
	private String address;
	
	//Constructors
	public Pub() {
		
	}
	
	public Pub(int pubId, String pubName, String address) {
		super();
		this.pubId = pubId;
		this.pubName = pubName;
		this.address = address;
	}

	// Getters && Setters
	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Pub [pubId=" + pubId + ", pubName=" + pubName + ", address=" + address + "]";
	}
	
	
	
	
}
