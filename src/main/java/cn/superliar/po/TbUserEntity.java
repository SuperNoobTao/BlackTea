package cn.superliar.po;

import cn.superliar.common.BaseEntity;
import com.fasterxml.jackson.databind.ser.Serializers;
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
import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "User")
@Data
@ToString(callSuper = true)
@Table(name = "tb_user")
@Getter
@Setter
public class TbUserEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_seq")
    @SequenceGenerator(name="user_seq", sequenceName="user_article",initialValue=10000000,allocationSize=1)
    @Column(name = "user_id")
    private long id;

    @Basic
    @Column(name = "user_name")
    private String name;

    @Basic
    @Column(name = "user_pwd")
    private String pwd;

    @Basic
    @Column(name = "user_account")
    private String account;






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbUserEntity that = (TbUserEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        return result;
    }
}
