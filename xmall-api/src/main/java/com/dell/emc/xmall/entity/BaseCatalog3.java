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
 * 
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_base_catalog3")
public class BaseCatalog3 extends Model<BaseCatalog3> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 三级分类名称
     */
    private String name;

    /**
     * 二级分类编号
     */
    private Long catalog2Id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
