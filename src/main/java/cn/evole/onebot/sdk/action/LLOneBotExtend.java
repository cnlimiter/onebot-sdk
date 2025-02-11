package cn.evole.onebot.sdk.action;

import cn.evole.onebot.sdk.action.misc.ActionData;
import cn.evole.onebot.sdk.response.group.GroupFilesResp;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2025/2/9 01:45
 * @Description:
 */
public interface LLOneBotExtend {

    /**
     * 获取群文件资源链接
     *
     * @param groupId 群号
     * @param fileId  文件ID
     * @param busId   文件类型
     * @return result {@link ActionData} of {@link GroupFilesResp}
     */
    ActionData<GroupFilesResp> getFile(long groupId, String fileId, int busId);

}
