package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import com.vk.api.sdk.objects.groups.ToggleMarketState;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.toggleMarket method
 */
public class GroupsToggleMarketQuery extends AbstractQueryBuilder<GroupsToggleMarketQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1.
     * @param state value of "state" parameter.
     */
    public GroupsToggleMarketQuery(VkApiClient client, UserActor actor, int groupId,
            ToggleMarketState state) {
        super(client, "groups.toggleMarket", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        state(state);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsToggleMarketQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set state
     *
     * @param value value of "state" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsToggleMarketQuery state(ToggleMarketState value) {
        return unsafeParam("state", value);
    }

    /**
     * Set ref
     *
     * @param value value of "ref" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsToggleMarketQuery ref(String value) {
        return unsafeParam("ref", value);
    }

    @Override
    protected GroupsToggleMarketQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("state", "group_id", "access_token");
    }
}
