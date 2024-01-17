package cn.evole.onebot.sdk.response.misc;

import cn.evole.onebot.sdk.action.ActionData;
import cn.evole.onebot.sdk.entity.MsgId;
import com.google.gson.annotations.Expose;
import lombok.Data;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2024/1/17 13:56
 * @Description:
 */

public class MiraiResp {
    public abstract static class Base extends ActionData<String> {
        public Base(){
            this.setData(null);
        }
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/4 2:33
     * Version: 1.0
     */
    public static class InvalidFailure extends Base {
        public InvalidFailure(){
            this.setStatus("failed");
            this.setRetCode(100);
            this.setData("参数错误");
        }
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/9 23:26
     * Version: 1.0
     */
    public static class MiraiFailure extends Base {
        public MiraiFailure(){
            this.setStatus("failed");
            this.setRetCode(102);
        }
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/9 23:26
     * Version: 1.0
     */
    public static class PluginFailure extends Base {
        public PluginFailure(){
            this.setStatus("failed");
            this.setRetCode(103);
        }
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/10 15:02
     * Version: 1.0
     */
    public static class Success extends Base{
        public Success(){
            this.setStatus("ok");
            this.setRetCode(0);
        }
    }


    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/10 0:04
     * Version: 1.0
     */
    public static class MessageSuccess extends ActionData<MsgId> {
        public MessageSuccess(int messageId){
            this.setStatus("ok");
            this.setRetCode(0);
            this.setData(new MsgId(messageId));
        }
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/12 14:04
     * Version: 1.0
     */
    @Data
    public static class PluginsGood {
       @Expose boolean websocket  = true;
       @Expose boolean eventDataPatcher  = true;

    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/11 19:58
     * Version: 1.0
     */
    @Data
    public static class PluginStatus {
        @Expose boolean app_initialized =  true;
        @Expose boolean app_enabled =  true;
        @Expose PluginsGood plugins_good = new PluginsGood();
        @Expose boolean app_good =  true;
        @Expose boolean online =  true;
        @Expose boolean good = true;
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/12 13:59
     * Version: 1.0
     */
    @Data
    public static class VersionInfo {

        @Expose String coolq_directory = "";
        @Expose String coolq_edition = "pro";
        @Expose String plugin_version = "0.2.0";
        @Expose int plugin_build_number = 99;
        @Expose String plugin_build_configuration = "release";
        @Expose String app_ = "onebot-sdk";
        @Expose String protocol_version = "v11";
    }

    /**
     * Description:
     * Author: cnlimiter
     * Date: 2022/10/9 23:22
     * Version: 1.0
     */
    public static class AsyncStarted extends ActionData<String> {
        public AsyncStarted(){
            this.setRetCode(1);
            this.setStatus("async");
            this.setData(null);
        }
    }
}
