package com.cct.qslibcore.enums;

/**
 * 响应状态码
 */
public enum DimensionTypeEnum {

    TMLX("TMLX", "题目类型", "8e8272c38486467c8c341dca42255b3f"),
    XTJGS("XTJGS", "系统架构师", "416f00adf53f4743bc856416215df756"),
    ZSDFL("ZSDFL", "知识点分类", "9e3b255939824e239ef9cb2fdd2ee579"),
    DXT("DXT", "单选题", "8703a3f1e9da4de5a82e4d4716190dbe"),
    ALT("ALT", "案例题", "4ebe0757fe8b44a58715576df5aaf7bb");

    private final String code;

    private final String name;

    private final String id;

    DimensionTypeEnum(String code, String name, String id) {
        this.code = code;
        this.name = name;
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
