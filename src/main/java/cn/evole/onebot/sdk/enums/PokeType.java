package cn.evole.onebot.sdk.enums;

import lombok.Getter;

import java.util.Arrays;

/**
 * 戳一戳种类
 * @see "https://github.com/IUnlimit/perpetua-sdk-for-java/blob/main/src/main/java/com/illtamer/perpetua/sdk/entity/enumerate/PokeType.java"
 */
public enum PokeType {

    UNKNOWN("未知", -1, -1),

    Poke("戳一戳", 1, -1),

    ShowLove("比心", 2, -1),

    Like("点赞", 3, -1),

    Heartbroken("心碎", 4, -1),

    SixSixSix("666", 5, -1),

    FangDaZhao("放大招", 6, -1),

    // SVIP
    BaoBeiQiu("宝贝球", 126, 2011),

    // SVIP
    Rose("玫瑰花", 126, 2007),

    // SVIP
    ZhaoHuanShu("召唤术", 126, 2006),

    // SVIP
    RangNiPi("让你皮", 126, 2009),

    // SVIP
    JieYin("结印", 126, 2005),

    // SVIP
    ShouLei("手雷", 126, 2004),

    GouYin("勾引", 126, 2003),

    // SVIP
    ZhuaYiXia("抓一下", 126, 2001),

    // SVIP
    SuiPing("碎屏", 126, 2002),

    // SVIP
    QiaoMen("敲门", 126, 2002);

    @Getter
    private final String name;

    @Getter
    private final Integer type;

    @Getter
    private final Integer id;

    PokeType(String name, Integer type, Integer id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public static PokeType getPokeType(int type, int id) {
        if (type < 0 && id < 0) return UNKNOWN;
        return Arrays.stream(PokeType.values())
                .filter(poke -> poke.type == type)
                .filter(poke -> poke.id == id)
                .findFirst()
                .orElse(UNKNOWN);
    }

}
