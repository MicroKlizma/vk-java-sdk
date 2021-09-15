package com.vk.api.sdk.objects.account;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

public enum GetCountersFilter implements EnumParam {
    @SerializedName("friends")
    FRIENDS("friends"),

    @SerializedName("messages")
    MESSAGES("messages"),

    @SerializedName("photos")
    PHOTOS("photos"),

    @SerializedName("notes")
    NOTES("notes"),

    @SerializedName("gifts")
    GIFTS("gifts"),

    @SerializedName("events")
    EVENTS("events"),

    @SerializedName("groups")
    GROUPS("groups"),

    @SerializedName("sdk")
    SDK("sdk"),

    @SerializedName("friends_suggestions")
    FRIENDS_SUGGESTIONS("friends_suggestions"),

    @SerializedName("notifications")
    NOTIFICATIONS("notifications"),

    @SerializedName("app_requests")
    APP_REQUESTS("app_requests"),

    @SerializedName("friends_recommendations")
    FRIENDS_RECOMMENDATIONS("friends_recommendations");

    private final String value;

    GetCountersFilter(String value) {
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
