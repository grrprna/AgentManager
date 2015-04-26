package com.tam.model;

// Generated Apr 26, 2015 5:10:28 PM by Hibernate Tools 4.0.0

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tour generated by hbm2java
 */
@Entity
@Table(name = "tour", catalog = "tam")
public class Tour implements java.io.Serializable {

	private Integer id;
	private User user;
	private Museum museum;
	private Guide guide;
	private Hotel hotel;
	private TourTranportationType tourTranportationType;
	private String coordinator;
	private String route;
	private Date depDate;
	private Date retDate;
	private Double transportationFare;
	private Double hotelFare;
	private String cateringOnVehicle;
	private Double cateringOnVehicleFare;
	private Integer policyNo;
	private Double policyAmount;
	private double sellingAmount;
	private String currency;
	private String note;
	private Date recordDate;
	private Set tourRestorants = new HashSet(0);
	private Set tourPaxes = new HashSet(0);

	public Tour() {
	}

	public Tour(User user, Guide guide, String coordinator, String route,
			Date depDate, Date retDate, double sellingAmount, Date recordDate) {
		this.user = user;
		this.guide = guide;
		this.coordinator = coordinator;
		this.route = route;
		this.depDate = depDate;
		this.retDate = retDate;
		this.sellingAmount = sellingAmount;
		this.recordDate = recordDate;
	}

	public Tour(User user, Museum museum, Guide guide, Hotel hotel,
			TourTranportationType tourTranportationType, String coordinator,
			String route, Date depDate, Date retDate,
			Double transportationFare, Double hotelFare,
			String cateringOnVehicle, Double cateringOnVehicleFare,
			Integer policyNo, Double policyAmount, double sellingAmount,
			String currency, String note, Date recordDate, Set tourRestorants,
			Set tourPaxes) {
		this.user = user;
		this.museum = museum;
		this.guide = guide;
		this.hotel = hotel;
		this.tourTranportationType = tourTranportationType;
		this.coordinator = coordinator;
		this.route = route;
		this.depDate = depDate;
		this.retDate = retDate;
		this.transportationFare = transportationFare;
		this.hotelFare = hotelFare;
		this.cateringOnVehicle = cateringOnVehicle;
		this.cateringOnVehicleFare = cateringOnVehicleFare;
		this.policyNo = policyNo;
		this.policyAmount = policyAmount;
		this.sellingAmount = sellingAmount;
		this.currency = currency;
		this.note = note;
		this.recordDate = recordDate;
		this.tourRestorants = tourRestorants;
		this.tourPaxes = tourPaxes;
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
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "museum_id")
	public Museum getMuseum() {
		return this.museum;
	}

	public void setMuseum(Museum museum) {
		this.museum = museum;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guide_id", nullable = false)
	public Guide getGuide() {
		return this.guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_id")
	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transportation_type_code")
	public TourTranportationType getTourTranportationType() {
		return this.tourTranportationType;
	}

	public void setTourTranportationType(
			TourTranportationType tourTranportationType) {
		this.tourTranportationType = tourTranportationType;
	}

	@Column(name = "coordinator", nullable = false, length = 45)
	public String getCoordinator() {
		return this.coordinator;
	}

	public void setCoordinator(String coordinator) {
		this.coordinator = coordinator;
	}

	@Column(name = "route", nullable = false, length = 45)
	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dep_date", nullable = false, length = 10)
	public Date getDepDate() {
		return this.depDate;
	}

	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ret_date", nullable = false, length = 10)
	public Date getRetDate() {
		return this.retDate;
	}

	public void setRetDate(Date retDate) {
		this.retDate = retDate;
	}

	@Column(name = "transportation_fare", precision = 22, scale = 0)
	public Double getTransportationFare() {
		return this.transportationFare;
	}

	public void setTransportationFare(Double transportationFare) {
		this.transportationFare = transportationFare;
	}

	@Column(name = "hotel_fare", precision = 22, scale = 0)
	public Double getHotelFare() {
		return this.hotelFare;
	}

	public void setHotelFare(Double hotelFare) {
		this.hotelFare = hotelFare;
	}

	@Column(name = "catering_on_vehicle", length = 200)
	public String getCateringOnVehicle() {
		return this.cateringOnVehicle;
	}

	public void setCateringOnVehicle(String cateringOnVehicle) {
		this.cateringOnVehicle = cateringOnVehicle;
	}

	@Column(name = "catering_on_vehicle_fare", precision = 22, scale = 0)
	public Double getCateringOnVehicleFare() {
		return this.cateringOnVehicleFare;
	}

	public void setCateringOnVehicleFare(Double cateringOnVehicleFare) {
		this.cateringOnVehicleFare = cateringOnVehicleFare;
	}

	@Column(name = "policy_no")
	public Integer getPolicyNo() {
		return this.policyNo;
	}

	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}

	@Column(name = "policy_amount", precision = 22, scale = 0)
	public Double getPolicyAmount() {
		return this.policyAmount;
	}

	public void setPolicyAmount(Double policyAmount) {
		this.policyAmount = policyAmount;
	}

	@Column(name = "selling_amount", nullable = false, precision = 22, scale = 0)
	public double getSellingAmount() {
		return this.sellingAmount;
	}

	public void setSellingAmount(double sellingAmount) {
		this.sellingAmount = sellingAmount;
	}

	@Column(name = "currency", length = 3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "note", length = 600)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "record_date", nullable = false, length = 19)
	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set getTourRestorants() {
		return this.tourRestorants;
	}

	public void setTourRestorants(Set tourRestorants) {
		this.tourRestorants = tourRestorants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tour")
	public Set getTourPaxes() {
		return this.tourPaxes;
	}

	public void setTourPaxes(Set tourPaxes) {
		this.tourPaxes = tourPaxes;
	}

}
