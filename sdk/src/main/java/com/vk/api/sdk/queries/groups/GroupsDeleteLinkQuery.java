package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.deleteLink method
 */
public class GroupsDeleteLinkQuery extends AbstractQueryBuilder<GroupsDeleteLinkQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1.
     * @param linkId value of "link id" parameter. Minimum is 0.
     */
    public GroupsDeleteLinkQuery(VkApiClient client, UserActor actor, int groupId, int linkId) {
        super(client, "groups.deleteLink", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        linkId(linkId);
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsDeleteLinkQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Link ID.
     *
     * @param value value of "link id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsDeleteLinkQuery linkId(int value) {
        return unsafeParam("link_id", value);
    }

    @Override
    protected GroupsDeleteLinkQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "link_id", "access_token");
    }
}
