package com.web.dao;

import com.web.pojo.Personnel;
import com.web.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.dao
 * @ClassName: AffairDao
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:37
 * @Version: 1.0
 */

@Mapper
public interface AffairDao {

    //登录
    @Select("select * from user where loginname=#{loginname} and password=#{password}")
    User login(User user);


    //录入信息
    @Insert("insert into personnel (id,name,gender,birthday,native_place,nation,telephone,term_validity,face_url,distinguish,temperature,abnormal,intotime,state,del) " +
            "values(#{id},#{name},#{gender},#{birthday},#{native_place},#{nation},#{telephone},#{term_validity},#{face_url},#{distinguish},#{temperature},#{abnormal},#{intotime},1,1)")
    int insertPersonnel(Personnel personnel);


    //查看人员信息
    @Select("select * from personnel order by intotime desc")
    List<Personnel> findAllPersonnel();


}
