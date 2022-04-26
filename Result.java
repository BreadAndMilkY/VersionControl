package com.bread.blog.vo;

import lombok.*;

/**
 * @Auther：Z
 * @Date：2022/2/17 - 14:04
 * @Description：com.bread.blog.vo
 * @Vsersion：1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
	/**
	进行了代码修改
*/

    private int code;

    private boolean success;

    private String message;

    private Object data;

    public static Result success(Object data){
        return new Result(200, true, "success", data);
    }

    public static Result fail(int code, String message){
        return new Result(code, false, message, null);
    }

}
