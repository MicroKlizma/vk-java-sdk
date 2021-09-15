package com.vk.api.sdk.oneofs;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vk.api.sdk.objects.base.StickerNew;
import com.vk.api.sdk.objects.base.StickerOld;

public class BaseStickerOneOf {
    private JsonObject data;

    private Gson gson;

    public BaseStickerOneOf(JsonObject data) {
        this.data = data;
        gson = new Gson();
    }

    public JsonObject getRaw() {
        return data;
    }

    public StickerOld getOneOf0() {
        return gson.fromJson(data.toString(), StickerOld.class);
    }

    public StickerNew getOneOf1() {
        return gson.fromJson(data.toString(), StickerNew.class);
    }
}
