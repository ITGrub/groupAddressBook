package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-2-28 14:16:39 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * DictData generated by hbm2java
 */
@Entity
@Table(name="tb_c_dict_data")
public class DictData  implements java.io.Serializable {


	 private static final long serialVersionUID = -3909890850249042794L;
	 private String dataId;
     private DictType dictType;
     private String dataCode;
     private String dataContent;
     private String description;
     private String status;
     private Integer displayOrder;

    public DictData() {
    }

	
    public DictData(String dataId) {
        this.dataId = dataId;
    }
    public DictData(String dataId, DictType dictType, String dataCode, String dataContent, String description, String status, Integer displayOrder) {
       this.dataId = dataId;
       this.dictType = dictType;
       this.dataCode = dataCode;
       this.dataContent = dataContent;
       this.description = description;
       this.status = status;
       this.displayOrder = displayOrder;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="data_id", unique=true, nullable=false, length=32)
    public String getDataId() {
        return this.dataId;
    }
    
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="type_id")
    public DictType getDictType() {
        return this.dictType;
    }
    
    public void setDictType(DictType dictType) {
        this.dictType = dictType;
    }
    
    @Column(name="data_code", length=32)
    public String getDataCode() {
        return this.dataCode;
    }
    
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }
    
    @Column(name="data_content", length=64)
    public String getDataContent() {
        return this.dataContent;
    }
    
    public void setDataContent(String dataContent) {
        this.dataContent = dataContent;
    }
    
    @Column(name="description", length=256)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="status", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Column(name="display_order")
    public Integer getDisplayOrder() {
        return this.displayOrder;
    }
    
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }




}


