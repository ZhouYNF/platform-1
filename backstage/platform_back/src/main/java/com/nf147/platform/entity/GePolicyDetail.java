package com.nf147.platform.entity;

import java.util.Date;

public class GePolicyDetail {
    private Integer id;

    private Integer policyRawId;

    private String indexNumber;

    private String title;

    private String releaseOffice;

    private String releaseNumber;

    private String policyBasis;

    private Date wirittenTime;

    private Date releaseTime;

    private Date effectTime;

    private String keyWord;

    private String impementSubject;

    private String directImpementSubject;

    private String imageUrl;

    private Date createdTime;

    private Date updatedTime;

    private String status;

    private String content;

    private GePolicy gepolicy;

    public GePolicyDetail(Integer id, Integer policyRawId, String indexNumber, String title, String releaseOffice, String releaseNumber, String policyBasis, Date wirittenTime, Date releaseTime, Date effectTime, String keyWord, String impementSubject, String directImpementSubject, String imageUrl, Date createdTime, Date updatedTime, String status, String content, GePolicy gepolicy) {
        this.id = id;
        this.policyRawId = policyRawId;
        this.indexNumber = indexNumber;
        this.title = title;
        this.releaseOffice = releaseOffice;
        this.releaseNumber = releaseNumber;
        this.policyBasis = policyBasis;
        this.wirittenTime = wirittenTime;
        this.releaseTime = releaseTime;
        this.effectTime = effectTime;
        this.keyWord = keyWord;
        this.impementSubject = impementSubject;
        this.directImpementSubject = directImpementSubject;
        this.imageUrl = imageUrl;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.status = status;
        this.content = content;
        this.gepolicy = gepolicy;
    }

    public GePolicy getGepolicy() {
        return gepolicy;
    }

    public void setGepolicy(GePolicy gepolicy) {
        this.gepolicy = gepolicy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyRawId() {
        return policyRawId;
    }

    public void setPolicyRawId(Integer policyRawId) {
        this.policyRawId = policyRawId;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber == null ? null : indexNumber.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReleaseOffice() {
        return releaseOffice;
    }

    public void setReleaseOffice(String releaseOffice) {
        this.releaseOffice = releaseOffice == null ? null : releaseOffice.trim();
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber == null ? null : releaseNumber.trim();
    }

    public String getPolicyBasis() {
        return policyBasis;
    }

    public void setPolicyBasis(String policyBasis) {
        this.policyBasis = policyBasis == null ? null : policyBasis.trim();
    }

    public Date getWirittenTime() {
        return wirittenTime;
    }

    public void setWirittenTime(Date wirittenTime) {
        this.wirittenTime = wirittenTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord == null ? null : keyWord.trim();
    }

    public String getImpementSubject() {
        return impementSubject;
    }

    public void setImpementSubject(String impementSubject) {
        this.impementSubject = impementSubject == null ? null : impementSubject.trim();
    }

    public String getDirectImpementSubject() {
        return directImpementSubject;
    }

    public void setDirectImpementSubject(String directImpementSubject) {
        this.directImpementSubject = directImpementSubject == null ? null : directImpementSubject.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}