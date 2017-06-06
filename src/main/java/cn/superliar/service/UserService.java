package cn.superliar.service;

import cn.superliar.po.TbUserEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/13.
 */
public interface UserService extends IService<TbUserEntity> {

    List<TbUserEntity> listUser();

    List<TbUserEntity> selectListBySQL();
}
