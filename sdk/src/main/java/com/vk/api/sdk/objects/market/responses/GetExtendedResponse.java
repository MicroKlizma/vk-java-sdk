package com.vk.api.sdk.objects.market.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.market.MarketItemFull;
import java.util.List;
import java.util.Objects;

/**
 * GetExtendedResponse object
 */
public class GetExtendedResponse implements Validable {
    /**
     * Total number
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<MarketItemFull> items;

    @SerializedName("variants")
    private List<MarketItemFull> variants;

    public Integer getCount() {
        return count;
    }

    public GetExtendedResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<MarketItemFull> getItems() {
        return items;
    }

    public GetExtendedResponse setItems(List<MarketItemFull> items) {
        this.items = items;
        return this;
    }

    public List<MarketItemFull> getVariants() {
        return variants;
    }

    public GetExtendedResponse setVariants(List<MarketItemFull> variants) {
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
        GetExtendedResponse getExtendedResponse = (GetExtendedResponse) o;
        return Objects.equals(count, getExtendedResponse.count) &&
                Objects.equals(variants, getExtendedResponse.variants) &&
                Objects.equals(items, getExtendedResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetExtendedResponse{");
        sb.append("count=").append(count);
        sb.append(", variants=").append(variants);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
