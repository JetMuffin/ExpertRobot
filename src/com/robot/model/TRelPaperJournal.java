package com.robot.model;

// Generated 2015-5-10 13:38:59 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TRelPaperJournal generated by hbm2java
 */
@Entity
@Table(name = "t_rel_paper_journal", catalog = "db_expert_robot")
public class TRelPaperJournal implements java.io.Serializable {

	private TRelPaperJournalId id;
	private TJournal TJournal;
	private TPaper TPaper;
	private String issue;

	public TRelPaperJournal() {
	}

	public TRelPaperJournal(TRelPaperJournalId id, TJournal TJournal,
			TPaper TPaper, String issue) {
		this.id = id;
		this.TJournal = TJournal;
		this.TPaper = TPaper;
		this.issue = issue;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "paperId", column = @Column(name = "paperId", nullable = false)),
			@AttributeOverride(name = "jourId", column = @Column(name = "jourId", nullable = false)) })
	public TRelPaperJournalId getId() {
		return this.id;
	}

	public void setId(TRelPaperJournalId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jourId", nullable = false, insertable = false, updatable = false)
	public TJournal getTJournal() {
		return this.TJournal;
	}

	public void setTJournal(TJournal TJournal) {
		this.TJournal = TJournal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paperId", nullable = false, insertable = false, updatable = false)
	public TPaper getTPaper() {
		return this.TPaper;
	}

	public void setTPaper(TPaper TPaper) {
		this.TPaper = TPaper;
	}

	@Column(name = "issue", nullable = false, length = 50)
	public String getIssue() {
		return this.issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

}
