package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


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
 * DepartmentChanged generated by hbm2java
 */
@Entity
@Table(name="tb_c_department_changed")
public class DepartmentChanged  implements java.io.Serializable {


	 private static final long serialVersionUID = -8004276516397518101L;
	 private DepartmentChangedId id;
     private DepartmentVersion departmentVersion;
     private Department department;
     private String updateType;

    public DepartmentChanged() {
    }

	
    public DepartmentChanged(DepartmentChangedId id, DepartmentVersion departmentVersion, Department department) {
        this.id = id;
        this.departmentVersion = departmentVersion;
        this.department = department;
    }
    public DepartmentChanged(DepartmentChangedId id, DepartmentVersion departmentVersion, Department department, String updateType) {
       this.id = id;
       this.departmentVersion = departmentVersion;
       this.department = department;
       this.updateType = updateType;
    }
   
    @EmbeddedId
    @AttributeOverrides( {
    @AttributeOverride(name="departmentId", column=@Column(name="department_id", nullable=false, length=32) ), 
    @AttributeOverride(name="departmentVersionNum", column=@Column(name="department_version_num", nullable=false) ) } )
    public DepartmentChangedId getId() {
        return this.id;
    }
    
    public void setId(DepartmentChangedId id) {
        this.id = id;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="department_version_num", nullable=false, insertable=false, updatable=false)
    public DepartmentVersion getDepartmentVersion() {
        return this.departmentVersion;
    }
    
    public void setDepartmentVersion(DepartmentVersion departmentVersion) {
        this.departmentVersion = departmentVersion;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="department_id", nullable=false, insertable=false, updatable=false)
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    @Column(name="update_type", length=1)
    public String getUpdateType() {
        return this.updateType;
    }
    
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }




}


