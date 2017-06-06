package cn.superliar.service.impl;

import cn.superliar.mapper.UserMapper;
import cn.superliar.po.TbUserEntity;
import cn.superliar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * Created by Administrator on 2017/5/13.
 */
@Service("userService")
@Transactional(rollbackFor = { Exception.class })
public class UserServiceImpl extends ServiceImpl<UserMapper, TbUserEntity> implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<TbUserEntity> listUser() {
        return userMapper.listUser();
    }

    @Override
    public List<TbUserEntity> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

}
