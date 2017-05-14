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
@Entity(name = "Tag")
@Data
@ToString(callSuper = true)
@Table(name = "tb_tag")
@Setter
@Getter
public class TbTagEntity extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tag_seq")
    @SequenceGenerator(name="tag_seq", sequenceName="seq_tag",initialValue=10000000,allocationSize=1)
    @Column(name = "tag_id")
    private long id;

    @Basic
    @Column(name = "tag_name")
    private String name;

    @Basic
    @Column(name = "tag_rel")
    private String rel;







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbTagEntity that = (TbTagEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rel != null ? !rel.equals(that.rel) : that.rel != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rel != null ? rel.hashCode() : 0);

        return result;
    }
}
