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
 * sku销售属性值
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValue extends Model<SkuSaleAttrValue> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 库存单元id
     */
    private Long skuId;

    /**
     * 销售属性id（冗余)
     */
    private Long saleAttrId;

    /**
     * 销售属性值id
     */
    private Long saleAttrValueId;

    /**
     * 销售属性名称(冗余)
     */
    private String saleAttrName;

    /**
     * 销售属性值名称(冗余)
     */
    private String saleAttrValueName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
