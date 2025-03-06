// `src/main/java/org/example/ex1n1/RegisterServlet.java`
package org.example.ex1n1;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    // 处理客户端的POST请求
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 设置请求的编码为UTF-8，防止中文乱码
        request.setCharacterEncoding("UTF-8");

        // 从请求中获取注册信息
        String username = request.getParameter("username");           // 用户名
        String password = request.getParameter("password");           // 密码
        String confirmPassword = request.getParameter("confirmPassword"); // 重复密码
        String userType = request.getParameter("userType");           // 用户类型
        String phone = request.getParameter("phone");                 // 电话

        // 将获取的参数设置为请求属性，便于在JSP中显示
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("confirmPassword", confirmPassword);
        request.setAttribute("userType", userType);
        request.setAttribute("phone", phone);

        // 将请求转发到result.jsp，显示注册结果
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }
}