package org.skenny.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Feature {
	
	private long featureId;
	private Job job;
	
	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getFeatureId() {
		return featureId;
	}
	
	public void setFeatureId(long featureId) {
		this.featureId = featureId;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job job) {
		this.job = job;
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
	
	

}
