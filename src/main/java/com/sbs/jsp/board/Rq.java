package com.sbs.jsp.board;

import jakarta.servlet.http.HttpServletRequest;

public class Rq {
  private final HttpServletRequest req;

  private final HttpServletRequest resp;

  public Rq(HttpServletRequest req, HttpServletRequest resp) {
    this.req = req;
    this.resp = resp;
  }

  public int getIntParam(String paramName, int defaultValue) {
    String value = req.getParameter(paramName);

    if (value == null) {
      return defaultValue;
    }
    return defaultValue;

    try{
      return Integer.parseInt(value);
    }
    catch(){
