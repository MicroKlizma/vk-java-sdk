package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.util.Objects;

/**
 * Confirmation object
 */
public class Confirmation extends Base implements Validable {
    @SerializedName("type")
    private Type type;

    public Type getType() {
        return type;
    }

    public Confirmation setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Confirmation confirmation = (Confirmation) o;
        return Objects.equals(type, confirmation.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Confirmation{");
        sb.append("type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
