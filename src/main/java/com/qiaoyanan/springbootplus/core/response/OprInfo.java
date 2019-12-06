package com.qiaoyanan.springbootplus.core.response;

/**
 * @author qiaoyn
 **/
public class OprInfo {
    private Long opAccept;
    private Long totalDate;
    private String systemUserCode;
    private String opCode;
    private String opNote;
    private String opType;
    private String ipAddr;
    private Long orderId;
    private Integer brandId;
    private Long servId;
    private String accNbr;
    private Long acctId;
    private Integer channelId;
    private Long orgId;
    private Long regionId;
    private String bak1;
    private String bak2;
    private String bak3;

    public OprInfo() {
    }

    public Long getOpAccept() {
        return this.opAccept;
    }

    public Long getTotalDate() {
        return this.totalDate;
    }

    public String getSystemUserCode() {
        return this.systemUserCode;
    }

    public String getOpCode() {
        return this.opCode;
    }

    public String getOpNote() {
        return this.opNote;
    }

    public String getOpType() {
        return this.opType;
    }

    public String getIpAddr() {
        return this.ipAddr;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public Long getServId() {
        return this.servId;
    }

    public String getAccNbr() {
        return this.accNbr;
    }

    public Long getAcctId() {
        return this.acctId;
    }

    public Integer getChannelId() {
        return this.channelId;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public Long getRegionId() {
        return this.regionId;
    }

    public String getBak1() {
        return this.bak1;
    }

    public String getBak2() {
        return this.bak2;
    }

    public String getBak3() {
        return this.bak3;
    }

    public void setOpAccept(Long opAccept) {
        this.opAccept = opAccept;
    }

    public void setTotalDate(Long totalDate) {
        this.totalDate = totalDate;
    }

    public void setSystemUserCode(String systemUserCode) {
        this.systemUserCode = systemUserCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public void setOpNote(String opNote) {
        this.opNote = opNote;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public void setServId(Long servId) {
        this.servId = servId;
    }

    public void setAccNbr(String accNbr) {
        this.accNbr = accNbr;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof OprInfo)) {
            return false;
        } else {
            OprInfo other = (OprInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$opAccept = this.getOpAccept();
                Object other$opAccept = other.getOpAccept();
                if (this$opAccept == null) {
                    if (other$opAccept != null) {
                        return false;
                    }
                } else if (!this$opAccept.equals(other$opAccept)) {
                    return false;
                }

                Object this$totalDate = this.getTotalDate();
                Object other$totalDate = other.getTotalDate();
                if (this$totalDate == null) {
                    if (other$totalDate != null) {
                        return false;
                    }
                } else if (!this$totalDate.equals(other$totalDate)) {
                    return false;
                }

                Object this$systemUserCode = this.getSystemUserCode();
                Object other$systemUserCode = other.getSystemUserCode();
                if (this$systemUserCode == null) {
                    if (other$systemUserCode != null) {
                        return false;
                    }
                } else if (!this$systemUserCode.equals(other$systemUserCode)) {
                    return false;
                }

                label206: {
                    Object this$opCode = this.getOpCode();
                    Object other$opCode = other.getOpCode();
                    if (this$opCode == null) {
                        if (other$opCode == null) {
                            break label206;
                        }
                    } else if (this$opCode.equals(other$opCode)) {
                        break label206;
                    }

                    return false;
                }

                label199: {
                    Object this$opNote = this.getOpNote();
                    Object other$opNote = other.getOpNote();
                    if (this$opNote == null) {
                        if (other$opNote == null) {
                            break label199;
                        }
                    } else if (this$opNote.equals(other$opNote)) {
                        break label199;
                    }

                    return false;
                }

                Object this$opType = this.getOpType();
                Object other$opType = other.getOpType();
                if (this$opType == null) {
                    if (other$opType != null) {
                        return false;
                    }
                } else if (!this$opType.equals(other$opType)) {
                    return false;
                }

                label185: {
                    Object this$ipAddr = this.getIpAddr();
                    Object other$ipAddr = other.getIpAddr();
                    if (this$ipAddr == null) {
                        if (other$ipAddr == null) {
                            break label185;
                        }
                    } else if (this$ipAddr.equals(other$ipAddr)) {
                        break label185;
                    }

                    return false;
                }

                label178: {
                    Object this$orderId = this.getOrderId();
                    Object other$orderId = other.getOrderId();
                    if (this$orderId == null) {
                        if (other$orderId == null) {
                            break label178;
                        }
                    } else if (this$orderId.equals(other$orderId)) {
                        break label178;
                    }

                    return false;
                }

                Object this$brandId = this.getBrandId();
                Object other$brandId = other.getBrandId();
                if (this$brandId == null) {
                    if (other$brandId != null) {
                        return false;
                    }
                } else if (!this$brandId.equals(other$brandId)) {
                    return false;
                }

                Object this$servId = this.getServId();
                Object other$servId = other.getServId();
                if (this$servId == null) {
                    if (other$servId != null) {
                        return false;
                    }
                } else if (!this$servId.equals(other$servId)) {
                    return false;
                }

                label157: {
                    Object this$accNbr = this.getAccNbr();
                    Object other$accNbr = other.getAccNbr();
                    if (this$accNbr == null) {
                        if (other$accNbr == null) {
                            break label157;
                        }
                    } else if (this$accNbr.equals(other$accNbr)) {
                        break label157;
                    }

                    return false;
                }

                label150: {
                    Object this$acctId = this.getAcctId();
                    Object other$acctId = other.getAcctId();
                    if (this$acctId == null) {
                        if (other$acctId == null) {
                            break label150;
                        }
                    } else if (this$acctId.equals(other$acctId)) {
                        break label150;
                    }

                    return false;
                }

                Object this$channelId = this.getChannelId();
                Object other$channelId = other.getChannelId();
                if (this$channelId == null) {
                    if (other$channelId != null) {
                        return false;
                    }
                } else if (!this$channelId.equals(other$channelId)) {
                    return false;
                }

                label136: {
                    Object this$orgId = this.getOrgId();
                    Object other$orgId = other.getOrgId();
                    if (this$orgId == null) {
                        if (other$orgId == null) {
                            break label136;
                        }
                    } else if (this$orgId.equals(other$orgId)) {
                        break label136;
                    }

                    return false;
                }

                Object this$regionId = this.getRegionId();
                Object other$regionId = other.getRegionId();
                if (this$regionId == null) {
                    if (other$regionId != null) {
                        return false;
                    }
                } else if (!this$regionId.equals(other$regionId)) {
                    return false;
                }

                label122: {
                    Object this$bak1 = this.getBak1();
                    Object other$bak1 = other.getBak1();
                    if (this$bak1 == null) {
                        if (other$bak1 == null) {
                            break label122;
                        }
                    } else if (this$bak1.equals(other$bak1)) {
                        break label122;
                    }

                    return false;
                }

                Object this$bak2 = this.getBak2();
                Object other$bak2 = other.getBak2();
                if (this$bak2 == null) {
                    if (other$bak2 != null) {
                        return false;
                    }
                } else if (!this$bak2.equals(other$bak2)) {
                    return false;
                }

                Object this$bak3 = this.getBak3();
                Object other$bak3 = other.getBak3();
                if (this$bak3 == null) {
                    if (other$bak3 != null) {
                        return false;
                    }
                } else if (!this$bak3.equals(other$bak3)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof OprInfo;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $opAccept = this.getOpAccept();
        result = result * 59 + ($opAccept == null ? 43 : $opAccept.hashCode());
        Object $totalDate = this.getTotalDate();
        result = result * 59 + ($totalDate == null ? 43 : $totalDate.hashCode());
        Object $systemUserCode = this.getSystemUserCode();
        result = result * 59 + ($systemUserCode == null ? 43 : $systemUserCode.hashCode());
        Object $opCode = this.getOpCode();
        result = result * 59 + ($opCode == null ? 43 : $opCode.hashCode());
        Object $opNote = this.getOpNote();
        result = result * 59 + ($opNote == null ? 43 : $opNote.hashCode());
        Object $opType = this.getOpType();
        result = result * 59 + ($opType == null ? 43 : $opType.hashCode());
        Object $ipAddr = this.getIpAddr();
        result = result * 59 + ($ipAddr == null ? 43 : $ipAddr.hashCode());
        Object $orderId = this.getOrderId();
        result = result * 59 + ($orderId == null ? 43 : $orderId.hashCode());
        Object $brandId = this.getBrandId();
        result = result * 59 + ($brandId == null ? 43 : $brandId.hashCode());
        Object $servId = this.getServId();
        result = result * 59 + ($servId == null ? 43 : $servId.hashCode());
        Object $accNbr = this.getAccNbr();
        result = result * 59 + ($accNbr == null ? 43 : $accNbr.hashCode());
        Object $acctId = this.getAcctId();
        result = result * 59 + ($acctId == null ? 43 : $acctId.hashCode());
        Object $channelId = this.getChannelId();
        result = result * 59 + ($channelId == null ? 43 : $channelId.hashCode());
        Object $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        Object $regionId = this.getRegionId();
        result = result * 59 + ($regionId == null ? 43 : $regionId.hashCode());
        Object $bak1 = this.getBak1();
        result = result * 59 + ($bak1 == null ? 43 : $bak1.hashCode());
        Object $bak2 = this.getBak2();
        result = result * 59 + ($bak2 == null ? 43 : $bak2.hashCode());
        Object $bak3 = this.getBak3();
        result = result * 59 + ($bak3 == null ? 43 : $bak3.hashCode());
        return result;
    }

    public String toString() {
        return "OprInfo(opAccept=" + this.getOpAccept() + ", totalDate=" + this.getTotalDate() + ", systemUserCode=" + this.getSystemUserCode() + ", opCode=" + this.getOpCode() + ", opNote=" + this.getOpNote() + ", opType=" + this.getOpType() + ", ipAddr=" + this.getIpAddr() + ", orderId=" + this.getOrderId() + ", brandId=" + this.getBrandId() + ", servId=" + this.getServId() + ", accNbr=" + this.getAccNbr() + ", acctId=" + this.getAcctId() + ", channelId=" + this.getChannelId() + ", orgId=" + this.getOrgId() + ", regionId=" + this.getRegionId() + ", bak1=" + this.getBak1() + ", bak2=" + this.getBak2() + ", bak3=" + this.getBak3() + ")";
    }
}
