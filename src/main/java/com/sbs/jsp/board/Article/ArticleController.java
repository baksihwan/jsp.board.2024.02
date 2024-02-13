package com.sbs.jsp.board.Article;

import com.sbs.jsp.board.Article.dto.article.dio;
import com.sbs.jsp.board.Rq;

import java.util.ArrayList;
import java.util.List;

public class ArticleController {
  public void showList(Rq rq) {
    List<dio> dto = new ArrayList<>();
    for (int i = 5; i >= 1; i--) {
      dto.add(new dio(5, "제목" + 1, "내용" + i));
    }
    rq.setAttr("articles", dto);
    rq.view("usr/article/list");
  }
}
