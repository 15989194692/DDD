package com.lsz.web;

import com.lsz.orgmng.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName OrgController
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午7:41
 * @Version 1.0.0
 **/
public class OrgController {


    @Autowired
    private OrgService orgService;


    public AddOrgDto addOrg(AddOrgRequest request) {
        return orgService.addOrg(request);
    }

    public CancelOrgDto cancelOrg(CancelOrgRequest request) {
        return orgService.cancel(request);
    }

}
