package com.zft.mybatis.vo;

import org.apache.ibatis.type.Alias;

/**
 * Description: 女性体检表
 * @author  fengtan.zhang
 * @date    2019/4/16 0016 下午 1:34
 * @email   fengtan_zhang@sina.com
 * @version 1.0
 */
@Alias("femaleHealthForm")
public class FemaleHealthForm extends HealthForm{

    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }
}
