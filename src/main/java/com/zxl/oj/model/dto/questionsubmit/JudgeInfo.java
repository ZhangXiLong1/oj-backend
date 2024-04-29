package com.zxl.oj.model.dto.questionsubmit;

/**
 * @author zxl
 * @date 2024/4/29
 * 题目配置
 */
public class JudgeInfo {
    /**
     * 程序执行信息
     * ms
     */
    private String message;
    /**
     * 消耗的内存
     * kb
     */
    private long memory;
    /**
     * 堆栈限制
     * kb
     */
    private long time;
}
