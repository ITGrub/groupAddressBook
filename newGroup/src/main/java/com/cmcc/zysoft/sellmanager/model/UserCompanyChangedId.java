package com.cmcc.zysoft.sellmanager.model;
// Generated 2013-5-24 16:42:28 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserCompanyChangedId generated by hbm2java
 */
@Embeddable
public class UserCompanyChangedId  implements java.io.Serializable {


     /**
	 * 属性名称：serialVersionUID <br/>
	 * 类型：long
	 */
	 private static final long serialVersionUID = -8376241339096166375L;
	 private String userCompanyId;
     private int groupVersionNum;

    public UserCompanyChangedId() {
    }

    public UserCompanyChangedId(String userCompanyId, int groupVersionNum) {
       this.userCompanyId = userCompanyId;
       this.groupVersionNum = groupVersionNum;
    }
   

    @Column(name="user_company_id", nullable=false, length=32)
    public String getUserCompanyId() {
        return this.userCompanyId;
    }
    
    public void setUserCompanyId(String userCompanyId) {
        this.userCompanyId = userCompanyId;
    }

    @Column(name="group_version_num", nullable=false)
    public int getGroupVersionNum() {
        return this.groupVersionNum;
    }
    
    public void setGroupVersionNum(int groupVersionNum) {
        this.groupVersionNum = groupVersionNum;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserCompanyChangedId) ) return false;
		 UserCompanyChangedId castOther = ( UserCompanyChangedId ) other; 
         
		 return ( (this.getUserCompanyId()==castOther.getUserCompanyId()) || ( this.getUserCompanyId()!=null && castOther.getUserCompanyId()!=null && this.getUserCompanyId().equals(castOther.getUserCompanyId()) ) )
 && (this.getGroupVersionNum()==castOther.getGroupVersionNum());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUserCompanyId() == null ? 0 : this.getUserCompanyId().hashCode() );
         result = 37 * result + this.getGroupVersionNum();
         return result;
   }   


}

