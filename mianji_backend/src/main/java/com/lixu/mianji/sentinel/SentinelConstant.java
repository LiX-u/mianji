package com.lixu.mianji.sentinel;

/**
 * Sentinel 限流熔断常量
 * @Author lixu
 * @From SDTBU
 */
public interface SentinelConstant {

    /**
     * 分页获取题库列表接口限流
     */
    String listQuestionBankVOByPage = "listQuestionBankVOByPage";

    /**
     * 分页获取题目列表接口限流
     */
    String listQuestionVOByPage = "listQuestionVOByPage";
}
