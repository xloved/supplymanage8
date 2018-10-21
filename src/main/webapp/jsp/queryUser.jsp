<%--
  Created by IntelliJ IDEA.
  User: 旭哥
  Date: 2018/10/15
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.staticfile.org/vue/2.4.2/vue.min.js"></script>
    <script src="https://cdn.staticfile.org/vue-resource/1.5.1/vue-resource.min.js"></script>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
    <table class="table table-hover">

        <tr class="active">
            <td>用户名</td>
            <td>密码</td>
            <td>姓名</td>
            <td>手机号</td>
            <td>性别</td>
            <td>出生年月</td>
            <td>是否停用</td>
            <td>备注</td>
            <td>操作</td>
        </tr>


            <tbody id="usertab">
            <tr v-for="use in userlist" >

                <td> {{use.uname}}</td>
                <td>{{use.upwd}}</td>
                <td>{{use.usersname}}</td>
                <td>{{use.uphone}}</td>
                <td>{{ use.usex}}</td>
                <td>{{use.ubrith}}</td>
                <td>{{use.ustate}}</td>
                <td>{{use.uposition}}</td>
                <td><button @click="del(use.usersid)" class="btn btn-primary btn-sm">删除</button></td>
                <td><button class="btn-primary btn-sm" data-toggle="modal" data-target="#myModal" @click="selectOne(use.usersid)" >
                    修改
                </button></td>
            </tr>
            <!-- 模态框（Modal） -->
            <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <form id="updates" method="post"  class="form-horizontal" >
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                            <h4 class="modal-title" id="myModalLabel">
                                用户信息
                            </h4>
                        </div>
                        <div class="modal-body">

                                用户编号:  <input name="usersid" id="usersid" v-model="id" ><br/>
                                用户登录名:<input name="uname" id="names" v-model="name"><br/>
                                用户密码:  <input  name="upwd" id="upwds" v-model="pwd"><br/>
                                用户姓名:  <input  name="usersname" id="usersnames" v-model="names"><br/>
                                手机号:    <input name="uphone" id="uphones" v-model="phone"><br/>
                                性别:      <input  name="usex" id="usexs"  v-model="sex" ><br/>
                                出生日期:  <input  name="ubrith" id="ubrith" v-model="brith"><br/>
                                状态:      <input  name="ustate" id="ustate" v-model="state"><br/>
                                备注:      <input  name="uposition" id="uposition" v-model="posi"><br/>



                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                            </button>
                            <button type="button" class="btn btn-primary" @click="updUsers()">
                                提交更改
                            </button>
                        </div>
                    </div><!-- /.modal-content -->
                    </form>
                </div>
                <!-- /.modal -->
            </div>
            </tbody>


    </table>
<div id="fenye">
    <button class='btn btn-info btn-sm' @click="shang(1)" style="font-weight:bold;margin-left:500px;font-family: 楷体;font-size: 15px"type="button" >上一页</button>
    {{currentPage}}
    <button class='btn btn-info btn-sm'  @click="xia(1)" style="font-weight:bold;font-family: 楷体;font-size: 15px" type="button" >下一页</button>
    <span style="font-family: 楷体;font-size: 20px">总{{MaxPage}}页</span>

</div>
</body>
</html>
<script>

      $(function(){
          load.fenye(1);
      })
    /*修改前的查询*/
     var upd= new Vue({
          el:"#myModal",
          data:{
              id:"",
              name:"",
              pwd:"",
              names:"",
              phone:"",
              sex:"",
              brith:"",
              state:"",
              posi:"",
          },methods:{
             //修改方法
            updUsers:function(){
                 alert(11);
                alert($("#usersid").val());
                 var url="/user/updUser";
                 this.$http.post(url,{
                     usersid:$("#usersid").val(),
                     uname:$("#names").val(),
                     upwd:$("#upwds").val(),
                     usersname:$("#usersnames").val()
                 },{emulateJSON:true}).then(function(res){
                     alert(res.body)
                     window.location.reload();
                 })
             }
         }
      });


      /*  function updUsers(){
            alert($("#usersid").val());
            alert($("#names").val());
            $.ajax({
                url:"/user/updateUsers",
                type:"post",
                data:{usersid:$("#usersid").val(),"uname":$("#names").val(),"upwd":$("#upwds").val(),"usersname":$("#usersnames").val()},

                success:function(data){

                    alert(data);
                }
                }

            )
            window.location.reload();
        }*/

      var load;
      load = new Vue({
          el: "#usertab",
          data: {
              userlist: "",
          },
          methods: {
              //分页查询
              fenye: function (pageNum) {
                  var url = "/user/QueryUsers/" + pageNum; //   前面要加/
                  this.$http.post(url).then(function (data) {//ajax请求封装
                          // alert(11);
                          fan.currentPage = data.body.pageNum;
                          fan.MaxPage = data.body.pages;
                          this.userlist = data.body.list;
                      }, function (a) {   //返回失败方法调用，暂不处理
                      }
                  )
              },
              //删除方法
              del: function (usersid) {
                  var url = "/user/delUsers/" + usersid;
                  this.$http.post(url).then(function (data) {
                      this.fenye(1);
                  })
              }, //查询一条数据
              selectOne:function (usersid) {
                  var url = "/user/queryOne/"+usersid;
                  this.$http.post(url).then(function (data) {
                      //alert(data);
                      upd.id=data.body.usersid;
                      upd.name=data.body.uname;
                      upd.pwd=data.body.upwd;
                      upd.names=data.body.usersname;
                      upd.phone=data.body.uphone;
                      upd.sex=data.body.usex;
                      upd.brith=data.body.ubrith;
                      upd.state=data.body.ustate;
                      upd.posi=data.body.uposition;


                  })
              }

          }
      });

   var fan=new Vue({
         el:"#fenye",
          data:{
              currentPage:"",
              MaxPage:"",
          },
        methods:{
               shang:function(pageNum){
                  if(this.currentPage-pageNum==0){
                      pageNum=1;
                  }else{
                      pageNum=this.currentPage-pageNum;
                  }
                   load.fenye(pageNum)
               },xia:function(pageNum){
                      if(this.currentPage+pageNum>this.MaxPage){
                                   pageNum=this.currentPage;
                      }else{
                           pageNum=this.currentPage+pageNum;
                      }
                      load.fenye(pageNum);
            }
        }

    })



</script>