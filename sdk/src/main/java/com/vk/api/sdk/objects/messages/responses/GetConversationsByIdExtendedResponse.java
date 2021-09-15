package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.groups.GroupFull;
import com.vk.api.sdk.objects.messages.GetConversationById;
import com.vk.api.sdk.objects.users.UserFull;
import java.util.List;
import java.util.Objects;

/**
 * GetConversationsByIdExtendedResponse object
 */
public class GetConversationsByIdExtendedResponse extends GetConversationById implements Validable {
    @SerializedName("profiles")
    private List<UserFull> profiles;

    @SerializedName("groups")
    private List<GroupFull> groups;

    public List<UserFull> getProfiles() {
        return profiles;
    }

    public GetConversationsByIdExtendedResponse setProfiles(List<UserFull> profiles) {
        this.profiles = profiles;
        return this;
    }

    public List<GroupFull> getGroups() {
        return groups;
    }

    public GetConversationsByIdExtendedResponse setGroups(List<GroupFull> groups) {
        this.groups = groups;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(profiles, groups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetConversationsByIdExtendedResponse getConversationsByIdExtendedResponse = (GetConversationsByIdExtendedResponse) o;
        return Objects.equals(profiles, getConversationsByIdExtendedResponse.profiles) &&
                Objects.equals(groups, getConversationsByIdExtendedResponse.groups);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetConversationsByIdExtendedResponse{");
        sb.append("profiles=").append(profiles);
        sb.append(", groups=").append(groups);
        sb.append('}');
        return sb.toString();
    }
}
