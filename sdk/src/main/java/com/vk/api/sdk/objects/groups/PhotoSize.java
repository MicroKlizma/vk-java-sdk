package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * PhotoSize object
 */
public class PhotoSize implements Validable {
    /**
     * Image height
     */
    @SerializedName("height")
    @Required
    private Integer height;

    /**
     * Image width
     */
    @SerializedName("width")
    @Required
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public PhotoSize setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public PhotoSize setWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoSize photoSize = (PhotoSize) o;
        return Objects.equals(width, photoSize.width) &&
                Objects.equals(height, photoSize.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PhotoSize{");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
