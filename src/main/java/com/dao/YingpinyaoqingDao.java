package com.dao;

import com.entity.YingpinyaoqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingpinyaoqingVO;
import com.entity.view.YingpinyaoqingView;


/**
 * 通知面试
 * 
 * @author 
 * @email 
 * @date 2021-02-06 18:51:25
 */
public interface YingpinyaoqingDao extends BaseMapper<YingpinyaoqingEntity> {
	
	List<YingpinyaoqingVO> selectListVO(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
	
	YingpinyaoqingVO selectVO(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
	
	List<YingpinyaoqingView> selectListView(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);

	List<YingpinyaoqingView> selectListView(Pagination page,@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
	
	YingpinyaoqingView selectView(@Param("ew") Wrapper<YingpinyaoqingEntity> wrapper);
	
}
