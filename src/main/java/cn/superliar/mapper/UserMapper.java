package cn.superliar.mapper;

import cn.superliar.common.BaseMapper;
import cn.superliar.po.TbUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */

@Mapper
public interface UserMapper extends BaseMapper<TbUserEntity, Long> {
     List<TbUserEntity> listUser();


}
