package com.qiaoyanan.springbootplus.core.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author qiaoyn
 **/
public interface IOutDTO {
    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    String getRtnCode();

    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    String getRtnMsg();

    @JSONField(
            serialize = false,
            deserialize = false
    )
    @JsonIgnore
    String getRtnDetailMsg();

    String toJsonString();

    void addRunIp(String ip);

    @JSONField(
            serialize = false,
            deserialize = false
    )
    void addRunPort(String port);

    @JSONField(
            serialize = false,
            deserialize = false
    )
    void addReqest_id(String reqestId);
}
