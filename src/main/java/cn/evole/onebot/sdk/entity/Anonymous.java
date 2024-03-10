package cn.evole.onebot.sdk.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Anonymous {

    /**
     * 匿名用户 ID
     * */
    @SerializedName( "id")
    private long id;

    /**
     * 匿名用户名称
     * */
    @SerializedName( "name")
    private String name;

    /**
     * 匿名用户 flag, 在调用禁言 API 时需要传入
     * */
    @SerializedName( "flag")
    private String flag;

}
