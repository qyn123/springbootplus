package com.qiaoyanan.springbootplus.core.response;

/**
 * @author qiaoyn
 **/
public class InDTO {
    private OprInfo oprInfo;

    public InDTO() {
    }

    public OprInfo getOprInfo() {
        return this.oprInfo;
    }

    public void setOprInfo(OprInfo oprInfo) {
        this.oprInfo = oprInfo;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof InDTO)) {
            return false;
        } else {
            InDTO other = (InDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$oprInfo = this.getOprInfo();
                Object other$oprInfo = other.getOprInfo();
                if (this$oprInfo == null) {
                    if (other$oprInfo != null) {
                        return false;
                    }
                } else if (!this$oprInfo.equals(other$oprInfo)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof InDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $oprInfo = this.getOprInfo();
        result = result * 59 + ($oprInfo == null ? 43 : $oprInfo.hashCode());
        return result;
    }

    public String toString() {
        return "InDTO(oprInfo=" + this.getOprInfo() + ")";
    }
}
