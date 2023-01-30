package com.lsz.orgmng;

import java.util.Date;

/**
 * @ClassName OrgBuilder
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午8:00
 * @Version 1.0.0
 **/
public class OrgBuilder {

    private OrgValidator orgValidator;

    public OrgBuilder(OrgValidator orgValidator) {
        this.orgValidator = orgValidator;
    }

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

    public OrgBuilder tenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }


    public Org build() {
        // valid
        valid();

        return new Org();
    }


    private void valid() {
        orgValidator.tenantNotBeEmpty(this.tenantId);
    }

}
