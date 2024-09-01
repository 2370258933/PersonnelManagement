package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiabanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiabanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiabanshenqingView;


/**
 * 加班申请
 *
 * @author 
 * @email 

 */
public interface JiabanshenqingService extends IService<JiabanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiabanshenqingVO> selectListVO(Wrapper<JiabanshenqingEntity> wrapper);
   	
   	JiabanshenqingVO selectVO(@Param("ew") Wrapper<JiabanshenqingEntity> wrapper);
   	
   	List<JiabanshenqingView> selectListView(Wrapper<JiabanshenqingEntity> wrapper);
   	
   	JiabanshenqingView selectView(@Param("ew") Wrapper<JiabanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiabanshenqingEntity> wrapper);
   	

}

