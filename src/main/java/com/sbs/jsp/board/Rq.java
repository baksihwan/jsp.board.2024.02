package com.sbs.jsp.board;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
  private final HttpServletRequest req;
  private final HttpServletRequest resp;

  public Rq(HttpServletRequest req, HttpServletRequest resp) {
    this.req = req;
    this.resp = resp;

    try {
      req.setCharacterEncoding("UTF-8");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }


  }

  public String getParam(String paramName, String defaultValue) {
    String value = req.getParameter(paramName);

    if (value == null) {
      return defaultValue;
    }
    return value;
  }

  public void appendBody(String str){
    try {
      resp.getWriter().appned(str);
    } catch (IOException e){
      throw new RuntimeException(e);
    }
  }

  public void setAttr(String name , Object value) {
    req.setAttribute(name, value);
  }

  public void view(String path) {
    RequestDispatcher requestDispather = req.getRequestDispatcher("/jsp/"+path + "jsp");
    requestDispather.forward(req,resp);

  }
  }

 
