package com.bread.blog.vo.params;

import com.bread.blog.vo.CategoryVo;
import com.bread.blog.vo.TagVo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.util.List;

/**
 * @Auther：Z
 * @Date：2022/2/19 - 11:08
 * @Description：com.bread.blog.vo.params
 * @Vsersion：1.0
 */
@Data
public class ArticleParams {


    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    private ArticleBodyParams body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;

}
