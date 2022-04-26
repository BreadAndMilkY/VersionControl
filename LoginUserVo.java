package com.bread.blog.vo;

import lombok.Data;

/**
 * @Auther：Z
 * @Date：2022/2/18 - 10:10
 * @Description：com.bread.blog.vo
 * @Vsersion：1.0
 */
@Data
public class LoginUserVo {


//    @JsonSerialize(using = ToStringSerializer.class)
//    private Long id;

    private String id;

    private String account;

    private String nickname;

    private String avatar;

}
