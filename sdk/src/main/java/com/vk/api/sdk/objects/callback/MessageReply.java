package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.messages.Message;
import java.util.Objects;

/**
 * MessageReply object
 */
public class MessageReply extends Base implements Validable {
    @SerializedName("type")
    private Type type;

    @SerializedName("object")
    @Required
    private Message object;

    public Type getType() {
        return type;
    }

    public MessageReply setType(Type type) {
        this.type = type;
        return this;
    }

    public Message getObject() {
        return object;
    }

    public MessageReply setObject(Message object) {
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
        MessageReply messageReply = (MessageReply) o;
        return Objects.equals(type, messageReply.type) &&
                Objects.equals(object, messageReply.object);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MessageReply{");
        sb.append("type=").append(type);
        sb.append(", object=").append(object);
        sb.append('}');
        return sb.toString();
    }
}
