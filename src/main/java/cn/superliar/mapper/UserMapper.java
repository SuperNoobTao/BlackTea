package cn.superliar.mapper;


import cn.superliar.po.TbUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/5/14.
 */

@Mapper
public interface UserMapper extends BaseMapper<TbUserEntity> {
     List<TbUserEntity> listUser();

     @Select("select user_id as id, user_account, user_name, user_pwd from user")
     List<TbUserEntity> selectListBySQL();

}
