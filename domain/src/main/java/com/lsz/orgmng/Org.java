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

}
