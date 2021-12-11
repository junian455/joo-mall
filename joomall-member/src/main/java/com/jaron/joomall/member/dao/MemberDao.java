package com.jaron.joomall.member.dao;

import com.jaron.joomall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-11 15:46:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
