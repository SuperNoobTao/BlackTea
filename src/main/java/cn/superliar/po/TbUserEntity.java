package cn.superliar.po;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.baomidou.mybatisplus.activerecord.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/5/13.
 */



@SuppressWarnings("serial")
@TableName("tb_user")
public class TbUserEntity extends Model<TbUserEntity>{


    @TableId("user_id")
    private Long id;


    @TableField("user_name")
    private String name;


    @TableField("user_pwd")
    private String pwd;


    @TableField("user_account")
    private String account;

    public TbUserEntity() {
    }

    @Override
    protected Serializable pkVal() {
        return id;
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


    public TbUserEntity(Long id, String name, String pwd, String account) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
