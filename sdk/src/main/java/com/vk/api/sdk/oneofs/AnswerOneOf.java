package com.vk.api.sdk.oneofs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.leadforms.AnswerItem;

public class AnswerOneOf {
    private JsonObject data;

    private Gson gson;

    public AnswerOneOf(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public AnswerItem getOneOf0() {
        return gson.fromJson(data.toString(), AnswerItem.class);
    }
}
