package cn.com.ning;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServletGetCookie extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("utf-8");
        //设置响应编码格式
        response.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求信息
        //获取cookie信息
        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie:cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name+":"+value);
            }
        }
        //响应处理结果
            //直接响应
            //请求转发
            //重定向
    }
}
