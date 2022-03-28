package com.jaron.joomall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-11 15:52:21
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

