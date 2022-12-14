package cn.evolvefield.onebot.sdk.util;

import cn.evolvefield.onebot.sdk.connection.ModWebSocketClient;
import com.google.gson.JsonObject;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/9/14 15:06
 * Version: 1.0
 */
public class ActionSendUtils extends Thread {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ActionSendUtils.class);

    private final ModWebSocketClient channel;

    private final long requestTimeout;

    private JsonObject resp;

    /**
     * @param channel        {@link ModWebSocketClient}
     * @param requestTimeout Request Timeout
     */
    public ActionSendUtils(ModWebSocketClient channel, Long requestTimeout) {
        this.channel = channel;
        this.requestTimeout = requestTimeout;
    }

    /**
     * @param req Request json data
     * @return Response json data
     * @throws IOException          exception
     * @throws InterruptedException exception
     */
    public JsonObject send(JsonObject req) throws IOException, InterruptedException {
        synchronized (channel) {
            log.debug(String.format("[Action] %s", req.toString()));
            channel.send(req.toString());
        }
        synchronized (this) {
            this.wait(requestTimeout);
        }
        return resp;
    }

    /**
     * @param resp Response json data
     */
    public void onCallback(JsonObject resp) {
        this.resp = resp;
        synchronized (this) {
            this.notify();
        }
    }
}
