package org.skenny.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Job {
	private long jobId;
	private String jobName;
	private Owner owner;
	private Feature feature;
	
	private Suite suite;
	
	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getJobId() {
		return jobId;
	}
	
	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	@ManyToOne(fetch  = FetchType.LAZY)
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	public Feature getFeature() {
		return feature;
	}
	
	public void setFeature(Feature feature) {
		this.feature = feature;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	public Suite getSuite() {
		return suite;
	}
	
	public void setSuite(Suite suite) {
		this.suite = suite;
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