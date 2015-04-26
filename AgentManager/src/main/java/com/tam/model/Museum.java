package com.tam.model;

// Generated Apr 26, 2015 5:10:28 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Museum generated by hbm2java
 */
@Entity
@Table(name = "museum", catalog = "tam")
public class Museum implements java.io.Serializable {

	private Integer id;
	private City city;
	private String name;
	private int fareId;
	private Set museumFares = new HashSet(0);
	private Set tours = new HashSet(0);

	public Museum() {
	}

	public Museum(City city, String name, int fareId) {
		this.city = city;
		this.name = name;
		this.fareId = fareId;
	}

	public Museum(City city, String name, int fareId, Set museumFares, Set tours) {
		this.city = city;
		this.name = name;
		this.fareId = fareId;
		this.museumFares = museumFares;
		this.tours = tours;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_code", nullable = false)
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "fare_id", nullable = false)
	public int getFareId() {
		return this.fareId;
	}

	public void setFareId(int fareId) {
		this.fareId = fareId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "museum")
	public Set getMuseumFares() {
		return this.museumFares;
	}

	public void setMuseumFares(Set museumFares) {
		this.museumFares = museumFares;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "museum")
	public Set getTours() {
		return this.tours;
	}

	public void setTours(Set tours) {
		this.tours = tours;
	}

}
