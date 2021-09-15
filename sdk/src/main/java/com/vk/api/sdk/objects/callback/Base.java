package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Base object
 */
public class Base implements Validable {
    @SerializedName("type")
    @Required
    private Type type;

    @SerializedName("group_id")
    private Integer groupId;

    /**
     * Unique event id. If it passed twice or more - you should ignore it.
     */
    @SerializedName("event_id")
    private String eventId;

    @SerializedName("secret")
    private String secret;

    public Type getType() {
        return type;
    }

    public Base setType(Type type) {
        this.type = type;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Base setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getEventId() {
        return eventId;
    }

    public Base setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public Base setSecret(String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, groupId, secret, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Base base = (Base) o;
        return Objects.equals(eventId, base.eventId) &&
                Objects.equals(groupId, base.groupId) &&
                Objects.equals(secret, base.secret) &&
                Objects.equals(type, base.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Base{");
        sb.append("eventId='").append(eventId).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", secret='").append(secret).append("'");
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
