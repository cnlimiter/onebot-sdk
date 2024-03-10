package cn.evole.onebot.sdk.util;

/**
 * @Project: onebot-sdk
 * @Author: cnlimiter
 * @CreateTime: 2024/2/2 12:42
 * @Description:
 */

public class StringUtils {
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isAnyEmpty(final CharSequence... css) {
        if (css == null) {
            return false;
        }
        for (final CharSequence cs : css) {
            if (isEmpty(cs)) {
                return true;
            }
        }
        return false;
    }

    public static String abbreviateMiddle(final String str, final String middle, final int length) {
        if (isAnyEmpty(str, middle) || length >= str.length() || length < middle.length()+2) {
            return str;
        }

        final int targetSting = length-middle.length();
        final int startOffset = targetSting/2+targetSting%2;
        final int endOffset = str.length()-targetSting/2;

        return str.substring(0, startOffset) +
                middle +
                str.substring(endOffset);
    }


}
