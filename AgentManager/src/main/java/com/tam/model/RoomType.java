package com.tam.model;

// Generated Mar 29, 2015 10:00:22 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RoomType generated by hbm2java
 */
@Entity
@Table(name = "room_type", catalog = "tam")
public class RoomType implements java.io.Serializable {

	private String roomTypeCode;
	private String explanation;

	public RoomType() {
	}

	public RoomType(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	public RoomType(String roomTypeCode, String explanation) {
		this.roomTypeCode = roomTypeCode;
		this.explanation = explanation;
	}

	@Id
	@Column(name = "room_type_code", unique = true, nullable = false, length = 20)
	public String getRoomTypeCode() {
		return this.roomTypeCode;
	}

	public void setRoomTypeCode(String roomTypeCode) {
		this.roomTypeCode = roomTypeCode;
	}

	@Column(name = "explanation", length = 200)
	public String getExplanation() {
		return this.explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

}
