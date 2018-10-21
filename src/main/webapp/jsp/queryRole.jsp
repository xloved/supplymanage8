<%--
  Created by IntelliJ IDEA.
  User: 旭哥
  Date: 2018/10/21
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>角色管理</title>
    <script src="${pageContext.request.contextPath}/js/Vue.js"></script>
    <script src="${pageContext.request.contextPath}/js/vue-resource.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
          <table class="table" style="font-family: 楷体">
              <tr>
                  <td>角色序号</td>
                  <td>角色名称</td>
                  <td>角色描述</td>
                  <td>操作</td>
              </tr>
               <tbody id="trole">
                    <tr v-for="rr in rolelist">
                        <td>{{rr.roleid}}</td>
                        <td>{{rr.rolename}}</td>
                        <td>{{rr.rolewrite}}</td>
                    </tr>
               </tbody>
          </table>
</body>
</html>
<script type="text/javascript">

     $(function(){
           ro.queryRole();
    })
           var ro=new Vue({
               el:"#trole",
               data:{
                   rolelist:'',
               },
               methods:{
                  queryRole:function(){
                       var url="/role/queryRole";
                       this.$http.post(url).then(function(data){
                           alert(data);
                              this.rolelist=data.body
                       })
                   }
               }
           })
</script>