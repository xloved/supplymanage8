<%--
  Created by IntelliJ IDEA.
  User: 旭哥
  Date: 2018/10/15
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>


<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/js/Vue.js"></script>
    <script src="${pageContext.request.contextPath}/js/vue-resource.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
       <form id="foms" method="post"  class="form-horizontal" rofe="form">
           用户登录名:<input name="uname" id="names"  placeholder="用户登录名" class="input-xlarge"><br/>
           用户密码:  <input  name="upwd" id="upwds" placeholder="用户密码" class="input-xlarge"><br/>
           用户姓名:  <input  name="usersname" id="usersnames" placeholder="用户姓名" class="input-xlarge"><br/>
           手机号:    <input name="uphone" id="uphones" placeholder="手机号" class="input-xlarge"><br/>
           性别:      <input type="radio"name="usex" id="usexs" value="0" cehecked="0">男
                      <input type="radio" name="usex" value="1">女<br/>
           出生日期:  <input  name="ubrith" id="ubrith"><br/>
           状态:      <input  name="ustate" id="ustate" ><br/>
           备注:      <input  name="uposition" id="uposition"><br/>

           <button @click="tijiao()" class="btn btn-success">添加用户</button>
       </form>
</body>
</html>
<script src="/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">


  new Vue({
             el:'#foms',
             data:{
             },
             methods:{
                 tijiao:function(){
                     var url="/user/addUser";
                     this.$http.post(url,{
                        uname: $('#names').val(),
                        upwd: $('#upwds').val(),
                        usersname: $('#usersnames').val(),
                        uphone: $('#uphones').val(),
                        usex: $('#usexs').val(),
                        ubrith:$('#ubrith').val(),
                        ustate:$('#ustate').val(),
                        uposition:$('#uposition').val()
                    },{emulateJSON:true}).then(function(res){
                          alert(res.body);
                   })

                 }
             }
         });


</script>