package cn.evolvefield.onebot.sdk.listener;

import cn.evolvefield.onebot.sdk.handler.Handler;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/9/14 16:14
 * Version: 1.0
 */
public abstract class DefaultHandlerListener<T> extends SimpleListener<T> {
    protected Map<String, Handler<T>> handlerMap = new HashMap<>();

    public Map<String, Handler<T>> getHandlerMap() {
        return handlerMap;
    }

    public void setHandlerMap(Map<String, Handler<T>> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public void addHandler(String key, Handler<T> handler) {
        handlerMap.put(key, handler);
    }

    public void removeHandler(String key) {
        handlerMap.remove(key);
    }

    public Handler<T> getHandler(String key) {
        return handlerMap.get(key);
    }

    public Boolean contains(String key) {
        return handlerMap.containsKey(key);
    }
}
