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
@Entity(name = "User")
@Data
@ToString(callSuper = true)
@Table(name = "tb_user", schema = "blacktea_blog", catalog = "")
public class TbUserEntity {
    private long id;
    private String name;
    private String pwd;
    private String account;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "user_id")
    public long getId() {
        return id;
    }

    public void setId(long userId) {
        this.id = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    @Basic
    @Column(name = "user_pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String userPwd) {
        this.pwd = userPwd;
    }

    @Basic
    @Column(name = "user_account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String userAccount) {
        this.account = userAccount;
    }

    @Basic
    @CreatedBy
    @Column(name = "user_created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String tagCreatedBy) {
        this.createdBy = tagCreatedBy;
    }

    @Basic
    @LastModifiedBy
    @Column(name = "user_updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String userUpdatedBy) {
        this.updatedBy = userUpdatedBy;
    }

    @Basic
    @CreatedDate
    @Column(name = "user_created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp userCreatedDate) {
        this.createdDate = userCreatedDate;
    }

    @Basic
    @LastModifiedDate
    @Column(name = "user_updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp userUpdatedDate) {
        this.updatedDate = userUpdatedDate;
    }



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
