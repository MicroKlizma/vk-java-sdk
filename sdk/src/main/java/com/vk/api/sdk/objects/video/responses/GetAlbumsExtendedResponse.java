package com.vk.api.sdk.objects.video.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.video.VideoAlbumFull;
import java.util.List;
import java.util.Objects;

/**
 * GetAlbumsExtendedResponse object
 */
public class GetAlbumsExtendedResponse {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<VideoAlbumFull> items;

    public Integer getCount() {
        return count;
    }

    public GetAlbumsExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<VideoAlbumFull> getItems() {
        return items;
    }

    public GetAlbumsExtendedResponse setItems(List<VideoAlbumFull> items) {
        this.items = items;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAlbumsExtendedResponse getAlbumsExtendedResponse = (GetAlbumsExtendedResponse) o;
        return Objects.equals(count, getAlbumsExtendedResponse.count) &&
                Objects.equals(items, getAlbumsExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAlbumsExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
