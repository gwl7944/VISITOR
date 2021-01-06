package com.web.service.impl;

import com.web.dao.AffairDao;
import com.web.pojo.Personnel;
import com.web.pojo.User;
import com.web.service.AffairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.service.impl
 * @ClassName: AffairServiceImpl
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:38
 * @Version: 1.0
 */

@Service
public class AffairServiceImpl implements AffairService {

    @Autowired
    AffairDao affairDao;


    @Override
    public User login(User user) {
        return affairDao.login(user);
    }

    @Override
    public int insertPersonnel(Personnel personnel) {
        personnel.setIntotime(new Date());
        return affairDao.insertPersonnel(personnel);
    }

    @Override
    public List<Personnel> findAllPersonnel() {
        return affairDao.findAllPersonnel();
    }
}
