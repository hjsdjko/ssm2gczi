package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.BaoxiujieguoEntity;
import com.entity.view.BaoxiujieguoView;

import com.service.BaoxiujieguoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 报修结果
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-28 13:18:03
 */
@RestController
@RequestMapping("/baoxiujieguo")
public class BaoxiujieguoController {
    @Autowired
    private BaoxiujieguoService baoxiujieguoService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BaoxiujieguoEntity baoxiujieguo, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			baoxiujieguo.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoxiujieguoEntity> ew = new EntityWrapper<BaoxiujieguoEntity>();
		PageUtils page = baoxiujieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiujieguo), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BaoxiujieguoEntity baoxiujieguo, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			baoxiujieguo.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BaoxiujieguoEntity> ew = new EntityWrapper<BaoxiujieguoEntity>();
		PageUtils page = baoxiujieguoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, baoxiujieguo), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BaoxiujieguoEntity baoxiujieguo){
       	EntityWrapper<BaoxiujieguoEntity> ew = new EntityWrapper<BaoxiujieguoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( baoxiujieguo, "baoxiujieguo")); 
        return R.ok().put("data", baoxiujieguoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BaoxiujieguoEntity baoxiujieguo){
        EntityWrapper< BaoxiujieguoEntity> ew = new EntityWrapper< BaoxiujieguoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( baoxiujieguo, "baoxiujieguo")); 
		BaoxiujieguoView baoxiujieguoView =  baoxiujieguoService.selectView(ew);
		return R.ok("查询报修结果成功").put("data", baoxiujieguoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BaoxiujieguoEntity baoxiujieguo = baoxiujieguoService.selectById(id);
        return R.ok().put("data", baoxiujieguo);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BaoxiujieguoEntity baoxiujieguo = baoxiujieguoService.selectById(id);
        return R.ok().put("data", baoxiujieguo);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BaoxiujieguoEntity baoxiujieguo, HttpServletRequest request){
    	baoxiujieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiujieguo);

        baoxiujieguoService.insert(baoxiujieguo);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BaoxiujieguoEntity baoxiujieguo, HttpServletRequest request){
    	baoxiujieguo.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(baoxiujieguo);
    	baoxiujieguo.setUserid((Long)request.getSession().getAttribute("userId"));

        baoxiujieguoService.insert(baoxiujieguo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BaoxiujieguoEntity baoxiujieguo, HttpServletRequest request){
        //ValidatorUtils.validateEntity(baoxiujieguo);
        baoxiujieguoService.updateById(baoxiujieguo);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        baoxiujieguoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<BaoxiujieguoEntity> wrapper = new EntityWrapper<BaoxiujieguoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = baoxiujieguoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
