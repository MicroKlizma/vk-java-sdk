package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * QuestionItem object
 */
public class QuestionItem implements Validable {
    @SerializedName("key")
    @Required
    private String key;

    @SerializedName("type")
    @Required
    private QuestionItemType type;

    @SerializedName("label")
    private String label;

    /**
     * Опции выбора для типов radio, checkbox, select
     */
    @SerializedName("options")
    private List<QuestionItemOption> options;

    public String getKey() {
        return key;
    }

    public QuestionItem setKey(String key) {
        this.key = key;
        return this;
    }

    public QuestionItemType getType() {
        return type;
    }

    public QuestionItem setType(QuestionItemType type) {
        this.type = type;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public QuestionItem setLabel(String label) {
        this.label = label;
        return this;
    }

    public List<QuestionItemOption> getOptions() {
        return options;
    }

    public QuestionItem setOptions(List<QuestionItemOption> options) {
        this.options = options;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(options, label, type, key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionItem questionItem = (QuestionItem) o;
        return Objects.equals(options, questionItem.options) &&
                Objects.equals(label, questionItem.label) &&
                Objects.equals(type, questionItem.type) &&
                Objects.equals(key, questionItem.key);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("QuestionItem{");
        sb.append("options=").append(options);
        sb.append(", label='").append(label).append("'");
        sb.append(", type='").append(type).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append('}');
        return sb.toString();
    }
}
