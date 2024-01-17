package cn.evole.onebot.sdk.util;

import lombok.val;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;

/**
 * Description:
 * Author: cnlimiter
 * Date: 2022/10/2 22:31
 * Version: 1.0
 */
public class DataBaseUtils {

    public static int toMessageId(int[] from, long botId, long contactId){
        val crc = new CRC32();
        StringBuilder fromValue = new StringBuilder();
        for (val i : from){
            fromValue.append("-").append(i);
        }
        String messageId = botId + contactId + fromValue.toString();
        crc.update(messageId.getBytes(StandardCharsets.UTF_8));
        return (int) crc.getValue();
    }

    public static byte[] toByteArray(int value) {
        return ByteBuffer.allocate(4).putInt(value).array();
    }

}
