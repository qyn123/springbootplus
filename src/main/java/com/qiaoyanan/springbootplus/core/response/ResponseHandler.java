package com.qiaoyanan.springbootplus.core.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @author qiaoyn
 **/
public class ResponseHandler {
    private static final Logger log = LoggerFactory.getLogger(ResponseHandler.class);

    public ResponseHandler() {
    }

    public static <T> OutDTO<T> makeOkResp(T body) {
        return OutDTOBuild.builder().code("0").referenceError("").message("服务调用成功").build(body);
    }

    public static OutDTO makeErrResp(Throwable t, String message, String referenceError) {
        return OutDTOBuild.builder().code("999999").referenceError(referenceError).message(message).reason(Optional.ofNullable(t).isPresent() ? t.getMessage() : "").build();
    }


}

