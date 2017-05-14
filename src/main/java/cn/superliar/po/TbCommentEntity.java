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
@Entity(name = "Comment")
@Data
@ToString(callSuper = true)
@Table(name = "tb_comment")
public class TbCommentEntity {
    private long id;
    private String content;
    private Integer userId;
    private String createdBy;
    private Timestamp createdDate;
    private String updatedBy;
    private Timestamp updatedDate;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="article_seq")
    @SequenceGenerator(name="article_seq", sequenceName="seq_article",initialValue=10000000,allocationSize=1)
    @Column(name = "comment_id")
    public long getId() {
        return id;
    }

    public void setId(long commentId) {
        this.id = commentId;
    }

    @Basic
    @Column(name = "comment_content")
    public String getContent() {
        return content;
    }

    public void setContent(String commentContent) {
        this.content = commentContent;
    }

    @Basic
    @Column(name = "comment_user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer commentUserId) {
        this.userId = commentUserId;
    }

    @Basic
    @CreatedBy
    @Column(name = "comment_created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String commentCreatedBy) {
        this.createdBy = commentCreatedBy;
    }

    @Basic
    @CreatedDate
    @Column(name = "comment_created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp commentCreatedDate) {
        this.createdDate = commentCreatedDate;
    }

    @Basic
    @LastModifiedBy
    @Column(name = "comment_updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String commentUpdatedBy) {
        this.updatedBy = commentUpdatedBy;
    }

    @Basic
    @LastModifiedDate
    @Column(name = "comment_updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp commentUpdatedDate) {
        this.updatedDate = commentUpdatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbCommentEntity that = (TbCommentEntity) o;

        if (id != that.id) return false;
        if (content != null ? !content.equals(that.content) : that.content != null)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null)
            return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
