package com.bread.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther：Z
 * @Date：2022/2/18 - 19:18
 * @Description：com.bread.blog.vo
 * @Vsersion：1.0
 */
@Data
public class CommentVo {

    // 防止前端精度损失
//    @JsonSerialize(using = ToStringSerializer.class)
//    private Long id;
    private String id;

    private UserVo author;

    private String content;

    private List<CommentVo> children;

    private String createDate;

    private Integer level;

    private UserVo toUser;


}
