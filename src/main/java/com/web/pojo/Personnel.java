package com.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.pojo
 * @ClassName: Personnel
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:30
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnel {

    private Integer id;
    private String name;
    private String gender;
    private Date birthday;         //生日
    private String native_place;   //籍贯
    private String nation;         //民族
    private String telephone;      //联系方式
    private String term_validity;  //有效期
    private String face_url;       //人脸地址
    private String distinguish;    //识别结果
    private String temperature;   //体温
    private Integer abnormal;   //是否异常
    private Date intotime;     //录入时间
    private Integer state;
    private Integer del;

}
