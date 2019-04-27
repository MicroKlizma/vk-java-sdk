package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LongPollServer object
 */
public class LongPollServer {
    /**
     * Long Poll key
     */
    @SerializedName("key")
    private String key;

    /**
     * Long Poll server address
     */
    @SerializedName("server")
    private String server;

    /**
     * Number of the last event
     */
    @SerializedName("ts")
    private Integer ts;

    public String getKey() {
        return key;
    }

    public LongPollServer setKey(String key) {
        this.key = key;
        return this;
    }

    public String getServer() {
        return server;
    }

    public LongPollServer setServer(String server) {
        this.server = server;
        return this;
    }

    public Integer getTs() {
        return ts;
    }

    public LongPollServer setTs(Integer ts) {
        this.ts = ts;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(server, key, ts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LongPollServer longPollServer = (LongPollServer) o;
        return Objects.equals(server, longPollServer.server) &&
                Objects.equals(key, longPollServer.key) &&
                Objects.equals(ts, longPollServer.ts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("LongPollServer{");
        sb.append("server='").append(server).append("'");
        sb.append(", key='").append(key).append("'");
        sb.append(", ts=").append(ts);
        sb.append('}');
        return sb.toString();
    }
}
