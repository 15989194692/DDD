package com.lsz.orgmng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName OrgBuilderFactory
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午8:18
 * @Version 1.0.0
 **/
@Component
public class OrgBuilderFactory {

    @Autowired
    private OrgValidator orgValidator;

    public OrgBuilder build() {
        return new OrgBuilder(orgValidator);
    }


}
