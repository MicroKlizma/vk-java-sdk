package com.vk.api.sdk.objects.leadforms.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.leadforms.Lead;
import java.util.List;
import java.util.Objects;

/**
 * GetLeadsResponse object
 */
public class GetLeadsResponse implements Validable {
    @SerializedName("leads")
    @Required
    private List<Lead> leads;

    @SerializedName("next_page_token")
    private String nextPageToken;

    public List<Lead> getLeads() {
        return leads;
    }

    public GetLeadsResponse setLeads(List<Lead> leads) {
        this.leads = leads;
        return this;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public GetLeadsResponse setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextPageToken, leads);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetLeadsResponse getLeadsResponse = (GetLeadsResponse) o;
        return Objects.equals(nextPageToken, getLeadsResponse.nextPageToken) &&
                Objects.equals(leads, getLeadsResponse.leads);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetLeadsResponse{");
        sb.append("nextPageToken='").append(nextPageToken).append("'");
        sb.append(", leads=").append(leads);
        sb.append('}');
        return sb.toString();
    }
}
