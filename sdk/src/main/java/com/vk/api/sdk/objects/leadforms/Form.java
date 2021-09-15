package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * Form object
 */
public class Form implements Validable {
    @SerializedName("form_id")
    private Integer formId;

    @SerializedName("group_id")
    private Integer groupId;

    @SerializedName("photo")
    private String photo;

    @SerializedName("name")
    private String name;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("confirmation")
    private String confirmation;

    @SerializedName("site_link_url")
    private URI siteLinkUrl;

    @SerializedName("policy_link_url")
    private URI policyLinkUrl;

    @SerializedName("questions")
    private List<QuestionItem> questions;

    @SerializedName("active")
    private BoolInt active;

    @SerializedName("leads_count")
    private Integer leadsCount;

    @SerializedName("pixel_code")
    private String pixelCode;

    @SerializedName("once_per_user")
    private Integer oncePerUser;

    @SerializedName("notify_admins")
    private String notifyAdmins;

    @SerializedName("notify_emails")
    private String notifyEmails;

    @SerializedName("url")
    @Required
    private URI url;

    public Integer getFormId() {
        return formId;
    }

    public Form setFormId(Integer formId) {
        this.formId = formId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Form setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Form setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getName() {
        return name;
    }

    public Form setName(String name) {
        this.name = name;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Form setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Form setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public Form setConfirmation(String confirmation) {
        this.confirmation = confirmation;
        return this;
    }

    public URI getSiteLinkUrl() {
        return siteLinkUrl;
    }

    public Form setSiteLinkUrl(URI siteLinkUrl) {
        this.siteLinkUrl = siteLinkUrl;
        return this;
    }

    public URI getPolicyLinkUrl() {
        return policyLinkUrl;
    }

    public Form setPolicyLinkUrl(URI policyLinkUrl) {
        this.policyLinkUrl = policyLinkUrl;
        return this;
    }

    public List<QuestionItem> getQuestions() {
        return questions;
    }

    public Form setQuestions(List<QuestionItem> questions) {
        this.questions = questions;
        return this;
    }

    public boolean isActive() {
        return active == BoolInt.YES;
    }

    public BoolInt getActive() {
        return active;
    }

    public Integer getLeadsCount() {
        return leadsCount;
    }

    public Form setLeadsCount(Integer leadsCount) {
        this.leadsCount = leadsCount;
        return this;
    }

    public String getPixelCode() {
        return pixelCode;
    }

    public Form setPixelCode(String pixelCode) {
        this.pixelCode = pixelCode;
        return this;
    }

    public Integer getOncePerUser() {
        return oncePerUser;
    }

    public Form setOncePerUser(Integer oncePerUser) {
        this.oncePerUser = oncePerUser;
        return this;
    }

    public String getNotifyAdmins() {
        return notifyAdmins;
    }

    public Form setNotifyAdmins(String notifyAdmins) {
        this.notifyAdmins = notifyAdmins;
        return this;
    }

    public String getNotifyEmails() {
        return notifyEmails;
    }

    public Form setNotifyEmails(String notifyEmails) {
        this.notifyEmails = notifyEmails;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public Form setUrl(URI url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(formId, leadsCount, oncePerUser, groupId, questions, photo, description, active, confirmation, title, notifyAdmins, notifyEmails, url, pixelCode, siteLinkUrl, name, policyLinkUrl);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Form form = (Form) o;
        return Objects.equals(formId, form.formId) &&
                Objects.equals(questions, form.questions) &&
                Objects.equals(photo, form.photo) &&
                Objects.equals(description, form.description) &&
                Objects.equals(siteLinkUrl, form.siteLinkUrl) &&
                Objects.equals(active, form.active) &&
                Objects.equals(notifyAdmins, form.notifyAdmins) &&
                Objects.equals(confirmation, form.confirmation) &&
                Objects.equals(title, form.title) &&
                Objects.equals(pixelCode, form.pixelCode) &&
                Objects.equals(oncePerUser, form.oncePerUser) &&
                Objects.equals(url, form.url) &&
                Objects.equals(leadsCount, form.leadsCount) &&
                Objects.equals(notifyEmails, form.notifyEmails) &&
                Objects.equals(groupId, form.groupId) &&
                Objects.equals(name, form.name) &&
                Objects.equals(policyLinkUrl, form.policyLinkUrl);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Form{");
        sb.append("formId=").append(formId);
        sb.append(", questions=").append(questions);
        sb.append(", photo='").append(photo).append("'");
        sb.append(", description='").append(description).append("'");
        sb.append(", siteLinkUrl=").append(siteLinkUrl);
        sb.append(", active=").append(active);
        sb.append(", notifyAdmins='").append(notifyAdmins).append("'");
        sb.append(", confirmation='").append(confirmation).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", pixelCode='").append(pixelCode).append("'");
        sb.append(", oncePerUser=").append(oncePerUser);
        sb.append(", url=").append(url);
        sb.append(", leadsCount=").append(leadsCount);
        sb.append(", notifyEmails='").append(notifyEmails).append("'");
        sb.append(", groupId=").append(groupId);
        sb.append(", name='").append(name).append("'");
        sb.append(", policyLinkUrl=").append(policyLinkUrl);
        sb.append('}');
        return sb.toString();
    }
}
