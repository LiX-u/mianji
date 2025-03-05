package com.lixu.mianji.model.dto.mockinterview;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建模拟面试请求
 * @Author lixu
 * @From SDTBU
 */
@Data
public class MockInterviewAddRequest implements Serializable {

    /**
     * 工作年限
     */
    private String workExperience;

    /**
     * 工作岗位
     */
    private String jobPosition;

    /**
     * 面试难度
     */
    private String difficulty;

    private static final long serialVersionUID = 1L;
}