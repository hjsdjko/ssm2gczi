package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoxiujieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoxiujieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoxiujieguoView;


/**
 * 报修结果
 *
 * @author 
 * @email 
 * @date 2021-04-28 13:18:03
 */
public interface BaoxiujieguoService extends IService<BaoxiujieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoxiujieguoVO> selectListVO(Wrapper<BaoxiujieguoEntity> wrapper);
   	
   	BaoxiujieguoVO selectVO(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
   	
   	List<BaoxiujieguoView> selectListView(Wrapper<BaoxiujieguoEntity> wrapper);
   	
   	BaoxiujieguoView selectView(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoxiujieguoEntity> wrapper);
   	
}

