package cn.superliar.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/8.
 */
//@MappedSuperclass
@Getter
@Setter
@Data
public class BaseEntity implements Serializable {

    /**
     * BaseEntity.java
     */
    private static final long serialVersionUID = 2117622093828850506L;

    /**
     * 创建时间
     */
//    @Basic
//    @CreatedDate
//    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();

    /**
     * 修改时间
     */
//    @Basic
//    @LastModifiedDate
//    @Column(name = "updated_date")
    private LocalDateTime updatedDate = LocalDateTime.now();

    /**
     * 创建人
     */
//    @Basic
//    @CreatedBy
//    @Column(name = "created_by")
    private Long createdBy;

    /**
     * 修改人
     */
//    @Basic
//    @LastModifiedBy
//    @Column(name = "updated_by")
    private Long updatedBy;



}
