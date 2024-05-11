package com.entity.view;

import com.entity.BaoxiujieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报修结果
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 13:18:03
 */
@TableName("baoxiujieguo")
public class BaoxiujieguoView  extends BaoxiujieguoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoxiujieguoView(){
	}
 
 	public BaoxiujieguoView(BaoxiujieguoEntity baoxiujieguoEntity){
 	try {
			BeanUtils.copyProperties(this, baoxiujieguoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
