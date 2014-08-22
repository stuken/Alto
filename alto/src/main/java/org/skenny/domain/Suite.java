package org.skenny.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Suite {
	private long suiteId;
	private String name;
	private String filePath;
	private String stdout;
	private String stderr;
	private double duration;
	
	private Result result;
	
	private Set<CaseInfo> cases = new HashSet<CaseInfo>(0);
	
	private SuiteMetaData suiteMetaData;

	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public long getSuiteId() {
		return suiteId;
	}
	
	public void setSuiteId(long suiteId) {
		this.suiteId = suiteId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Lob
	public String getStdout() {
		return stdout;
	}
	
	public void setStdout(String stdout) {
		this.stdout = stdout;
	}
	
	@Lob
	public String getStderr() {
		return stderr;
	}
	
	public void setStderr(String stderr) {
		this.stderr = stderr;
	}
	public double getDuration() {
		return duration;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	public Result getResult() {
		return result;
	}
	
	public void setResult(Result result) {
		this.result = result;
	}
	
	@OneToMany(fetch = FetchType.LAZY)
	public Set<CaseInfo> getCases() {
		return cases;
	}

	public void setCases(Set<CaseInfo> cases) {
		this.cases = cases;
	}

	@OneToOne(fetch = FetchType.LAZY)
	public SuiteMetaData getSuiteMetaData() {
		return suiteMetaData;
	}

	public void setSuiteMetaData(SuiteMetaData suiteMetaData) {
		this.suiteMetaData = suiteMetaData;
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
