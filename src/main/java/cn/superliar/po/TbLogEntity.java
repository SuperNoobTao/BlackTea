package cn.superliar.po;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/5/13.
 */
@Entity(name = "Log")
@Data
@ToString(callSuper = true)
@Table(name = "tb_log")
@Setter
@Getter
public class TbLogEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="log_seq")
    @SequenceGenerator(name="log_seq", sequenceName="seq_log",initialValue=10000000,allocationSize=1)
    @Column(name = "log_id")
    private long id;

    @Basic
    @Column(name = "log_ip")
    private String ip;

    @Basic
    @Column(name = "log_user_id")
    private Integer userId;

    @Basic
    @Column(name = "log_user_name")
    private String userName;

    @Basic
    @Column(name = "log_acess_resource")
    private String acessResource;

    @Basic
    @Column(name = "log_operation_type")
    private String operationType;

    @Basic
    @CreatedDate
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();


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
