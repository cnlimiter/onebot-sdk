package cn.evolvefield.onebot.sdk.model.event;

import cn.evolvefield.onebot.sdk.model.event.message.GroupMessageEvent;
import cn.evolvefield.onebot.sdk.model.event.message.GuildMessageEvent;
import cn.evolvefield.onebot.sdk.model.event.message.PrivateMessageEvent;
import cn.evolvefield.onebot.sdk.model.event.message.WholeMessageEvent;
import cn.evolvefield.onebot.sdk.model.event.notice.*;
import cn.evolvefield.onebot.sdk.model.event.request.FriendAddRequestEvent;
import cn.evolvefield.onebot.sdk.model.event.request.GroupAddRequestEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/9/14 17:04
 * Version: 1.0
 */
public class MessageMap {
    public static Map<String, Class<? extends Event>> messageMap = new HashMap<>();

    static {
        messageMap.put("groupMessage", GroupMessageEvent.class);
        messageMap.put("privateMessage", PrivateMessageEvent.class);
        messageMap.put("wholeMessage", WholeMessageEvent.class);
        messageMap.put("guildMessage", GuildMessageEvent.class);

        messageMap.put("friend", FriendAddRequestEvent.class);
        messageMap.put("group", GroupAddRequestEvent.class);

        messageMap.put("group_upload", GroupUploadNoticeEvent.class);
        messageMap.put("group_admin", GroupAdminNoticeEvent.class);
        messageMap.put("group_decrease", GroupDecreaseNoticeEvent.class);
        messageMap.put("group_increase", GroupIncreaseNoticeEvent.class);
        messageMap.put("group_ban", GroupBanNoticeEvent.class);
        messageMap.put("group_recall", GroupMsgDeleteNoticeEvent.class);
        messageMap.put("poke", PokeNoticeEvent.class);
        messageMap.put("lucky_king", GroupLuckyKingNoticeEvent.class);
        messageMap.put("honor", GroupHonorChangeNoticeEvent.class);
        messageMap.put("group_card", GroupCardChangeNoticeEvent.class);

        messageMap.put("friend_add", FriendAddNoticeEvent.class);
        messageMap.put("friend_recall", PrivateMsgDeleteNoticeEvent.class);
        messageMap.put("essence", GroupEssenceNoticeEvent.class);
        messageMap.put("offline_file", ReceiveOfflineFilesNoticeEvent.class);
    }
}
