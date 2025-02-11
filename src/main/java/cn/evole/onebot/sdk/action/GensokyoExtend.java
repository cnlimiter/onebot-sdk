package cn.evole.onebot.sdk.action;

import cn.evole.onebot.sdk.action.misc.ActionData;
import cn.evole.onebot.sdk.action.misc.ActionRaw;
import cn.evole.onebot.sdk.entity.ArrayMsg;
import cn.evole.onebot.sdk.entity.MsgId;

import java.util.List;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2025/2/9 01:41
 * @Description: from Shiro
 */
public interface GensokyoExtend {
    /**
     * 发送群消息
     *
     * @param groupId    群号
     * @param userId     调用者的QQ号 , 在QQ开放平台中用于设定@对象，如果不设置此参数会导致: 在bot返回前如果被不同用户多次调用，只会@最后一次调用的用户
     * @param msg        要发送的内容
     * @param autoEscape 消息内容是否作为纯文本发送 ( 即不解析 CQ 码 ) , 只在 message 字段是字符串时有效
     * @return result {@link ActionData} of {@link MsgId}
     */
    ActionData<MsgId> sendGroupMsg(long groupId, long userId, List<ArrayMsg> msg, boolean autoEscape);

    /**
     * 撤回消息（兼容gsk）
     *
     * @param groupId 群号
     * @param userId  用户id
     * @param msgId   消息 ID
     * @return result {@link ActionRaw}
     */
    ActionRaw deleteMsg(long groupId, long userId, int msgId);
}
