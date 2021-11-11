package com.example.Experience.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class CompanyData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String Comname;
	private String comlocation;
	private String comdes;
	private String comtype;
	private String comcriteria;
	private String jobprofile;
	private String compackage;
	private String status;
	private String level;
	private String rounds;
	private String intdes;
	private String rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComname() {
		return Comname;
	}
	public void setComname(String comname) {
		Comname = comname;
	}
	public String getComlocation() {
		return comlocation;
	}
	public void setComlocation(String comlocation) {
		this.comlocation = comlocation;
	}
	public String getComdes() {
		return comdes;
	}
	public void setComdes(String comdes) {
		this.comdes = comdes;
	}
	public String getComtype() {
		return comtype;
	}
	public void setComtype(String comtype) {
		this.comtype = comtype;
	}
	public String getComcriteria() {
		return comcriteria;
	}
	public void setComcriteria(String comcriteria) {
		this.comcriteria = comcriteria;
	}
	public String getJobprofile() {
		return jobprofile;
	}
	public void setJobprofile(String jobprofile) {
		this.jobprofile = jobprofile;
	}
	public String getCompackage() {
		return compackage;
	}
	public void setCompackage(String compackage) {
		this.compackage = compackage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getRounds() {
		return rounds;
	}
	public void setRounds(String rounds) {
		this.rounds = rounds;
	}
	public String getIntdes() {
		return intdes;
	}
	public void setIntdes(String intdes) {
		this.intdes = intdes;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "CompanyData [id=" + id + ", Comname=" + Comname + ", comlocation=" + comlocation + ", comdes=" + comdes
				+ ", comtype=" + comtype + ", comcriteria=" + comcriteria + ", jobprofile=" + jobprofile
				+ ", compackage=" + compackage + ", status=" + status + ", level=" + level + ", rounds=" + rounds
				+ ", intdes=" + intdes + ", rating=" + rating + "]";
	}
	public CompanyData() {
		super();
	}
	
	
	
}
