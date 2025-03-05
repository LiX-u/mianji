package com.lixu.mianji.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * AiManagerTest
 * @Author lixu
 * @From SDTBU
 */
@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    String userPrompt = "你好";

    @Test
    void doChat() {
        String s = aiManager.doChat(userPrompt);
        System.out.println(s);
    }
}