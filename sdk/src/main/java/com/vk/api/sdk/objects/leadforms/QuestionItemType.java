package com.vk.api.sdk.objects.leadforms;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum QuestionItemType implements EnumParam {
    @SerializedName("input")
    INPUT("input"),

    @SerializedName("textarea")
    TEXTAREA("textarea"),

    @SerializedName("radio")
    RADIO("radio"),

    @SerializedName("checkbox")
    CHECKBOX("checkbox"),

    @SerializedName("select")
    SELECT("select");

    private final String value;

    QuestionItemType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
