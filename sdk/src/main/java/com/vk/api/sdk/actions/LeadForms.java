package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.queries.leadforms.LeadFormsCreateQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsDeleteQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsGetLeadsQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsGetQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsGetUploadURLQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsListQuery;
import com.vk.api.sdk.queries.leadforms.LeadFormsUpdateQuery;

/**
 * List of LeadForms methods
 */
public class LeadForms extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public LeadForms(VkApiClient client) {
        super(client);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param name
     * @param title
     * @param description
     * @param questions
     * @param policyLinkUrl
     * @return query
     */
    public LeadFormsCreateQuery create(UserActor actor, int groupId, String name, String title,
            String description, String questions, String policyLinkUrl) {
        return new LeadFormsCreateQuery(getClient(), actor, groupId, name, title, description, questions, policyLinkUrl);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param formId
     * @return query
     */
    public LeadFormsDeleteQuery delete(UserActor actor, int groupId, int formId) {
        return new LeadFormsDeleteQuery(getClient(), actor, groupId, formId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param formId
     * @return query
     */
    public LeadFormsGetQuery get(UserActor actor, int groupId, int formId) {
        return new LeadFormsGetQuery(getClient(), actor, groupId, formId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param formId
     * @return query
     */
    public LeadFormsGetLeadsQuery getLeads(UserActor actor, int groupId, int formId) {
        return new LeadFormsGetLeadsQuery(getClient(), actor, groupId, formId);
    }

    /**
     * @param actor vk actor
     * @return query
     */
    public LeadFormsGetUploadURLQuery getUploadURL(UserActor actor) {
        return new LeadFormsGetUploadURLQuery(getClient(), actor);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @return query
     */
    public LeadFormsListQuery list(UserActor actor, int groupId) {
        return new LeadFormsListQuery(getClient(), actor, groupId);
    }

    /**
     * @param actor vk actor
     * @param groupId
     * @param formId
     * @param name
     * @param title
     * @param description
     * @param questions
     * @param policyLinkUrl
     * @return query
     */
    public LeadFormsUpdateQuery update(UserActor actor, int groupId, int formId, String name,
            String title, String description, String questions, String policyLinkUrl) {
        return new LeadFormsUpdateQuery(getClient(), actor, groupId, formId, name, title, description, questions, policyLinkUrl);
    }
}
