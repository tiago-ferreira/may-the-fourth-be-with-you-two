package com.may.the.fourth.be.with.you.two.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private String id;
	private String fullName;
	private String email;
	private LocalDate birthday;
	private String heartTeamId;
	private List<Campaign> campaigns;

	public User() {

	}

	public User(String id, String fullName, String email, LocalDate birthday, String heartTeamId) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.birthday = birthday;
		this.heartTeamId = heartTeamId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getHeartTeamId() {
		return heartTeamId;
	}

	public void setHeartTeamId(String heartTeamId) {
		this.heartTeamId = heartTeamId;
	}

	public List<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

}
