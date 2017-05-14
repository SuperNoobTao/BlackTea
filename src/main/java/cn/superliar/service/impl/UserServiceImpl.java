package cn.superliar.service.impl;

import cn.superliar.mapper.UserMapper;
import cn.superliar.po.TbUserEntity;
import cn.superliar.repo.UserRepository;
import cn.superliar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.UsesJava7;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("userService")
@Transactional(rollbackFor = { Exception.class })
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<TbUserEntity> listUser() {
        return userMapper.listUser();
    }

}
