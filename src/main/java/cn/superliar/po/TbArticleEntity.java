package cn.superliar.po;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "article")
@Data
@ToString(callSuper = true)
@Table(name = "tb_article", schema = "blacktea_blog", catalog = "")
public class TbArticleEntity {
    private long id;
    private String name;
    private String tag;
    private String content;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp updatedDate;
    private String updatedBy;

    @Id
    @Column(name = "article_id")
    public long getId() {
        return id;
    }

    public void setId(long articleId) {
        this.id = articleId;
    }

    @Basic
    @Column(name = "article_name")
    public String getName() {
        return name;
    }

    public void setName(String articleName) {
        this.name = articleName;
    }

    @Basic
    @Column(name = "article_tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String articleTag) {
        this.tag = articleTag;
    }

    @Basic
    @Column(name = "article_content")
    public String getContent() {
        return content;
    }

    public void setContent(String articleContent) {
        this.content = articleContent;
    }

    @Basic
    @CreatedDate
    @Column(name = "article_created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp articleCreatedDate) {
        this.createdDate = articleCreatedDate;
    }

    @Basic
    @CreatedBy
    @Column(name = "article_created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String articleCreatedBy) {
        this.createdBy = articleCreatedBy;
    }

    @Basic
    @LastModifiedDate
    @Column(name = "article_updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp articleUpdatedDate) {
        this.updatedDate = articleUpdatedDate;
    }

    @Basic
    @LastModifiedBy
    @Column(name = "article_updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String articleUpdatedBy) {
        this.updatedBy = articleUpdatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbArticleEntity that = (TbArticleEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tag != null ? !tag.equals(that.tag) : that.tag != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null)
            return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        return result;
    }
}
