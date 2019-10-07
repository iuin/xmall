package com.dell.emc.xmall.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 属性表
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_base_attr_info")
public class BaseAttrInfo extends Model<BaseAttrInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 属性名称
     */
    private String attrName;

    private Long catalog3Id;

    /**
     * 启用：1 停用：0
     */
    private String isEnabled;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
