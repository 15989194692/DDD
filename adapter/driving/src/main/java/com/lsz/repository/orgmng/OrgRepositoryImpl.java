package com.lsz.repository.orgmng;

import com.lsz.orgmng.Org;
import com.lsz.orgmng.OrgRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName OrgRepositoryImpl
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午8:04
 * @Version 1.0.0
 **/
@Repository
public class OrgRepositoryImpl implements OrgRepository {

    @Override
    public Org findById(Long id) {
        return null;
    }

    @Override
    public void save(Org org) {

    }
}
