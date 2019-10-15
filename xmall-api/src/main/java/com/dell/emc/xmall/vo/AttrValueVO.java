package com.dell.emc.xmall.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description TODO
 * @Date 10/10/2019 16:26
 * @Created by zhangf30
 */
@Data
public class AttrValueVO implements Serializable {

    public Long id;

    public String valueName;

    public boolean edit;
}
