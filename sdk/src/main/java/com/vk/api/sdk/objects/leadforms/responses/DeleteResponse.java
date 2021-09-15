package com.vk.api.sdk.objects.leadforms.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * DeleteResponse object
 */
public class DeleteResponse implements Validable {
    @SerializedName("form_id")
    private Integer formId;

    public Integer getFormId() {
        return formId;
    }

    public DeleteResponse setFormId(Integer formId) {
        this.formId = formId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResponse deleteResponse = (DeleteResponse) o;
        return Objects.equals(formId, deleteResponse.formId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("DeleteResponse{");
        sb.append("formId=").append(formId);
        sb.append('}');
        return sb.toString();
    }
}
