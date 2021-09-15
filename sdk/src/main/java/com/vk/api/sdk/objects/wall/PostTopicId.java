package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Topic ID. Allowed values can be obtained from newsfeed.getPostTopics method
 */
public enum PostTopicId implements EnumParam {
    @SerializedName("0")
    EMPTY_TOPIC(0),

    @SerializedName("1")
    ART(1),

    @SerializedName("7")
    IT(7),

    @SerializedName("12")
    GAMES(12),

    @SerializedName("16")
    MUSIC(16),

    @SerializedName("19")
    PHOTO(19),

    @SerializedName("21")
    SCIENCE_AND_TECH(21),

    @SerializedName("23")
    SPORT(23),

    @SerializedName("25")
    TRAVEL(25),

    @SerializedName("26")
    TV_AND_CINEMA(26),

    @SerializedName("32")
    HUMOR(32),

    @SerializedName("43")
    FASHION(43);

    private final Integer value;

    PostTopicId(Integer value) {
        this.value = value;
    }

    public String getValue() {
        return value.toString();
    }

    @Override
    public String toString() {
        return value.toString().toLowerCase();
    }
}
