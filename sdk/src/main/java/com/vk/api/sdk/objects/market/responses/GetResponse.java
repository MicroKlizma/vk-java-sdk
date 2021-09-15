package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.market.MarketItem;
import java.util.List;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<MarketItem> items;

    @SerializedName("variants")
    private List<MarketItem> variants;

    public Integer getCount() {
        return count;
    }

    public GetResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<MarketItem> getItems() {
        return items;
    }

    public GetResponse setItems(List<MarketItem> items) {
        this.items = items;
        return this;
    }

    public List<MarketItem> getVariants() {
        return variants;
    }

    public GetResponse setVariants(List<MarketItem> variants) {
        this.variants = variants;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, variants, items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(count, getResponse.count) &&
                Objects.equals(variants, getResponse.variants) &&
                Objects.equals(items, getResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("count=").append(count);
        sb.append(", variants=").append(variants);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
