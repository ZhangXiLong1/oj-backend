package com.zxl.oj.model.dto.question;

import me.chanjar.weixin.mp.bean.card.TimeLimit;

/**
 * @author zxl
 * @date 2024/4/29
 * 题目配置
 */
public class JudgeConfig {
    /**
     * 时间限制
     * ms
     */
    private Long timeLimit;
    /**
     * 内存限制
     * kb
     */
    private Long memoryLimit;
    /**
     * 堆栈限制
     * kb
     */
    private Long stackLimit;
}
