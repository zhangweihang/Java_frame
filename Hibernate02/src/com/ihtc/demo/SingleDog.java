package com.ihtc.demo;

public class SingleDog {

	private Long identity;
	private String nickname;
	private String gender;
	private String hobby;
	private Integer APM;
	private Integer version;
	
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Long getIdentity() {
		return identity;
	}
	public void setIdentity(Long identity) {
		this.identity = identity;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Integer getAPM() {
		return APM;
	}
	public void setAPM(Integer aPM) {
		APM = aPM;
	}
	
	@Override
	public String toString() {
		return "SingleDog [identity=" + identity + ", nickname=" + nickname + ", gender=" + gender + ", hobby=" + hobby
				+ ", APM=" + APM + "]";
	}
	
}