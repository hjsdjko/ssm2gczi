package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaoxiujieguoDao;
import com.entity.BaoxiujieguoEntity;
import com.service.BaoxiujieguoService;
import com.entity.vo.BaoxiujieguoVO;
import com.entity.view.BaoxiujieguoView;

@Service("baoxiujieguoService")
public class BaoxiujieguoServiceImpl extends ServiceImpl<BaoxiujieguoDao, BaoxiujieguoEntity> implements BaoxiujieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoxiujieguoEntity> page = this.selectPage(
                new Query<BaoxiujieguoEntity>(params).getPage(),
                new EntityWrapper<BaoxiujieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoxiujieguoEntity> wrapper) {
		  Page<BaoxiujieguoView> page =new Query<BaoxiujieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoxiujieguoVO> selectListVO(Wrapper<BaoxiujieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoxiujieguoVO selectVO(Wrapper<BaoxiujieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoxiujieguoView> selectListView(Wrapper<BaoxiujieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoxiujieguoView selectView(Wrapper<BaoxiujieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
