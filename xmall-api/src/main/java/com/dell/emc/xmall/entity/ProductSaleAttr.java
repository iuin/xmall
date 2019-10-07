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
@TableName("pms_product_sale_attr")
public class ProductSaleAttr extends Model<ProductSaleAttr> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    private Long productId;

    /**
     * 销售属性id
     */
    private Long saleAttrId;

    /**
     * 销售属性名称(冗余)
     */
    private String saleAttrName;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
