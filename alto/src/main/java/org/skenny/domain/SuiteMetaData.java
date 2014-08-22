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
public class SuiteMetaData {

	private long suiteMetaDataId;

	private String jobName;
	private String nodeName;
	private String productHash;
	private String os;
	private String buildType;
	private String jreVersion;
	private String jenkinsJobNumber;

	private Suite suite;

	private Date created;
	private Date updated;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public long getSuiteMetaDataId() {
		return suiteMetaDataId;
	}
	
	public void setSuiteMetaDataId(long suiteMetaDataId) {
		this.suiteMetaDataId = suiteMetaDataId;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	
	public String getNodeName() {
		return nodeName;
	}
	
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
	public String getProductHash() {
		return productHash;
	}
	
	public void setProductHash(String productHash) {
		this.productHash = productHash;
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getBuildType() {
		return buildType;
	}
	
	public void setBuildType(String buildType) {
		this.buildType = buildType;
	}
	
	public String getJreVersion() {
		return jreVersion;
	}
	
	public void setJreVersion(String jreVersion) {
		this.jreVersion = jreVersion;
	}
	
	public String getJenkinsJobNumber() {
		return jenkinsJobNumber;
	}
	
	public void setJenkinsJobNumber(String jenkinsJobNumber) {
		this.jenkinsJobNumber = jenkinsJobNumber;
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
