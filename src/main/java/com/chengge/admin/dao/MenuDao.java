package com.chengge.admin.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.chengge.admin.entity.Menu;
import com.chengge.admin.entity.VO.ShowMenu;


import java.util.List;
import java.util.Map;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author wangl
 * @since 2017-10-31
 */

public interface MenuDao extends BaseMapper<Menu> {

    List<Menu> showAllMenusList(Map map);

    List<Menu> getMenus(Map map);

    List<ShowMenu> selectShowMenuByUser(Map<String,Object> map);
}