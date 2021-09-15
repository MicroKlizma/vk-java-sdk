package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * MessageAllow object
 */
public class MessageAllow extends Base implements Validable {
    @SerializedName("type")
    private Type type;

    @SerializedName("object")
    @Required
    private MessageAllowObject object;

    public Type getType() {
        return type;
    }

    public MessageAllow setType(Type type) {
        this.type = type;
        return this;
    }

    public MessageAllowObject getObject() {
        return object;
    }

    public MessageAllow setObject(MessageAllowObject object) {
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
        MessageAllow messageAllow = (MessageAllow) o;
        return Objects.equals(type, messageAllow.type) &&
                Objects.equals(object, messageAllow.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageAllow{");
        sb.append("type=").append(type);
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
