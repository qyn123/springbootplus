package com.qiaoyanan.springbootplus.core.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * @author qiaoyn
 **/
public interface IBaseOutDto<T> extends Serializable {
    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    T getBodyOutData();

    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    void setBodyOutData(T t);

    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    <X> X getHeader();

    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    void setHeader(Object header);
}
