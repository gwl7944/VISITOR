package com.web.service;

import com.web.pojo.Personnel;
import com.web.pojo.User;


import java.util.List;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.service
 * @ClassName: AffairService
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:37
 * @Version: 1.0
 */


public interface AffairService {

    //登录
    User login(User user);

    //录入信息
    int insertPersonnel(Personnel personnel);

    //查看人员信息
    List<Personnel> findAllPersonnel();

}
