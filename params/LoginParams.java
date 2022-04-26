package com.bread.blog.vo.params;

import lombok.Data;

/**
 * @Auther：Z
 * @Date：2022/2/17 - 21:29
 * @Description：com.bread.blog.vo.params
 * @Vsersion：1.0
 */
@Data
public class LoginParams {

    private String account;

    private String password;

    private String nickname;

}
