package cn.superliar.service.impl;


import cn.superliar.po.TbArticleEntity;
import cn.superliar.repo.ArticleRepository;
import cn.superliar.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("articleService")
@Transactional(rollbackFor = { Exception.class })
public class ArticleServiceImpl implements ArticleService{

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public void saveArticle() {

    }

    @Override
    public List<TbArticleEntity> listArticle() {
        return articleRepository.findAll();
    }
}
