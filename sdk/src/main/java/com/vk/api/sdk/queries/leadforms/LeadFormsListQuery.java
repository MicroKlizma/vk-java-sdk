package com.vk.api.sdk.queries.leadforms;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.leadforms.responses.ListResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for LeadForms.list method
 */
public class LeadFormsListQuery extends AbstractQueryBuilder<LeadFormsListQuery, List<ListResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter.
     */
    public LeadFormsListQuery(VkApiClient client, UserActor actor, int groupId) {
        super(client, "leadForms.list", Utils.buildParametrizedType(List.class, ListResponse.class));
        accessToken(actor.getAccessToken());
        groupId(groupId);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected LeadFormsListQuery groupId(int value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected LeadFormsListQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "access_token");
    }
}
