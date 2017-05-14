package cn.superliar.service.impl;

import cn.superliar.service.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("tagService")
@Transactional(rollbackFor = { Exception.class })
public class TagServiceImpl implements TagService{
}
