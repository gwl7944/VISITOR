package com.web.controller;

import com.alibaba.fastjson.JSON;
import com.web.pojo.Personnel;
import com.web.pojo.ResultCode;
import com.web.pojo.ResultData;
import com.web.pojo.User;
import com.web.service.AffairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.controller
 * @ClassName: AffairController
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:38
 * @Version: 1.0
 */

@RestController
@Slf4j
public class AffairController {

    @Autowired
    AffairService affairService;


    @InitBinder
    public void init(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }


    //登录
    @PostMapping("/AffairController/login")
    @ResponseBody
    public JSON login(@ModelAttribute  User user){
         log.info(user.toString());
        User login = affairService.login(user);
        if (login!=null){
            return ResultData.getResponseData(login, ResultCode.LOGIN_SUCCESS);
        }else {
            return ResultData.getResponseData(null, ResultCode.USER_PWD_ERROR);
        }
    }

    //录入信息
    @PostMapping("/AffairController/insertPersonnel")
    @ResponseBody
    public JSON insertPersonnel(@ModelAttribute Personnel personnel){
        log.info(personnel.toString());
        int i = affairService.insertPersonnel(personnel);
        if (i>0){
            return ResultData.getResponseData(null, ResultCode.INSERT_SUCCESS);
        }else {
            return ResultData.getResponseData(null, ResultCode.INSERT_ERROR);
        }
    }

    //查看人员信息
    @GetMapping("/AffairController/findAllPersonnel")
    @ResponseBody
    public JSON findAllPersonnel(){
        List<Personnel> allPersonnel = affairService.findAllPersonnel();
        return ResultData.getResponseData(allPersonnel, ResultCode.QUERY_SUCCESS);
    }
}
