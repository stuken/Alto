package org.skenny.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Baseline {
	private long baselineId;
	private Set<CaseInfo> cases = new HashSet<CaseInfo>(0);
	
	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getBaselineId() {
		return baselineId;
	}
	
	public void setBaselineId(long baselineId) {
		this.baselineId = baselineId;
	}
	@ManyToMany(fetch = FetchType.LAZY)
	public Set<CaseInfo> getCases() {
		return cases;
	}
	
	public void setCases(Set<CaseInfo> cases) {
		this.cases = cases;
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
