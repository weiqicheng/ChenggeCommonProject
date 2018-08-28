package com.chengge.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.chengge.admin.entity.Site;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangl
 * @since 2017-12-30
 */
public interface SiteService extends IService<Site> {

    Site getCurrentSite();

    void updateSite(Site site);
	
}
