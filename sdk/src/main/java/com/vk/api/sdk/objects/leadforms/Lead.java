package com.vk.api.sdk.objects.leadforms;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * Lead object
 */
public class Lead implements Validable {
    @SerializedName("lead_id")
    private Integer leadId;

    @SerializedName("user_id")
    private Integer userId;

    @SerializedName("date")
    @Required
    private Integer date;

    @SerializedName("answers")
    @Required
    private List<Answer> answers;

    @SerializedName("ad_id")
    private Integer adId;

    public Integer getLeadId() {
        return leadId;
    }

    public Lead setLeadId(Integer leadId) {
        this.leadId = leadId;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public Lead setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Lead setDate(Integer date) {
        this.date = date;
        return this;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Lead setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public Integer getAdId() {
        return adId;
    }

    public Lead setAdId(Integer adId) {
        this.adId = adId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, adId, answers, userId, leadId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return Objects.equals(date, lead.date) &&
                Objects.equals(adId, lead.adId) &&
                Objects.equals(userId, lead.userId) &&
                Objects.equals(answers, lead.answers) &&
                Objects.equals(leadId, lead.leadId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Lead{");
        sb.append("date=").append(date);
        sb.append(", adId=").append(adId);
        sb.append(", userId=").append(userId);
        sb.append(", answers=").append(answers);
        sb.append(", leadId=").append(leadId);
        sb.append('}');
        return sb.toString();
    }
}
