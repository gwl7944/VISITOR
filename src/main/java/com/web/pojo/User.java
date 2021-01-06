package com.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: VISITOR
 * @Package: com.web.pojo
 * @ClassName: User
 * @Author: gwl
 * @Description:
 * @Date: 2021/1/5 18:28
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String loginname;
    private String password;
    private String username;
    private String gender;
    private Integer del;

}
