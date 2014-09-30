package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-8-16 19:28:35 by Hibernate Tools 3.2.2.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Movement generated by hbm2java
 */
@Entity
@Table(name="tb_b_movement")
public class Movement  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String movementId;
     private String movementName;
     private Date movementStartDate;
     private Date movementEndDate;
     private String movementStatus;
     private String mark1;
     private String mark2;
     private String companyId;
     private String orderType;
     private String movementPicture;
     private String medalSysId;
     private String movementFlag;
     private String parentMovementId;
     private String departmentId;
     private Set<MovementUsers> movementUserses = new HashSet<MovementUsers>(0);

    public Movement() {
    }

	
    public Movement(String movementId) {
        this.movementId = movementId;
    }
    public Movement(String movementId, String movementName, Date movementStartDate, Date movementEndDate, String movementStatus, String mark1, String mark2, String companyId, String orderType, String movementPicture, String medalSysId, String movementFlag, String parentMovementId, String departmentId, Set<MovementUsers> movementUserses) {
       this.movementId = movementId;
       this.movementName = movementName;
       this.movementStartDate = movementStartDate;
       this.movementEndDate = movementEndDate;
       this.movementStatus = movementStatus;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.movementUserses = movementUserses;
       this.companyId = companyId;
       this.orderType = orderType;
       this.movementPicture = movementPicture;
       this.movementFlag = movementFlag;
       this.parentMovementId = parentMovementId;
       this.departmentId = departmentId;
       this.setMedalSysId(medalSysId);
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
   	@Id
   	@GeneratedValue(generator = "generator")
    @Column(name="movement_id", unique=true, nullable=false, length=32)
    public String getMovementId() {
        return this.movementId;
    }
    
    public void setMovementId(String movementId) {
        this.movementId = movementId;
    }
    
    @Column(name="movement_name", length=200)
    public String getMovementName() {
        return this.movementName;
    }
    
    public void setMovementName(String movementName) {
        this.movementName = movementName;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="movement_start_date", length=19)
    public Date getMovementStartDate() {
        return this.movementStartDate;
    }
    
    public void setMovementStartDate(Date movementStartDate) {
        this.movementStartDate = movementStartDate;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="movement_end_date", length=19)
    public Date getMovementEndDate() {
        return this.movementEndDate;
    }
    
    public void setMovementEndDate(Date movementEndDate) {
        this.movementEndDate = movementEndDate;
    }
    
    @Column(name="movement_status", length=2)
    public String getMovementStatus() {
        return this.movementStatus;
    }
    
    public void setMovementStatus(String movementStatus) {
        this.movementStatus = movementStatus;
    }
    
    @Column(name="mark1", length=200)
    public String getMark1() {
        return this.mark1;
    }
    
    public void setMark1(String mark1) {
        this.mark1 = mark1;
    }
    
    @Column(name="mark2", length=200)
    public String getMark2() {
        return this.mark2;
    }
    
    public void setMark2(String mark2) {
        this.mark2 = mark2;
    }
    
    @Column(name="company_id", length=200)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="order_type", length=200)
    public String getOrderType() {
        return this.orderType;
    }
    
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    @Column(name="movement_picture", length=200)
    public String getMovementPicture() {
        return this.movementPicture;
    }
    
    public void setMovementPicture(String movementPicture) {
        this.movementPicture = movementPicture;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="movement")
    public Set<MovementUsers> getMovementUserses() {
        return this.movementUserses;
    }
    
    public void setMovementUserses(Set<MovementUsers> movementUserses) {
        this.movementUserses = movementUserses;
    }


    @Column(name="medal_sys_id", length=200)
	public String getMedalSysId() {
		return medalSysId;
	}

	public void setMedalSysId(String medalSysId) {
		this.medalSysId = medalSysId;
	}
	
	@Column(name="movement_flag", length=200)
	public String getMovementFlag() {
		return movementFlag;
	}

	public void setMovementFlag(String movementFlag) {
		this.movementFlag = movementFlag;
	}

	@Column(name="parent_movement_id", length=200)
	public String getParentMovementId() {
		return parentMovementId;
	}

	public void setParentMovementId(String parentMovementId) {
		this.parentMovementId = parentMovementId;
	}
	
	@Column(name="department_id",length=32)
	public String getDepartmentId()
	{
		return departmentId;
	}
	
	public void setDepartmentId(String departmentId)
	{
		this.departmentId = departmentId;
	}

}

