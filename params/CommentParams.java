package com.bread.blog.vo.params;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

/**
 * @Auther：Z
 * @Date：2022/2/19 - 08:51
 * @Description：com.bread.blog.vo.params
 * @Vsersion：1.0
 */
@Data
public class CommentParams {


    @JsonSerialize(using = ToStringSerializer.class)
    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;

}
