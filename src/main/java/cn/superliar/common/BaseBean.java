package cn.superliar.common;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/8.
 */
public class BaseBean  implements Serializable {

    /**
     * BaseBean.java
     */
    private static final long serialVersionUID = 2117622093828850506L;

    /**
     * 创建时间
     */
    private Date createdDate;

    /**
     * 修改时间
     */
    private Date updatedDate;

    /**
     * 创建人
     */
    private Long userId;

    /**
     * 修改人
     */
    private Long operationerId;


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOperationerId() {
        return operationerId;
    }

    public void setOperationerId(Long operationerId) {
        this.operationerId = operationerId;
    }



}
