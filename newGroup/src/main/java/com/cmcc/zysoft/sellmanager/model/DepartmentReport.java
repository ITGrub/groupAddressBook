package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-6-11 22:40:07 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DepartmentReport generated by hbm2java
 */
@Entity
@Table(name="tb_c_department_report")
public class DepartmentReport  implements java.io.Serializable {


     private String departmentId;
     private Integer countTimes;
     private Integer avgTimes;
     private Integer maxTimes;
     private Integer countSteps;
     private Integer avgSteps;
     private Integer maxSteps;
     private Long countUseTime;
     private Long avgUseTime;
     private Long maxUseTime;
     private Integer maxLevel;
     private Integer maxOrder;
     private String mark1;
     private String mark2;

    public DepartmentReport() {
    }

	
    public DepartmentReport(String departmentId) {
        this.departmentId = departmentId;
    }
    public DepartmentReport(String departmentId, Integer countTimes, Integer avgTimes, Integer maxTimes, Integer countSteps, Integer avgSteps, Integer maxSteps, Long countUseTime, Long avgUseTime, Long maxUseTime, Integer maxLevel, Integer maxOrder, String mark1, String mark2) {
       this.departmentId = departmentId;
       this.countTimes = countTimes;
       this.avgTimes = avgTimes;
       this.maxTimes = maxTimes;
       this.countSteps = countSteps;
       this.avgSteps = avgSteps;
       this.maxSteps = maxSteps;
       this.countUseTime = countUseTime;
       this.avgUseTime = avgUseTime;
       this.maxUseTime = maxUseTime;
       this.maxLevel = maxLevel;
       this.maxOrder = maxOrder;
       this.mark1 = mark1;
       this.mark2 = mark2;
    }
   
     @Id 
    
    @Column(name="department_id", unique=true, nullable=false, length=32)
    public String getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    
    @Column(name="count_times")
    public Integer getCountTimes() {
        return this.countTimes;
    }
    
    public void setCountTimes(Integer countTimes) {
        this.countTimes = countTimes;
    }
    
    @Column(name="avg_times")
    public Integer getAvgTimes() {
        return this.avgTimes;
    }
    
    public void setAvgTimes(Integer avgTimes) {
        this.avgTimes = avgTimes;
    }
    
    @Column(name="max_times")
    public Integer getMaxTimes() {
        return this.maxTimes;
    }
    
    public void setMaxTimes(Integer maxTimes) {
        this.maxTimes = maxTimes;
    }
    
    @Column(name="count_steps")
    public Integer getCountSteps() {
        return this.countSteps;
    }
    
    public void setCountSteps(Integer countSteps) {
        this.countSteps = countSteps;
    }
    
    @Column(name="avg_steps")
    public Integer getAvgSteps() {
        return this.avgSteps;
    }
    
    public void setAvgSteps(Integer avgSteps) {
        this.avgSteps = avgSteps;
    }
    
    @Column(name="max_steps")
    public Integer getMaxSteps() {
        return this.maxSteps;
    }
    
    public void setMaxSteps(Integer maxSteps) {
        this.maxSteps = maxSteps;
    }
    
    @Column(name="count_use_time")
    public Long getCountUseTime() {
        return this.countUseTime;
    }
    
    public void setCountUseTime(Long countUseTime) {
        this.countUseTime = countUseTime;
    }
    
    @Column(name="avg_use_time")
    public Long getAvgUseTime() {
        return this.avgUseTime;
    }
    
    public void setAvgUseTime(Long avgUseTime) {
        this.avgUseTime = avgUseTime;
    }
    
    @Column(name="max_use_time")
    public Long getMaxUseTime() {
        return this.maxUseTime;
    }
    
    public void setMaxUseTime(Long maxUseTime) {
        this.maxUseTime = maxUseTime;
    }
    
    @Column(name="max_level")
    public Integer getMaxLevel() {
        return this.maxLevel;
    }
    
    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }
    
    @Column(name="max_order")
    public Integer getMaxOrder() {
        return this.maxOrder;
    }
    
    public void setMaxOrder(Integer maxOrder) {
        this.maxOrder = maxOrder;
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

