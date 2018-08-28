package com.chengge.admin.service;

import com.baomidou.mybatisplus.service.IService;
import com.chengge.admin.entity.UploadInfo;
/**
 * <p>
 * 文件上传配置 服务类
 * </p>
 *
 * @author wangl
 * @since 2018-07-06
 */
public interface UploadInfoService extends IService<UploadInfo> {

    public UploadInfo getOneInfo();

    public void updateInfo(UploadInfo uploadInfo);

}
