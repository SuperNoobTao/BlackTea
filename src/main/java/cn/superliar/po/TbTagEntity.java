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
@Entity(name = "Tag")
@Data
@ToString(callSuper = true)
@Table(name = "tb_tag")
public class TbTagEntity {
    private long id;
    private String name;
    private String rel;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="article_seq")
    @SequenceGenerator(name="article_seq", sequenceName="seq_article",initialValue=10000000,allocationSize=1)
    @Column(name = "tag_id")
    public long getId() {
        return id;
    }

    public void setId(long tagId) {
        this.id = tagId;
    }

    @Basic
    @Column(name = "tag_name")
    public String getName() {
        return name;
    }

    public void setName(String tagName) {
        this.name = tagName;
    }

    @Basic
    @Column(name = "tag_rel")
    public String getRel() {
        return rel;
    }

    public void setRel(String tagRel) {
        this.rel = tagRel;
    }

    @Basic
    @CreatedBy
    @Column(name = "tag_created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String tagCreatedBy) {
        this.createdBy = tagCreatedBy;
    }

    @Basic
    @LastModifiedBy
    @Column(name = "tag_updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String tagUpdatedBy) {
        this.updatedBy = tagUpdatedBy;
    }

    @Basic
    @CreatedDate
    @Column(name = "tag_created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp tagCreatedDate) {
        this.createdDate = tagCreatedDate;
    }

    @Basic
    @LastModifiedDate
    @Column(name = "tag_updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp tagUpdatedDate) {
        this.updatedDate = tagUpdatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbTagEntity that = (TbTagEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rel != null ? !rel.equals(that.rel) : that.rel != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null)
            return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rel != null ? rel.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
