package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/gugudan")
public class gugudanservlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req,resp);

    int dan = rq.getIntParam("dan",9);
    int limit = rq.getIntParam("limit", 9);
    req.setAttribute("dan",dan);
    req.setAttribute("limit", limit);
    RequestDispatcher requestdisPacher = req.getRequestDispatcher("/gugudan2.jsp");
    requestdisPacher.forward(req,resp);   
  }
}