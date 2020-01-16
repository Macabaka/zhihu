package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Auther: Jack
 * @Date: 2020/1/15 21:55
 * @Description:
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;

}
