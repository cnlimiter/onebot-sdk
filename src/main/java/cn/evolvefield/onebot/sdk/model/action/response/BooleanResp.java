package cn.evolvefield.onebot.sdk.model.action.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Created on 2022/7/8.
 *
 * @author cnlimiter
 */
@Data
public class BooleanResp {

    @SerializedName( "yes")
    private boolean yes;

}
