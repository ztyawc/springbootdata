package com.zty.springbootdata;

import com.zty.domain.Article;
import com.zty.domain.Comment;
import com.zty.mapper.ArticleMapper;
import com.zty.mapper.CommentMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdataApplicationTests {


    @Autowired
    private CommentMapper commentMapper;







    @Test
    void contextLoads() {


        Comment byId = commentMapper.findById(1);
        System.out.println(byId);
    }


}
