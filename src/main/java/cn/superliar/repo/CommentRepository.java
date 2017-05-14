package cn.superliar.repo;

import cn.superliar.po.TbCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/5/13.
 */
@Repository
public interface CommentRepository extends JpaRepository<TbCommentEntity, Long> {
}
