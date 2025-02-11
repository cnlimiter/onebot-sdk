package cn.evole.onebot.sdk.action;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2025/2/9 13:38
 * @Description:
 */
public interface BaseBot extends OneBot, GoCQHTTPExtend, GensokyoExtend, LagrangeExtend, LLOneBotExtend{
    long getSelfId();
}
