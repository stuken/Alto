package org.skenny.domain;

import java.net.URL;
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
public class BugReport {
	private long bugReportId;
	private Set<Baseline> baselines = new HashSet<Baseline>(0);
	private URL bugUrl;
	private boolean isDev;
	private boolean isQa;
	
	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getBugReportId() {
		return bugReportId;
	}
	
	public void setBugReportId(long bugReportId) {
		this.bugReportId = bugReportId;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	public Set<Baseline> getBaselines() {
		return baselines;
	}
	
	public void setBaselines(Set<Baseline> baselines) {
		this.baselines = baselines;
	}
	
	public URL getBugUrl() {
		return bugUrl;
	}
	
	public void setBugUrl(URL bugUrl) {
		this.bugUrl = bugUrl;
	}
	
	public boolean isDev() {
		return isDev;
	}
	
	public void setDev(boolean isDev) {
		this.isDev = isDev;
	}
	
	public boolean isQa() {
		return isQa;
	}
	
	public void setQa(boolean isQa) {
		this.isQa = isQa;
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
