package com.yupi.yupao.model.dto;

import com.yupi.yupao.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


/**
 * 队伍查询封装类
 * 1. callSuper = true，根据子类自身的字段值和从父类继承的字段值 来生成hashcode，
 * 当两个子类对象比较时，只有子类对象的本身的字段值和继承父类的字段值都相同，equals方法的返回值是true。
 *
 * 2. callSuper = false，根据子类自身的字段值 来生成hashcode，
 * 当两个子类对象比较时，只有子类对象的本身的字段值相同，父类字段值可以不同，equals方法的返回值是true。
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TeamQuery extends PageRequest {
    /**
     * id
     */
    private Long id;

    /**
     * id 列表
     */
    private List<Long> idList;

    /**
     * 搜索关键词（同时对队伍名称和描述搜索）
     */
    private String searchText;

    /**
     * 队伍名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 最大人数
     */
    private Integer maxNum;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 0 - 公开，1 - 私有，2 - 加密
     */
    private Integer status;
}
