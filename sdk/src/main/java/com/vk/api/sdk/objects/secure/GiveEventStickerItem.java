package com.vk.api.sdk.objects.secure;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * GiveEventStickerItem object
 */
public class GiveEventStickerItem implements Validable {
    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("status")
    private String status;

    public Integer getUserId() {
        return userId;
    }

    public GiveEventStickerItem setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GiveEventStickerItem setStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GiveEventStickerItem giveEventStickerItem = (GiveEventStickerItem) o;
        return Objects.equals(userId, giveEventStickerItem.userId) &&
                Objects.equals(status, giveEventStickerItem.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GiveEventStickerItem{");
        sb.append("userId=").append(userId);
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
