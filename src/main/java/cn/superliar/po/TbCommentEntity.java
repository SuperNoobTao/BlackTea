package cn.superliar.po;

import cn.superliar.common.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
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
@Setter
@Getter
public class TbCommentEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="comment_seq")
    @SequenceGenerator(name="comment_seq", sequenceName="seq_comment",initialValue=10000000,allocationSize=1)
    @Column(name = "comment_id")
    private long id;

    @Basic
    @Column(name = "comment_content")
    private String content;

    @Basic
    @Column(name = "comment_user_id")
    private Integer userId;




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

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);

        return result;
    }
}
