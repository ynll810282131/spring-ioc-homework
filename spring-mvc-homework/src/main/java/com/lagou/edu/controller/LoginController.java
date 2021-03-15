package com.lagou.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @author Treasure baby
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public void login(HttpServletRequest req, HttpServletResponse resp, String username, String pwd) throws IOException {
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(pwd)) {
            HttpSession session = req.getSession();
            session.setAttribute("logonUser", "admin");
            System.out.println("用户已登陆");
        }
        resp.sendRedirect("list");
    }

    @RequestMapping("/list")
    public ModelAndView jumpToList() {
        return new ModelAndView("list");
    }
}
