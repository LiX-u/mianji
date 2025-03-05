package com.lixu.mianji.service;

import com.lixu.mianji.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lixu.mianji.model.entity.User;

/**
 * 帖子点赞服务
 * @Author lixu
 * @From SDTBU
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     */
    int doPostThumbInner(long userId, long postId);
}
