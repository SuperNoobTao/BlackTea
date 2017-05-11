package cn.superliar.po;

import cn.superliar.common.BaseBean;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Administrator on 2017/5/11.
 */
@Getter
@Setter
@ToString
public class User extends BaseBean{

    private Long id;

    private String name;

    private Integer age;

}
