package com.api.pojo;

import java.util.Date;

public class CheckreportImages {
    private Integer id;

    private Integer checkId;

    private String imageUri;

    private String creator;

    private Date createTime;

    private Date modifyTime;

    private Integer reportIncomeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri == null ? null : imageUri.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getReportIncomeId() {
        return reportIncomeId;
    }

    public void setReportIncomeId(Integer reportIncomeId) {
        this.reportIncomeId = reportIncomeId;
    }
}