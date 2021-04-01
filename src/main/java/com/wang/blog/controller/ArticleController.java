package com.wang.blog.controller;

import com.wang.blog.entity.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxiang
 * @since 2021/3/31 17:41
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/info")

    public Article get(){
        Article article = new Article(1,"权力的游戏");
        return article;
    }
}
