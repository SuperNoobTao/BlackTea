package cn.superliar.repo;

import cn.superliar.po.TbArticleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/5/13.
 */
@Repository
public interface ArticleRepository extends CustomRepository<TbArticleEntity, Long> {
}
