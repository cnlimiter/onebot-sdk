package cn.evolvefield.onebot.sdk.listener.impl;

import cn.evolvefield.onebot.sdk.handler.Handler;
import cn.evolvefield.onebot.sdk.listener.DefaultHandlerListener;
import cn.evolvefield.onebot.sdk.model.event.message.GroupMessageEvent;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/9/14 16:15
 * Version: 1.0
 */
public class GroupMessageListener extends DefaultHandlerListener<GroupMessageEvent> {

    @Override
    public void onMessage(GroupMessageEvent groupMessage) {
        //处理逻辑
        String message = groupMessage.getMessage();
        String[] split = message.split(" ");
        String key = split[0];
        Handler<GroupMessageEvent> handler = getHandler(key);
        if (handler != null) {
        handler.handle(groupMessage);
        }
    }
}
