package com.zxl.oj.service;

import com.zxl.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zxl.oj.model.entity.User;

/**
* @author 15702
* @description 针对表【questionsubmit(题目提交)】的数据库操作Service
* @createDate 2024-04-29 10:47:25
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionId
     * @param loginUser
     * @return
     */
    int doQuestionSubmit(long questionId, User loginUser);

    /**
     * 帖子题目提交（内部服务）
     *
     * @param userId
     * @param questionId
     * @return
     */
    int doQuestionSubmitInner(long userId, long questionId);
}
