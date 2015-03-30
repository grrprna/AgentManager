package com.tam.model;

// Generated Mar 29, 2015 10:00:22 PM by Hibernate Tools 4.0.0

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
 * Hotel generated by hbm2java
 */
@Entity
@Table(name = "hotel", catalog = "tam")
public class Hotel implements java.io.Serializable {

	private Integer id;
	private City city;
	private String name;
	private String address;
	private String email;
	private String phone;
	private Set hotelFares = new HashSet(0);
	private Set hotelReservations = new HashSet(0);
	private Set tours = new HashSet(0);

	public Hotel() {
	}

	public Hotel(City city, String name, String address) {
		this.city = city;
		this.name = name;
		this.address = address;
	}

	public Hotel(City city, String name, String address, String email,
			String phone, Set hotelFares, Set hotelReservations, Set tours) {
		this.city = city;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.hotelFares = hotelFares;
		this.hotelReservations = hotelReservations;
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

	@Column(name = "address", nullable = false, length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phone", length = 18)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	public Set getHotelFares() {
		return this.hotelFares;
	}

	public void setHotelFares(Set hotelFares) {
		this.hotelFares = hotelFares;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	public Set getHotelReservations() {
		return this.hotelReservations;
	}

	public void setHotelReservations(Set hotelReservations) {
		this.hotelReservations = hotelReservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hotel")
	public Set getTours() {
		return this.tours;
	}

	public void setTours(Set tours) {
		this.tours = tours;
	}

}