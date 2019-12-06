package com.qiaoyanan.springbootplus.core.universal;

import com.alibaba.fastjson.JSON;

/**
 * @Description: 所有model重写toString方法
 * @author qiaoyn
 * @date 2019/12/04 21:28
 */
public class Model {

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+":"+JSON.toJSONString(this)+"\n";
    }
}
