(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shop-order-confirm/shop-order-confirm"],{"3e9b":function(e,r,t){"use strict";(function(e){Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0;var o=n(t("a34a"));function n(e){return e&&e.__esModule?e:{default:e}}function a(e,r,t,o,n,a,s){try{var d=e[a](s),u=d.value}catch(i){return void t(i)}d.done?r(u):Promise.resolve(u).then(o,n)}function s(e){return function(){var r=this,t=arguments;return new Promise((function(o,n){var s=e.apply(r,t);function d(e){a(s,o,n,d,u,"next",e)}function u(e){a(s,o,n,d,u,"throw",e)}d(void 0)}))}}var d={data:function(){return{user:{},orderGoods:{},address:{},total:0,type:1,seat:0}},onLoad:function(r){var t=this;return s(o.default.mark((function n(){var a;return o.default.wrap((function(o){while(1)switch(o.prev=o.next){case 0:if(t.type=r.type,t.seat=r.seat,t.orderGoods=e.getStorageSync("orderGoods"),1!=t.seat)for(a=0;a<t.orderGoods.length;a++)0==t.total?t.total=parseFloat(t.orderGoods[a].price)*t.orderGoods[a].buynumber:t.total=parseFloat(t.total)+parseFloat(t.orderGoods[a].price)*t.orderGoods[a].buynumber;else t.total=parseFloat(t.orderGoods[0].total),t.address=t.orderGoods[0].address;t.total=t.total.toFixed(2);case 5:case"end":return o.stop()}}),n)})))()},onShow:function(){var r=this;return s(o.default.mark((function t(){var n,a,s;return o.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return n=e.getStorageSync("nowTable"),t.next=3,r.$api.session(n);case 3:if(a=t.sent,r.user=a.data,1==r.seat){t.next=15;break}if(s=e.getStorageSync("address"),!s||r.user.id!=s.userid){t.next=11;break}r.address=e.getStorageSync("address"),t.next=15;break;case 11:return t.next=13,r.$api.defaultAddress(r.user.id);case 13:a=t.sent,r.address=a.data;case 15:case"end":return t.stop()}}),t)})))()},methods:{onSubmitTap:function(){var r=this;return s(o.default.mark((function t(){var n,a;return o.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(n=r,1==n.seat||n.address){t.next=4;break}return n.$utils.msg("请选择地址"),t.abrupt("return");case 4:a=e.getStorageSync("nowTable"),e.showModal({title:"提示",content:"是否确认支付",success:function(){var r=s(o.default.mark((function r(t){var s,d,u,i,c,f;return o.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:if(!t.confirm){r.next=40;break}if(s=n.type,d=!0,u="已支付",1!=s){r.next=8;break}n.user.money-n.total<0&&(n.$utils.msg("余额不足，请先充值"),d=!1,u="未支付"),r.next=13;break;case 8:if(2!=s){r.next=13;break}if(!(n.user.jifen-n.total<0)){r.next=13;break}return n.$utils.msg("积分不足，兑换商品失败"),d=!1,r.abrupt("return");case 13:i=0;case 14:if(!(i<n.orderGoods.length)){r.next=26;break}return c={orderid:n.$utils.genTradeNo(),tablename:n.orderGoods[i].tablename,userid:n.user.id,goodid:n.orderGoods[i].goodid,goodname:n.orderGoods[i].goodname,picture:n.orderGoods[i].picture,buynumber:n.orderGoods[i].buynumber,discountprice:n.orderGoods[i].price,price:n.orderGoods[i].price,total:n.orderGoods[i].price*n.orderGoods[i].buynumber,discounttotal:n.orderGoods[i].price*n.orderGoods[i].buynumber,type:s,address:n.address.address,tel:n.address.phone,consignee:n.address.name,status:u},1==n.seat&&(c["address"]=n.address,f=n.address.split(",").length,c["buynumber"]=f,c["total"]=n.orderGoods[i].price*f,c["discounttotal"]=n.orderGoods[i].price*f),r.next=19,n.$api.add("orders",c);case 19:if(!n.orderGoods[i].id){r.next=23;break}return r.next=22,n.$api.del("cart",JSON.stringify([n.orderGoods[i].id]));case 22:e.removeStorageSync("cart".concat(n.orderGoods[i].goodid).concat(n.user.id));case 23:i++,r.next=14;break;case 26:if(!d){r.next=40;break}if(1!=s){r.next=35;break}return n.$utils.msgBack("支付成功"),n.user.money=n.user.money-n.total,(n.user.jifen||0==n.user.jifen)&&(n.user.jifen=parseFloat(n.user.jifen)+parseFloat(n.total)),r.next=33,n.$api.update(a,n.user);case 33:r.next=40;break;case 35:if(2!=s){r.next=40;break}return n.$utils.msgBack("兑换成功"),n.user.jifen=n.user.jifen-n.total,r.next=40,n.$api.update(a,n.user);case 40:case"end":return r.stop()}}),r)})));function t(e){return r.apply(this,arguments)}return t}()});case 6:case"end":return t.stop()}}),t)})))()},onAddressTap:function(){this.$utils.jump("../shop-address/shop-address")}}};r.default=d}).call(this,t("543d")["default"])},"5eb4":function(e,r,t){},6228:function(e,r,t){"use strict";(function(e){t("5b05");o(t("66fd"));var r=o(t("df2a"));function o(e){return e&&e.__esModule?e:{default:e}}e(r.default)}).call(this,t("543d")["createPage"])},"7ff2":function(e,r,t){"use strict";t.r(r);var o=t("3e9b"),n=t.n(o);for(var a in o)"default"!==a&&function(e){t.d(r,e,(function(){return o[e]}))}(a);r["default"]=n.a},"980c":function(e,r,t){"use strict";var o=t("5eb4"),n=t.n(o);n.a},cd2a:function(e,r,t){"use strict";var o;t.d(r,"b",(function(){return n})),t.d(r,"c",(function(){return a})),t.d(r,"a",(function(){return o}));var n=function(){var e=this,r=e.$createElement;e._self._c},a=[]},df2a:function(e,r,t){"use strict";t.r(r);var o=t("cd2a"),n=t("7ff2");for(var a in n)"default"!==a&&function(e){t.d(r,e,(function(){return n[e]}))}(a);t("980c");var s,d=t("f0c5"),u=Object(d["a"])(n["default"],o["b"],o["c"],!1,null,null,null,!1,o["a"],s);r["default"]=u.exports}},[["6228","common/runtime","common/vendor"]]]);