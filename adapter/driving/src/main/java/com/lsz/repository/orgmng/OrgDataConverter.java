/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.lsz.repository.orgmng;

import com.lsz.orgmng.Org;
import com.lsz.orgmng.OrgStatus;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.util.CollectionUtils;

/**
 * @author lishuzeng
 * @version : OrgDataConverter.java, v 0.1 2023年02月13日 下午2:00 lishuzeng Exp $
 */
@Mapper(builder = @Builder(disableBuilder = true),
        imports = {OrgStatus.class})
public interface OrgDataConverter {

    OrgDataConverter INSTANCE = Mappers.getMapper(OrgDataConverter.class);

    Org toDomain(OrgDO orgDO);

    OrgDO toDO(Org org);
}