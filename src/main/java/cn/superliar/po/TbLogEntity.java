package cn.superliar.po;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "Log")
@Data
@ToString(callSuper = true)
@Table(name = "tb_log", schema = "blacktea_blog", catalog = "")
public class TbLogEntity {
    private long id;
    private String ip;
    private Integer userId;
    private String userName;
    private String acessResource;
    private String operationType;
    private Timestamp createdDate;

    @Id
    @Column(name = "log_id")
    public long getId() {
        return id;
    }

    public void setId(long logId) {
        this.id = logId;
    }

    @Basic
    @Column(name = "log_ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String logIp) {
        this.ip = logIp;
    }

    @Basic
    @Column(name = "log_user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer logUserId) {
        this.userId = logUserId;
    }

    @Basic
    @Column(name = "log_user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String logUserName) {
        this.userName = logUserName;
    }

    @Basic
    @Column(name = "log_acess_resource")
    public String getAcessResource() {
        return acessResource;
    }

    public void setAcessResource(String logAcessResource) {
        this.acessResource = logAcessResource;
    }

    @Basic
    @Column(name = "log_operation_type")
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String logOperationType) {
        this.operationType = logOperationType;
    }

    @Basic
    @CreatedDate
    @Column(name = "log_created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp logCreatedDate) {
        this.createdDate = logCreatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbLogEntity that = (TbLogEntity) o;

        if (id != that.id) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (acessResource != null ? !acessResource.equals(that.acessResource) : that.acessResource != null)
            return false;
        if (operationType != null ? !operationType.equals(that.operationType) : that.operationType != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (acessResource != null ? acessResource.hashCode() : 0);
        result = 31 * result + (operationType != null ? operationType.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        return result;
    }
}
