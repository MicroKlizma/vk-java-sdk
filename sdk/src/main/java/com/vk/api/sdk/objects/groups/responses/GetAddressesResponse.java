package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.groups.Address;
import java.util.List;
import java.util.Objects;

/**
 * GetAddressesResponse object
 */
public class GetAddressesResponse {
    /**
     * Total count of addresses
     */
    @SerializedName("count")
    private Integer count;

    @SerializedName("items")
    private List<Address> items;

    public Integer getCount() {
        return count;
    }

    public GetAddressesResponse setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<Address> getItems() {
        return items;
    }

    public GetAddressesResponse setItems(List<Address> items) {
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
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) o;
        return Objects.equals(count, getAddressesResponse.count) &&
                Objects.equals(items, getAddressesResponse.items);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetAddressesResponse{");
        sb.append("count=").append(count);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
