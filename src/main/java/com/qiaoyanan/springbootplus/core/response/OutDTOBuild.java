package com.qiaoyanan.springbootplus.core.response;

/**
 * @author qiaoyn
 **/
public class OutDTOBuild {
    public OutDTOBuild() {
    }

    public static OutDTOBuild.Builder builder() {
        return new OutDTOBuild.Builder();
    }

    public static class Builder {
        private OutDTO outBody = new OutDTO();

        public Builder() {
        }

        public OutDTOBuild.Builder code(String rtnCode) {
            this.outBody.setCode(rtnCode);
            return this;
        }

        public OutDTOBuild.Builder message(String rtnMsg) {
            this.outBody.setMessage(rtnMsg);
            return this;
        }

        public OutDTOBuild.Builder reason(String reason) {
            this.outBody.setReason(reason);
            return this;
        }

        public OutDTOBuild.Builder referenceError(String referenceError) {
            this.outBody.setReferenceError(referenceError);
            return this;
        }

        public <T> OutDTO<T> build() {
            return this.outBody;
        }

        public <T> OutDTO<T> build(T outData) {
            this.outBody.setBody(outData);
            return this.outBody;
        }
    }
}
