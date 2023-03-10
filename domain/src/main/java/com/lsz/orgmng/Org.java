package com.lsz.orgmng;

import org.junit.Assert;

import java.util.Date;

/**
 * @ClassName Org
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午7:36
 * @Version 1.0.0
 **/
public class Org {

    private Long id;

    private Long tenantId;

    private Long superiorId;

    private String orgTypeCode;

    private Long leaderId;

    private String name;

    private OrgStatus status;

    private Date createAt;

    private Long createBy;

    private Date lastUpdatedAt;

    private Long lastUpdatedBy;


    public void cancel() {
        // 判断状态只有为有效才能取消
        Assert.assertTrue(isEffective());
        this.status = OrgStatus.CANCELLED;
    }

    public boolean isEffective() {
        return this.status == OrgStatus.EFFECTIVE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(Long superiorId) {
        this.superiorId = superiorId;
    }

    public String getOrgTypeCode() {
        return orgTypeCode;
    }

    public void setOrgTypeCode(String orgTypeCode) {
        this.orgTypeCode = orgTypeCode;
    }

    public Long getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgStatus getStatus() {
        return status;
    }

    public void setStatus(OrgStatus status) {
        this.status = status;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Long getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Long lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
