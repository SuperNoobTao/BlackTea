package cn.superliar.po;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "Statistics")
@Data
@ToString(callSuper = true)
@Table(name = "tb_statistics", schema = "blacktea_blog", catalog = "")
public class TbStatisticsEntity {
    private long id;
    private Integer articleId;
    private String readCount;
    private String upvote;

    @Id
    @Column(name = "statistics_id")
    public long getId() {
        return id;
    }

    public void setId(long statisticsId) {
        this.id = statisticsId;
    }

    @Basic
    @Column(name = "article_id")
    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "read_count")
    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    @Basic
    @Column(name = "upvote")
    public String getUpvote() {
        return upvote;
    }

    public void setUpvote(String upvote) {
        this.upvote = upvote;
    }

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
