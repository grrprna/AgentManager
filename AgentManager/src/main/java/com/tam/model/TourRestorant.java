package com.tam.model;

// Generated Mar 29, 2015 10:00:22 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TourRestorant generated by hbm2java
 */
@Entity
@Table(name = "tour_restorant", catalog = "tam")
public class TourRestorant implements java.io.Serializable {

	private TourRestorantId id;
	private Tour tour;
	private Restorant restorant;
	private double restorantFare;
	private String currency;

	public TourRestorant() {
	}

	public TourRestorant(TourRestorantId id, Tour tour, Restorant restorant,
			double restorantFare, String currency) {
		this.id = id;
		this.tour = tour;
		this.restorant = restorant;
		this.restorantFare = restorantFare;
		this.currency = currency;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "tourId", column = @Column(name = "tour_id", nullable = false)),
			@AttributeOverride(name = "restorantId", column = @Column(name = "restorant_id", nullable = false)) })
	public TourRestorantId getId() {
		return this.id;
	}

	public void setId(TourRestorantId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tour_id", nullable = false, insertable = false, updatable = false)
	public Tour getTour() {
		return this.tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restorant_id", nullable = false, insertable = false, updatable = false)
	public Restorant getRestorant() {
		return this.restorant;
	}

	public void setRestorant(Restorant restorant) {
		this.restorant = restorant;
	}

	@Column(name = "restorant_fare", nullable = false, precision = 22, scale = 0)
	public double getRestorantFare() {
		return this.restorantFare;
	}

	public void setRestorantFare(double restorantFare) {
		this.restorantFare = restorantFare;
	}

	@Column(name = "currency", nullable = false, length = 3)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
