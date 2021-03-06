package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-22 21:25:25 by Hibernate Tools 3.2.2.GA


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

import org.hibernate.annotations.GenericGenerator;

/**
 * Group generated by hbm2java
 */
@Entity
@Table(name="tb_b_group")
public class Group  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = -120604259285688553L;
	 private String groupId;
     private String groupName;
     private String remark;
     private String mark1;
     private String mark2;
     private Set<GroupUsers> groupUserses = new HashSet<GroupUsers>(0);

    public Group() {
    }

	
    public Group(String groupId) {
        this.groupId = groupId;
    }
    public Group(String groupId, String groupName, String remark, String mark1, String mark2, Set<GroupUsers> groupUserses) {
       this.groupId = groupId;
       this.groupName = groupName;
       this.remark = remark;
       this.mark1 = mark1;
       this.mark2 = mark2;
       this.groupUserses = groupUserses;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="group_id", unique=true, nullable=false, length=32)
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    
    @Column(name="group_name", length=80)
    public String getGroupName() {
        return this.groupName;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    @Column(name="remark", length=400)
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
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
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="group")
    public Set<GroupUsers> getGroupUserses() {
        return this.groupUserses;
    }
    
    public void setGroupUserses(Set<GroupUsers> groupUserses) {
        this.groupUserses = groupUserses;
    }




}


