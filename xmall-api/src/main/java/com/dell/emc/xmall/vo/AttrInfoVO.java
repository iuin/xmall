package com.dell.emc.xmall.vo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description TODO
 * @Date 10/10/2019 16:16
 * @Created by zhangf30
 */
@Data
public class AttrInfoVO implements Serializable {
    Long id;

    String attrName;

    Long catalog3Id;

    List<AttrValueVO> attrValueList;
}
