package com.lixu.mianji.deepseek;

import cn.dev33.satoken.annotation.SaCheckRole;
import com.lixu.mianji.common.BaseResponse;
import com.lixu.mianji.common.ResultUtils;
import com.lixu.mianji.constant.UserConstant;
import com.lixu.mianji.manager.AiManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AI 聊天窗口 - 测试版
 * @Author lixu
 * @From SDTBU
 */
@RestController
@RequestMapping("/ai")
@Slf4j
public class AiChatTest {

    @Resource
    private AiManager aiManager;

    @PostMapping("/userChat/window")
    @SaCheckRole(UserConstant.USER_LOGIN_STATE)
    public BaseResponse<String> doChat(@RequestBody String msg) {
        String s = aiManager.doChat(msg);
        return ResultUtils.success(s);
    }
}
