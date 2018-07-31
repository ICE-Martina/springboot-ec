package com.example.springbootec.dao;


import com.example.springbootec.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends ElasticsearchRepository<User,String> {

    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    User queryUserById(String id);
}
