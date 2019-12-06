package com.qiaoyanan.springbootplus.core.response;

/**
 * @author qiaoyn
 **/
public class OutDTO<T> implements IOutDTO, IBaseOutDto<T> {
    private String code = "0";
    private String message = "";
    private String reason;
    private String referenceError;
    private T body;

    public T getBodyOutData() {
        return this.body;
    }

    public void setBodyOutData(T t) {
        this.body = t;
    }

    public <X> X getHeader() {
        return null;
    }

    public void setHeader(Object header) {
    }

    public String getRtnCode() {
        return this.code;
    }

    public String getRtnMsg() {
        return this.message;
    }

    public String getRtnDetailMsg() {
        return this.reason;
    }

    public String toJsonString() {
        return null;
    }

    public void addRunIp(String ip) {
    }

    public void addRunPort(String port) {
    }

    public void addReqest_id(String reqestId) {
    }

    public OutDTO() {
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getReason() {
        return this.reason;
    }

    public String getReferenceError() {
        return this.referenceError;
    }

    public T getBody() {
        return this.body;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setReferenceError(String referenceError) {
        this.referenceError = referenceError;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof OutDTO)) {
            return false;
        } else {
            OutDTO<?> other = (OutDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label71;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label71;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                label57: {
                    Object this$reason = this.getReason();
                    Object other$reason = other.getReason();
                    if (this$reason == null) {
                        if (other$reason == null) {
                            break label57;
                        }
                    } else if (this$reason.equals(other$reason)) {
                        break label57;
                    }

                    return false;
                }

                Object this$referenceError = this.getReferenceError();
                Object other$referenceError = other.getReferenceError();
                if (this$referenceError == null) {
                    if (other$referenceError != null) {
                        return false;
                    }
                } else if (!this$referenceError.equals(other$referenceError)) {
                    return false;
                }

                Object this$body = this.getBody();
                Object other$body = other.getBody();
                if (this$body == null) {
                    if (other$body == null) {
                        return true;
                    }
                } else if (this$body.equals(other$body)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof OutDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        Object $referenceError = this.getReferenceError();
        result = result * 59 + ($referenceError == null ? 43 : $referenceError.hashCode());
        Object $body = this.getBody();
        result = result * 59 + ($body == null ? 43 : $body.hashCode());
        return result;
    }

    public String toString() {
        return "OutDTO(code=" + this.getCode() + ", message=" + this.getMessage() + ", reason=" + this.getReason() + ", referenceError=" + this.getReferenceError() + ", body=" + this.getBody() + ")";
    }
}

