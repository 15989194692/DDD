package com.lsz.orgmng;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName OrgService
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午7:44
 * @Version 1.0.0
 **/
public class OrgService {

    @Autowired
    private OrgRepository orgRepository;

    @Autowired
    private OrgBuilderFactory orgBuilderFactory;

    public AddOrgDto addOrg(AddOrgRequest request) {
        Org org = orgBuilderFactory.build()
                .tenantId(request.getTenantId())
                .build();
        orgRepository.save(org);
        return null;
    }

    public CancelOrgDto cancel(CancelOrgRequest request) {
        Org org = orgRepository.findById(request.getTenantId());
        Assert.assertNotNull(org);
        org.cancel();
        orgRepository.save(org);
        return null;
    }
}
