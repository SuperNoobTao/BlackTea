package cn.superliar.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "Statistics")
@Data
@ToString(callSuper = true)
@Table(name = "tb_statistics")
@Setter
@Getter
public class TbStatisticsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="statistics_seq")
    @SequenceGenerator(name="statistics_seq", sequenceName="seq_statistics",initialValue=10000000,allocationSize=1)
    @Column(name = "statistics_id")
    private long id;

    @Basic
    @Column(name = "article_id")
    private Integer articleId;

    @Basic
    @Column(name = "read_count")
    private String readCount;

    @Basic
    @Column(name = "upvote")
    private String upvote;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbStatisticsEntity that = (TbStatisticsEntity) o;

        if (id != that.id) return false;
        if (articleId != null ? !articleId.equals(that.articleId) : that.articleId != null) return false;
        if (readCount != null ? !readCount.equals(that.readCount) : that.readCount != null) return false;
        if (upvote != null ? !upvote.equals(that.upvote) : that.upvote != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (readCount != null ? readCount.hashCode() : 0);
        result = 31 * result + (upvote != null ? upvote.hashCode() : 0);
        return result;
    }
}
