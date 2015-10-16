package com.ted.Model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CAMERA")
public class Camera {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="BRANDS")
	private String brands;
	@Column(name="MODEL")
	private String model;
	@OneToMany(mappedBy="camera")
	private Set<Reviews> reviewsSet;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrands() {
		return brands;
	}
	public void setBrands(String brands) {
		this.brands = brands;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Set<Reviews> getReviewsSet() {
		return reviewsSet;
	}
	public void setReviewsSet(Set<Reviews> reviewsSet) {
		this.reviewsSet = reviewsSet;
	}
	
	@Override
	public String toString(){
		return this.brands + ":" + this.model;
	}
	
	
	
}
