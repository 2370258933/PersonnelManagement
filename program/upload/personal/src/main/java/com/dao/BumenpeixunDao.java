package com.dao;

import com.entity.BumenpeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenpeixunVO;
import com.entity.view.BumenpeixunView;


/**
 * 部门培训
 * 
 * @author 
 * @email 

 */
public interface BumenpeixunDao extends BaseMapper<BumenpeixunEntity> {
	
	List<BumenpeixunVO> selectListVO(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
	
	BumenpeixunVO selectVO(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
	
	List<BumenpeixunView> selectListView(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);

	List<BumenpeixunView> selectListView(Pagination page,@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
	
	BumenpeixunView selectView(@Param("ew") Wrapper<BumenpeixunEntity> wrapper);
	

}
