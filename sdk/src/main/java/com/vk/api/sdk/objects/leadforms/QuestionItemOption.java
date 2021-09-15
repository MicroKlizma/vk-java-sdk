package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * QuestionItemOption object
 */
public class QuestionItemOption implements Validable {
    @SerializedName("key")
    private String key;

    @SerializedName("label")
    @Required
    private String label;

    public String getKey() {
        return key;
    }

    public QuestionItemOption setKey(String key) {
        this.key = key;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public QuestionItemOption setLabel(String label) {
        this.label = label;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionItemOption questionItemOption = (QuestionItemOption) o;
        return Objects.equals(label, questionItemOption.label) &&
                Objects.equals(key, questionItemOption.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("QuestionItemOption{");
        sb.append("label='").append(label).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
