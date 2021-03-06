package org.apache.airavata.allocation.manager.db.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the REVIEWER_ALLOCATION_DETAILS database table.
 * 
 */
@Entity
@Table(name="REVIEWER_ALLOCATION_DETAILS")
@NamedQuery(name="ReviewerAllocationDetailEntity.findAll", query="SELECT r FROM ReviewerAllocationDetailEntity r")
public class ReviewerAllocationDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	@Column(name="APPLICATIONS_TO_BE_USED")
	private String applicationsToBeUsed;

	@Column(name="AWARD_ALLOCATION")
	private BigInteger awardAllocation;

	@Column(name="DISK_USAGE_RANGE_PER_JOB")
	private BigInteger diskUsageRangePerJob;

	@Lob
	private byte[] documents;

	@Column(name="END_DATE")
	private BigInteger endDate;

	@Lob
	@Column(name="FIELD_OF_SCIENCE")
	private String fieldOfScience;

	@Lob
	private String keywords;

	@Column(name="MAX_MEMORY_PER_CPU")
	private BigInteger maxMemoryPerCpu;

	@Column(name="NUMBER_OF_CPU_PER_JOB")
	private BigInteger numberOfCpuPerJob;

	@Lob
	@Column(name="PROJECT_DESCRIPTION")
	private String projectDescription;

	@Column(name="PROJECT_ID")
	private String projectId;

	@Lob
	@Column(name="PROJECT_REVIEWED_AND_FUNDED_BY")
	private String projectReviewedAndFundedBy;

	@Column(name="REQUESTED_DATE")
	private BigInteger requestedDate;

	@Column(name="SERVICE_UNITS")
	private BigInteger serviceUnits;

	@Lob
	@Column(name="SPECIFIC_RESOURCE_SELECTION")
	private String specificResourceSelection;

	@Column(name="START_DATE")
	private BigInteger startDate;

	private String status;

	@Lob
	private String title;

	@Column(name="TYPE_OF_ALLOCATION")
	private String typeOfAllocation;

	@Column(name="TYPICAL_SU_PER_JOB")
	private BigInteger typicalSuPerJob;

	private String username;

	public ReviewerAllocationDetailEntity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicationsToBeUsed() {
		return this.applicationsToBeUsed;
	}

	public void setApplicationsToBeUsed(String applicationsToBeUsed) {
		this.applicationsToBeUsed = applicationsToBeUsed;
	}

	public BigInteger getAwardAllocation() {
		return this.awardAllocation;
	}

	public void setAwardAllocation(BigInteger awardAllocation) {
		this.awardAllocation = awardAllocation;
	}

	public BigInteger getDiskUsageRangePerJob() {
		return this.diskUsageRangePerJob;
	}

	public void setDiskUsageRangePerJob(BigInteger diskUsageRangePerJob) {
		this.diskUsageRangePerJob = diskUsageRangePerJob;
	}

	public byte[] getDocuments() {
		return this.documents;
	}

	public void setDocuments(byte[] documents) {
		this.documents = documents;
	}

	public BigInteger getEndDate() {
		return this.endDate;
	}

	public void setEndDate(BigInteger endDate) {
		this.endDate = endDate;
	}

	public String getFieldOfScience() {
		return this.fieldOfScience;
	}

	public void setFieldOfScience(String fieldOfScience) {
		this.fieldOfScience = fieldOfScience;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public BigInteger getMaxMemoryPerCpu() {
		return this.maxMemoryPerCpu;
	}

	public void setMaxMemoryPerCpu(BigInteger maxMemoryPerCpu) {
		this.maxMemoryPerCpu = maxMemoryPerCpu;
	}

	public BigInteger getNumberOfCpuPerJob() {
		return this.numberOfCpuPerJob;
	}

	public void setNumberOfCpuPerJob(BigInteger numberOfCpuPerJob) {
		this.numberOfCpuPerJob = numberOfCpuPerJob;
	}

	public String getProjectDescription() {
		return this.projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectReviewedAndFundedBy() {
		return this.projectReviewedAndFundedBy;
	}

	public void setProjectReviewedAndFundedBy(String projectReviewedAndFundedBy) {
		this.projectReviewedAndFundedBy = projectReviewedAndFundedBy;
	}

	public BigInteger getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(BigInteger requestedDate) {
		this.requestedDate = requestedDate;
	}

	public BigInteger getServiceUnits() {
		return this.serviceUnits;
	}

	public void setServiceUnits(BigInteger serviceUnits) {
		this.serviceUnits = serviceUnits;
	}

	public String getSpecificResourceSelection() {
		return this.specificResourceSelection;
	}

	public void setSpecificResourceSelection(String specificResourceSelection) {
		this.specificResourceSelection = specificResourceSelection;
	}

	public BigInteger getStartDate() {
		return this.startDate;
	}

	public void setStartDate(BigInteger startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTypeOfAllocation() {
		return this.typeOfAllocation;
	}

	public void setTypeOfAllocation(String typeOfAllocation) {
		this.typeOfAllocation = typeOfAllocation;
	}

	public BigInteger getTypicalSuPerJob() {
		return this.typicalSuPerJob;
	}

	public void setTypicalSuPerJob(BigInteger typicalSuPerJob) {
		this.typicalSuPerJob = typicalSuPerJob;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}