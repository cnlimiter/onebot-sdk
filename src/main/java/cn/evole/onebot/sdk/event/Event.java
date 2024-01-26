package cn.evole.onebot.sdk.event;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * 事件上报
 *
 * @author cnlimiter
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Event {

    @SerializedName("post_type")
    private String postType;

    @SerializedName( "time")
    private long time;

    @SerializedName( "self_id")
    private long selfId;

}
