package com.vk.api.sdk.queries.leadforms;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/**
 * Query for LeadForms.getUploadURL method
 */
public class LeadFormsGetUploadURLQuery extends AbstractQueryBuilder<LeadFormsGetUploadURLQuery, URI> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public LeadFormsGetUploadURLQuery(VkApiClient client, UserActor actor) {
        super(client, "leadForms.getUploadURL", URI.class);
        accessToken(actor.getAccessToken());
    }

    @Override
    protected LeadFormsGetUploadURLQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
