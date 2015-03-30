package com.tam.model;

// Generated Mar 29, 2015 10:00:22 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "tam")
public class Role implements java.io.Serializable {

	private String code;
	private String explanation;
	private Set userRoles = new HashSet(0);
	private Set processes = new HashSet(0);

	public Role() {
	}

	public Role(String code) {
		this.code = code;
	}

	public Role(String code, String explanation, Set userRoles, Set processes) {
		this.code = code;
		this.explanation = explanation;
		this.userRoles = userRoles;
		this.processes = processes;
	}

	@Id
	@Column(name = "code", unique = true, nullable = false, length = 20)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "explanation", length = 100)
	public String getExplanation() {
		return this.explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "role_process", catalog = "tam", joinColumns = { @JoinColumn(name = "role_code", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "process_code", nullable = false, updatable = false) })
	public Set getProcesses() {
		return this.processes;
	}

	public void setProcesses(Set processes) {
		this.processes = processes;
	}

}