// ~ CopyRight © 2012 USTC SINOVATE  SOFTWARE CO.LTD All Rights Reserved.
package com.cmcc.zysoft.sysmanage.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cmcc.zysoft.sellmanager.model.Areas;
import com.cmcc.zysoft.sysmanage.dao.TownDao;
import com.starit.common.dao.hibernate.HibernateBaseDao;
import com.starit.common.dao.service.BaseServiceImpl;

/**
 * @author 李三来
 * <br />邮箱： li.sanlai@ustcinfo.com
 * <br />描述：
 * <br />@version:1.0.0
 * <br />日期： 2012-12-12 上午11:04:56
 * <br />CopyRight © 2012 USTC SINOVATE  SOFTWARE CO.LTD All Rights Reserved.
 */
@Service
public class TownService extends BaseServiceImpl<Areas, Integer> {
	
	@Resource
	private TownDao dao;
	
	@Override
	public HibernateBaseDao<Areas, Integer> getHibernateBaseDao() {
		return this.dao;
	}

	/**
	 * 根据城市获取区县列表
	 * @param cityid 城市ID
	 * @return 区县列表
	 */
	public List<Map<String, Object>> areas(String cityid){
		return dao.areas(cityid);
	}
	
}
