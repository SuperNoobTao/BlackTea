package cn.superliar.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("articleService")
@Transactional(rollbackFor = { Exception.class })
public class ArticleServiceImpl {
}
