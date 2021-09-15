package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Message;
import java.util.Objects;

/**
 * MessageEdit object
 */
public class MessageEdit extends Base implements Validable {
    @SerializedName("type")
    private Type type;

    @SerializedName("object")
    @Required
    private Message object;

    public Type getType() {
        return type;
    }

    public MessageEdit setType(Type type) {
        this.type = type;
        return this;
    }

    public Message getObject() {
        return object;
    }

    public MessageEdit setObject(Message object) {
        this.object = object;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, object);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageEdit messageEdit = (MessageEdit) o;
        return Objects.equals(type, messageEdit.type) &&
                Objects.equals(object, messageEdit.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageEdit{");
        sb.append("type=").append(type);
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
