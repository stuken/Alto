package org.skenny.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CaseInfo {
	private long caseInfoId;
	private Suite suite;
	private double duration;
	private String className;
	private String testName;
	private boolean skipped;
	private long failedSince;	
	private String errorStackTrace;
	private String errorDetails;
	
	private Set<Baseline> baselines = new HashSet<Baseline>(0);
	
	private Date created;
	private Date updated;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCaseInfoId() {
		return caseInfoId;
	}
	
	public void setCaseInfoId(long caseInfoId) {
		this.caseInfoId = caseInfoId;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	public Suite getSuite() {
		return suite;
	}
	
	public void setSuite(Suite suite) {
		this.suite = suite;
	}
	
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getTestName() {
		return testName;
	}
	
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
	public boolean isSkipped() {
		return skipped;
	}
	
	public void setSkipped(boolean skipped) {
		this.skipped = skipped;
	}
	
	public long getFailedSince() {
		return failedSince;
	}
	
	public void setFailedSince(long failedSince) {
		this.failedSince = failedSince;
	}
	
	@Lob
	public String getErrorStackTrace() {
		return errorStackTrace;
	}
	
	public void setErrorStackTrace(String errorStackTrace) {
		this.errorStackTrace = errorStackTrace;
	}
	
	public String getErrorDetails() {
		return errorDetails;
	}
	
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	public Set<Baseline> getBaselines() {
		return baselines;
	}

	public void setBaselines(Set<Baseline> baselines) {
		this.baselines = baselines;
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
