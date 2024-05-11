package com.dao;

import com.entity.BaoxiujieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiujieguoVO;
import com.entity.view.BaoxiujieguoView;


/**
 * 报修结果
 * 
 * @author 
 * @email 
 * @date 2021-04-28 13:18:03
 */
public interface BaoxiujieguoDao extends BaseMapper<BaoxiujieguoEntity> {
	
	List<BaoxiujieguoVO> selectListVO(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
	
	BaoxiujieguoVO selectVO(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
	
	List<BaoxiujieguoView> selectListView(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);

	List<BaoxiujieguoView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
	
	BaoxiujieguoView selectView(@Param("ew") Wrapper<BaoxiujieguoEntity> wrapper);
	
}
