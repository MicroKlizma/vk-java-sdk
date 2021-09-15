package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.oneofs.AnswerOneOf;
import java.util.Objects;

/**
 * Answer object
 */
public class Answer implements Validable {
    @SerializedName("key")
    @Required
    private String key;

    @SerializedName("answer")
    @Required
    private JsonObject answer;

    public String getKey() {
        return key;
    }

    public Answer setKey(String key) {
        this.key = key;
        return this;
    }

    public AnswerOneOf getAnswer() {
        return new AnswerOneOf(answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer = (Answer) o;
        return Objects.equals(answer, answer.answer) &&
                Objects.equals(key, answer.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Answer{");
        sb.append("answer=").append(answer);
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
