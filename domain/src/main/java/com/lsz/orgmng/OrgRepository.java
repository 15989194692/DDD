package com.lsz.orgmng;

/**
 * @ClassName OrgRepository
 * @Description TODO
 * @Author lishuzeng
 * @Date 2023/1/30 下午8:03
 * @Version 1.0.0
 **/
public interface OrgRepository {

    Org findById(Long id);

    void save(Org org);
}
