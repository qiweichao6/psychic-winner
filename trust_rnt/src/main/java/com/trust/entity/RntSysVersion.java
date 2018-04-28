package com.trust.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class RntSysVersion implements Serializable {
    private Long versionId;

    private String sysName;

    private String versionNum;

    private String applicationMarket;

    private String downloadUrl;

    private String versionDes;

    private String sysCode;

    private Integer num;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publishTime;

    private static final long serialVersionUID = 1L;

    public RntSysVersion(Long versionId, String sysName, String versionNum, String applicationMarket, String downloadUrl, String versionDes, String sysCode, Integer num, Date publishTime) {
        this.versionId = versionId;
        this.sysName = sysName;
        this.versionNum = versionNum;
        this.applicationMarket = applicationMarket;
        this.downloadUrl = downloadUrl;
        this.versionDes = versionDes;
        this.sysCode = sysCode;
        this.num = num;
        this.publishTime = publishTime;
    }

    public RntSysVersion() {
        super();
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum == null ? null : versionNum.trim();
    }

    public String getApplicationMarket() {
        return applicationMarket;
    }

    public void setApplicationMarket(String applicationMarket) {
        this.applicationMarket = applicationMarket == null ? null : applicationMarket.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getVersionDes() {
        return versionDes;
    }

    public void setVersionDes(String versionDes) {
        this.versionDes = versionDes == null ? null : versionDes.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public Integer getnum() {
        return num;
    }

    public void setnum(Integer num) {
        this.num = num;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        RntSysVersion other = (RntSysVersion) that;
        return (this.getVersionId() == null ? other.getVersionId() == null : this.getVersionId().equals(other.getVersionId()))
            && (this.getSysName() == null ? other.getSysName() == null : this.getSysName().equals(other.getSysName()))
            && (this.getVersionNum() == null ? other.getVersionNum() == null : this.getVersionNum().equals(other.getVersionNum()))
            && (this.getApplicationMarket() == null ? other.getApplicationMarket() == null : this.getApplicationMarket().equals(other.getApplicationMarket()))
            && (this.getDownloadUrl() == null ? other.getDownloadUrl() == null : this.getDownloadUrl().equals(other.getDownloadUrl()))
            && (this.getVersionDes() == null ? other.getVersionDes() == null : this.getVersionDes().equals(other.getVersionDes()))
            && (this.getSysCode() == null ? other.getSysCode() == null : this.getSysCode().equals(other.getSysCode()))
            && (this.getnum() == null ? other.getnum() == null : this.getnum().equals(other.getnum()))
            && (this.getPublishTime() == null ? other.getPublishTime() == null : this.getPublishTime().equals(other.getPublishTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        result = prime * result + ((getSysName() == null) ? 0 : getSysName().hashCode());
        result = prime * result + ((getVersionNum() == null) ? 0 : getVersionNum().hashCode());
        result = prime * result + ((getApplicationMarket() == null) ? 0 : getApplicationMarket().hashCode());
        result = prime * result + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        result = prime * result + ((getVersionDes() == null) ? 0 : getVersionDes().hashCode());
        result = prime * result + ((getSysCode() == null) ? 0 : getSysCode().hashCode());
        result = prime * result + ((getnum() == null) ? 0 : getnum().hashCode());
        result = prime * result + ((getPublishTime() == null) ? 0 : getPublishTime().hashCode());
        return result;
    }
}