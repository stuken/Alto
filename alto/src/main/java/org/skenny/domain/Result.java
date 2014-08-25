package org.skenny.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Result {
	private long resultId;
	private double duration;

	private Date created;
	private Date updated;	

	private Set<Suite> suites = new HashSet<Suite>(0);
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getResultId() {
		return resultId;
	}

	public void setResultId(long resultId) {
		this.resultId = resultId;
	}
	
	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@OneToMany(fetch = FetchType.LAZY)
	public Set<Suite> getSuites() {
		return suites;
	}

	public void setSuites(Set<Suite> suites) {
		this.suites = suites;
	}

}
