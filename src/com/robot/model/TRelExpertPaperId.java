package com.robot.model;

// Generated 2015-5-10 13:38:59 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TRelExpertPaperId generated by hbm2java
 */
@Embeddable
public class TRelExpertPaperId implements java.io.Serializable {

	private int expertId;
	private int paperId;

	public TRelExpertPaperId() {
	}

	public TRelExpertPaperId(int expertId, int paperId) {
		this.expertId = expertId;
		this.paperId = paperId;
	}

	@Column(name = "expertId", nullable = false)
	public int getExpertId() {
		return this.expertId;
	}

	public void setExpertId(int expertId) {
		this.expertId = expertId;
	}

	@Column(name = "paperId", nullable = false)
	public int getPaperId() {
		return this.paperId;
	}

	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TRelExpertPaperId))
			return false;
		TRelExpertPaperId castOther = (TRelExpertPaperId) other;

		return (this.getExpertId() == castOther.getExpertId())
				&& (this.getPaperId() == castOther.getPaperId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getExpertId();
		result = 37 * result + this.getPaperId();
		return result;
	}

}
