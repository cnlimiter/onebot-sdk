package cn.evole.onebot.sdk.response.misc;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2024/1/17 19:35
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImgInfoResp {
    @SerializedName("file") String file;
    @SerializedName("filename") String fileName;
    @SerializedName("md5") String md5;
    @SerializedName("size") int size;
    @SerializedName("url") String url;
    @SerializedName("add_time") long addTime;
    @SerializedName("file_type") String fileType;
}
