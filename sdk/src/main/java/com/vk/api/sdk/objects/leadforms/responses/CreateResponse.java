package com.vk.api.sdk.objects.leadforms.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.Objects;

/**
 * CreateResponse object
 */
public class CreateResponse implements Validable {
    @SerializedName("form_id")
    private Integer formId;

    @SerializedName("url")
    @Required
    private URI url;

    public Integer getFormId() {
        return formId;
    }

    public CreateResponse setFormId(Integer formId) {
        this.formId = formId;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public CreateResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateResponse createResponse = (CreateResponse) o;
        return Objects.equals(formId, createResponse.formId) &&
                Objects.equals(url, createResponse.url);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CreateResponse{");
        sb.append("formId=").append(formId);
        sb.append(", url=").append(url);
        sb.append('}');
        return sb.toString();
    }
}
