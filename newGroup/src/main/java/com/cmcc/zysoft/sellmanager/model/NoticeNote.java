package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Notice generated by hbm2java
 */
@Entity
@Table(name="tb_c_notice_note")
public class NoticeNote  implements java.io.Serializable {


	 private static final long serialVersionUID = 5760625193810142825L;
	 private String noteId;
	 private String noticeId;
     private Date sendTime;
     private String sendType;
     private Date userGetTime;
     private String userMobile;
     private String serialNumber;
     private String sendResult;
     private int sendNumber;
     private String mark1;
     private String mark2;


   
    public NoticeNote() {
	}



	public NoticeNote(String noteId, String noticeId, Date sendTime,
			String sendType, Date userGetTime, String userMobile,
			String serialNumber, String sendResult, int sendNumber,
			String mark1, String mark2) {
		this.noteId = noteId;
		this.noticeId = noticeId;
		this.sendTime = sendTime;
		this.sendType = sendType;
		this.userGetTime = userGetTime;
		this.userMobile = userMobile;
		this.serialNumber = serialNumber;
		this.sendResult = sendResult;
		this.sendNumber = sendNumber;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}






	@GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="note_id", unique=true, nullable=false, length=32)
	public String getNoteId() {
		return noteId;
	}



	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}


	@Column(name="notice_id", length=32)
	public String getNoticeId() {
		return noticeId;
	}



	public void setNoticeId(String noticeId) {
		this.noticeId = noticeId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="send_time")
	public Date getSendTime() {
		return sendTime;
	}



	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}


	@Column(name="send_type", length=1)
	public String getSendType() {
		return sendType;
	}



	public void setSendType(String sendType) {
		this.sendType = sendType;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="user_get_time")
	public Date getUserGetTime() {
		return userGetTime;
	}



	public void setUserGetTime(Date userGetTime) {
		this.userGetTime = userGetTime;
	}


	@Column(name="user_mobile",length=20)
	public String getUserMobile() {
		return userMobile;
	}



	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}


	@Column(name="serial_number",length=50)
	public String getSerialNumber() {
		return serialNumber;
	}



	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	@Column(name="send_result",length=1)
	public String getSendResult() {
		return sendResult;
	}



	public void setSendResult(String sendResult) {
		this.sendResult = sendResult;
	}

	@Column(name="send_number")
	public int getSendNumber() {
		return sendNumber;
	}



	public void setSendNumber(int sendNumber) {
		this.sendNumber = sendNumber;
	}



	@Column(name="mark1",length=50)
	public String getMark1() {
		return mark1;
	}



	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}


	@Column(name="mark2",length=50)
	public String getMark2() {
		return mark2;
	}



	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}
  
    
}


