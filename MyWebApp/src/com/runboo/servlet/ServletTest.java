package com.runboo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Administrator on 2017/1/7 0007.
 */
public class ServletTest extends HttpServlet {
//    doGet方法在本Servlet对象接收到一个Get请求时被调用；
//    doPost方法在本Servlet对象接收到一个Get请求时被调用；
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
//      super中默认实现就是报错，所以不要调用
//      super.doGet(req,resp)
// 从请求的对象上获取到请求的客户端的IP地址；
        String ip = req.getRemoteAddr();
        System.out.println(ip);

//        从请求对象中获取客户端传过来的请求的参数；
        String username = req.getParameter("username");
        String pwd = req.getParameter("password");
        System.out.println("客户端的传递的帐号："+username+";密码:"+pwd);

//        服务端返回的数据：
        resp.setCharacterEncoding("utf-8");
//        用相应对象给客户端返回相应数据
        OutputStream os = resp.getOutputStream();
//        get请求的用户名验证
        if(username.equals("123")&&pwd.equals("111")){
            os.write("验证通过".getBytes("utf-8"));

        }else {
            os.write("验证失败".getBytes("utf-8"));
        }
    }
//  doPost在本servlet对象中接受一个POST请求的时候被调用
//    @param req 请求对象，这个对象中包含客户端发送的一些信息，比如请求头，请求的数据
//    @param resp 响应对象，这个对象可以用来给客户端发送响应数据，包括相应头和响应体

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
//        super.doPost(req,resp);
        String ip = req.getRemoteAddr();
        System.out.println(ip);

    }
}
