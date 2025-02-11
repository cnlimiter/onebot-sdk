package cn.evole.onebot.sdk.response.misc;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2025/2/9 01:44
 * @Description:
 */
@Data
public class VersionInfoResp {

    @SerializedName("app_name")
    private String appName;

    @SerializedName("app_version")
    private String appVersion;

    @SerializedName("protocol_version")
    private String protocolVersion;

    @SerializedName("version")
    private String version;
}
