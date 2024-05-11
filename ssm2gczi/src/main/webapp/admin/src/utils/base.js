const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm2gczi/",
            name: "ssm2gczi",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2gczi/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧消防微信小程序"
        } 
    }
}
export default base
