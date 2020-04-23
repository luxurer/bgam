package com.xdja.admin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author liuwei
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    @TableField("C_ID")
    private String id;

    @TableField("C_NAME")
    private String name;

    @TableField("N_CAN_EDIT")
    private Integer canEdit;

    @TableField("N_CREATE_TIMESTAMP")
    private Integer createTimestamp;

    @TableField("N_UPDATE_TIMESTAMP")
    private Integer updateTimestamp;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
