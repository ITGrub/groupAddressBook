package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-6-8 15:09:26 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmployeeMedal generated by hbm2java
 */
@Entity
@Table(name="tb_c_employee_medal")
public class EmployeeMedal  implements java.io.Serializable {


     private String userMedalId;
     private Medal medal;
     private String employeeId;
     private String movementId;
     private String mark1;
     private String mark2;

    public EmployeeMedal() {
    }

	
    public EmployeeMedal(String userMedalId) {
        this.userMedalId = userMedalId;
    }
    public EmployeeMedal(String userMedalId, Medal medal, String employeeId, String movementId, String mark1, String mark2) {
       this.userMedalId = userMedalId;
       this.medal = medal;
       this.employeeId = employeeId;
       this.movementId = movementId;
       this.mark1 = mark1;
       this.mark2 = mark2;
    }
   
    @Id 
    @Column(name="user_medal_id", unique=true, nullable=false, length=32)
    public String getUserMedalId() {
        return this.userMedalId;
    }
    
    public void setUserMedalId(String userMedalId) {
        this.userMedalId = userMedalId;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="medal_id")
    public Medal getMedal() {
        return this.medal;
    }
    
    public void setMedal(Medal medal) {
        this.medal = medal;
    }
    
    @Column(name="employee_id", length=32)
    public String getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    
    @Column(name="movement_id", length=32)
    public String getMovementId() {
        return this.movementId;
    }
    
    public void setMovementId(String employeeId) {
        this.movementId = movementId;
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




}


