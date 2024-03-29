package cn.evole.onebot.sdk.event.notice.group;

import cn.evole.onebot.sdk.event.notice.NoticeEvent;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Created on 2022/7/8.
 *
 * @author cnlimiter
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GroupTitleChangeNoticeEvent extends NoticeEvent {

    @SerializedName("title_new")
    private String titleNew;

    @SerializedName("group_id")
    private long groupId;

    @SerializedName("title_old")
    private String titleOld;


}
