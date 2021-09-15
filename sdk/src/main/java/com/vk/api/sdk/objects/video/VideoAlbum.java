package com.vk.api.sdk.objects.video;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * VideoAlbum object
 */
public class VideoAlbum implements Validable {
    /**
     * Album ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Album owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Album title
     */
    @SerializedName("title")
    @Required
    private String title;

    public Integer getId() {
        return id;
    }

    public VideoAlbum setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public VideoAlbum setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public VideoAlbum setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerId, title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoAlbum videoAlbum = (VideoAlbum) o;
        return Objects.equals(ownerId, videoAlbum.ownerId) &&
                Objects.equals(id, videoAlbum.id) &&
                Objects.equals(title, videoAlbum.title);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("VideoAlbum{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", id=").append(id);
        sb.append(", title='").append(title).append("'");
        sb.append('}');
        return sb.toString();
    }
}
