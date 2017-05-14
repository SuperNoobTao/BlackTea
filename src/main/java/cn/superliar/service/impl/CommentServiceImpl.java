package cn.superliar.service.impl;

import cn.superliar.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("commentService")
@Transactional(rollbackFor = { Exception.class })
public class CommentServiceImpl implements CommentService{
}
