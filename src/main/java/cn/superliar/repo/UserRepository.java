package cn.superliar.repo;

import cn.superliar.po.TbUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/5/13.
 */
@Repository
public interface UserRepository extends JpaRepository<TbUserEntity, Long> {
}
