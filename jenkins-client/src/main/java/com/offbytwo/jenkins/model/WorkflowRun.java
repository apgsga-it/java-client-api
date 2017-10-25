package com.offbytwo.jenkins.model;

import java.util.Date;
import java.util.List;

public class WorkflowRun extends BaseModel {

	private String id;
	private String name;
	private String status;
	private Date startTimeMillis;
	private Date endTimeMillis;
	private long durationMillis;
	private long queueDurationMillis;
	private long pauseDurationMillis;
	private List<Stage> stages;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartTimeMillis() {
		return startTimeMillis;
	}

	public void setStartTimeMillis(Date startTimeMillis) {
		this.startTimeMillis = startTimeMillis;
	}

	public Date getEndTimeMillis() {
		return endTimeMillis;
	}

	public void setEndTimeMillis(Date endTimeMillis) {
		this.endTimeMillis = endTimeMillis;
	}

	public long getDurationMillis() {
		return durationMillis;
	}

	public void setDurationMillis(long durationMillis) {
		this.durationMillis = durationMillis;
	}

	public long getQueueDurationMillis() {
		return queueDurationMillis;
	}

	public void setQueueDurationMillis(long queueDurationMillis) {
		this.queueDurationMillis = queueDurationMillis;
	}

	public long getPauseDurationMillis() {
		return pauseDurationMillis;
	}

	public void setPauseDurationMillis(long pauseDurationMillis) {
		this.pauseDurationMillis = pauseDurationMillis;
	}

	public List<Stage> getStages() {
		return stages;
	}

	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	
	public boolean isPausedPendingInput() {
		return getStatus().equals("PAUSED_PENDING_INPUT"); 
	}
	
	public boolean isInProgress() {
		return getStatus().equals("IN_PROGRESS"); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (durationMillis ^ (durationMillis >>> 32));
		result = prime * result + ((endTimeMillis == null) ? 0 : endTimeMillis.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (pauseDurationMillis ^ (pauseDurationMillis >>> 32));
		result = prime * result + (int) (queueDurationMillis ^ (queueDurationMillis >>> 32));
		result = prime * result + ((stages == null) ? 0 : stages.hashCode());
		result = prime * result + ((startTimeMillis == null) ? 0 : startTimeMillis.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkflowRun other = (WorkflowRun) obj;
		if (durationMillis != other.durationMillis)
			return false;
		if (endTimeMillis == null) {
			if (other.endTimeMillis != null)
				return false;
		} else if (!endTimeMillis.equals(other.endTimeMillis))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pauseDurationMillis != other.pauseDurationMillis)
			return false;
		if (queueDurationMillis != other.queueDurationMillis)
			return false;
		if (stages == null) {
			if (other.stages != null)
				return false;
		} else if (!stages.equals(other.stages))
			return false;
		if (startTimeMillis == null) {
			if (other.startTimeMillis != null)
				return false;
		} else if (!startTimeMillis.equals(other.startTimeMillis))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WorkflowRun [id=" + id + ", name=" + name + ", status=" + status + ", startTimeMillis="
				+ startTimeMillis + ", endTimeMillis=" + endTimeMillis + ", durationMillis=" + durationMillis
				+ ", queueDurationMillis=" + queueDurationMillis + ", pauseDurationMillis=" + pauseDurationMillis
				+ ", stages=" + stages + "]";
	}

}
