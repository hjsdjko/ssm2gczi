const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"新闻信息","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"商品信息","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息管理"},{"child":[{"buttons":["查看","修改","删除","处理"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"报修结果","menuJump":"列表","tableName":"baoxiujieguo"}],"menu":"报修结果管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"已退款订单","tableName":"orders/已退款"},{"buttons":["查看","修改","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"buttons":["查看","修改","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"buttons":["查看","修改","删除"],"menu":"已完成订单","tableName":"orders/已完成"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"新闻信息列表","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"报修信息","menuJump":"列表","tableName":"baoxiuxinxi"}],"menu":"报修信息管理"},{"child":[{"buttons":["查看"],"menu":"报修结果","menuJump":"列表","tableName":"baoxiujieguo"}],"menu":"报修结果管理"},{"child":[{"buttons":["新增","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"新闻信息列表","menuJump":"列表","tableName":"xinwenxinxi"}],"menu":"新闻信息模块"},{"child":[{"buttons":["查看","查看评论"],"menu":"商品信息列表","menuJump":"列表","tableName":"shangpinxinxi"}],"menu":"商品信息模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]
    }
}
export default menu;