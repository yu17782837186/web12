package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* cookie:
*       作用：解决了发送的不同请求的数据共享问题
*       使用:
*            //创建cookie对象
*            Cookie cookie = new Cookie("","");
*            //响应cookie信息给客户端
*            response.addCookie(cookie);
*        一个cookie对象存储一条数据，多条数据用不同的cookie对象来存储
*
*        特点：
*               浏览器端的数据存储技术，存储的数据声明在服务器
*               临时存储：存储在浏览器的运行内存中，浏览器关闭就失效了
*               定时存储：设置了cookie的有效期，存储在客户端的硬盘中，在有效期内符合路径的要求的请求都会附带该信息
*               默认cookie信息存储好之后，每次请求都会附带，除非设置有效路径,只有在路径下才会有cookie
*
*
* */
public class MyServletCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求信息
        //响应处理结果
            //使用cookie进行浏览器端的数据存储
        //创建cookie对象
        Cookie cookie = new Cookie("yuxiaohao","88888");
        Cookie cookie1 = new Cookie("yu","6666666");
        //设置cookie的有效期
        cookie1.setMaxAge(3*24*3600);
        //设置有效路径
        cookie1.setPath("/webproject04/zxc");
        //响应cookie信息
        response.addCookie(cookie);
        response.addCookie(cookie1);
        //直接响应
        response.getWriter().write("我是cookie");

            //请求转发
            //重定向
    }
}
