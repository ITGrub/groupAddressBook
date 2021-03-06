package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-10-22 10:45:38 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Cache generated by hbm2java
 */
@Entity
@Table(name="tb_c_cache")
public class UCache  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cacheId;
     private String companyId;
     private String h;
     private String content;

    public UCache() {
    }

	
    public UCache(String cacheId) {
        this.cacheId = cacheId;
    }
    public UCache(String cacheId, String companyId, String h, String content) {
       this.cacheId = cacheId;
       this.companyId = companyId;
       this.h = h;
       this.content = content;
    }
   
    @GenericGenerator(name = "generator", strategy = "uuid.hex")
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="cache_id", unique=true, nullable=false, length=32)
    public String getCacheId() {
        return this.cacheId;
    }
    
    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }
    
    @Column(name="company_id", length=32)
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="h", length=32)
    public String getH() {
        return this.h;
    }
    
    public void setH(String h) {
        this.h = h;
    }
    
    @Column(name="content", length=65535000)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }




}


