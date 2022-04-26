package com.bread.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther：Z
 * @Date：2022/2/17 - 14:28
 * @Description：com.bread.blog.vo
 * @Vsersion：1.0
 */
@Data
public class ArticleVo {

    // 防止前端精度损失
//    @JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}
