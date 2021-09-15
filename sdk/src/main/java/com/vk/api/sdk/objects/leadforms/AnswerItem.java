package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * AnswerItem object
 */
public class AnswerItem implements Validable {
    @SerializedName("key")
    private String key;

    @SerializedName("value")
    @Required
    private String value;

    public String getKey() {
        return key;
    }

    public AnswerItem setKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public AnswerItem setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnswerItem answerItem = (AnswerItem) o;
        return Objects.equals(value, answerItem.value) &&
                Objects.equals(key, answerItem.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AnswerItem{");
        sb.append("value='").append(value).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
