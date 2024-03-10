package cn.evole.onebot.sdk.entity;

import cn.evole.onebot.sdk.enums.MsgType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * Project: onebot-sdk
 * Author: cnlimiter
 * Date: 2023/2/10 1:30
 * Description:
 */
@Data
@Accessors(chain = true)
public class ArrayMsg {
    private MsgType type;

    private Map<String, String> data;
}
