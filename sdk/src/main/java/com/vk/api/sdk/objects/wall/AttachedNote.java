package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * AttachedNote object
 */
public class AttachedNote implements Validable {
    /**
     * Comments number
     */
    @SerializedName("comments")
    @Required
    private Integer comments;

    /**
     * Date when the note has been created in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Note ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Note owner's ID
     */
    @SerializedName("owner_id")
    private Integer ownerId;

    /**
     * Read comments number
     */
    @SerializedName("read_comments")
    private Integer readComments;

    /**
     * Note title
     */
    @SerializedName("title")
    @Required
    private String title;

    /**
     * Note text
     */
    @SerializedName("text")
    private String text;

    @SerializedName("privacy_view")
    private List<String> privacyView;

    @SerializedName("privacy_comment")
    private List<String> privacyComment;

    @SerializedName("can_comment")
    private Integer canComment;

    /**
     * Note wiki text
     */
    @SerializedName("text_wiki")
    private String textWiki;

    /**
     * URL of the page with note preview
     */
    @SerializedName("view_url")
    private URI viewUrl;

    public Integer getComments() {
        return comments;
    }

    public AttachedNote setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public AttachedNote setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public AttachedNote setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public AttachedNote setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Integer getReadComments() {
        return readComments;
    }

    public AttachedNote setReadComments(Integer readComments) {
        this.readComments = readComments;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public AttachedNote setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getText() {
        return text;
    }

    public AttachedNote setText(String text) {
        this.text = text;
        return this;
    }

    public List<String> getPrivacyView() {
        return privacyView;
    }

    public AttachedNote setPrivacyView(List<String> privacyView) {
        this.privacyView = privacyView;
        return this;
    }

    public List<String> getPrivacyComment() {
        return privacyComment;
    }

    public AttachedNote setPrivacyComment(List<String> privacyComment) {
        this.privacyComment = privacyComment;
        return this;
    }

    public Integer getCanComment() {
        return canComment;
    }

    public AttachedNote setCanComment(Integer canComment) {
        this.canComment = canComment;
        return this;
    }

    public String getTextWiki() {
        return textWiki;
    }

    public AttachedNote setTextWiki(String textWiki) {
        this.textWiki = textWiki;
        return this;
    }

    public URI getViewUrl() {
        return viewUrl;
    }

    public AttachedNote setViewUrl(URI viewUrl) {
        this.viewUrl = viewUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, privacyView, textWiki, comments, privacyComment, viewUrl, canComment, id, text, ownerId, title, readComments);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachedNote attachedNote = (AttachedNote) o;
        return Objects.equals(date, attachedNote.date) &&
                Objects.equals(canComment, attachedNote.canComment) &&
                Objects.equals(comments, attachedNote.comments) &&
                Objects.equals(ownerId, attachedNote.ownerId) &&
                Objects.equals(privacyComment, attachedNote.privacyComment) &&
                Objects.equals(readComments, attachedNote.readComments) &&
                Objects.equals(viewUrl, attachedNote.viewUrl) &&
                Objects.equals(id, attachedNote.id) &&
                Objects.equals(text, attachedNote.text) &&
                Objects.equals(textWiki, attachedNote.textWiki) &&
                Objects.equals(title, attachedNote.title) &&
                Objects.equals(privacyView, attachedNote.privacyView);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AttachedNote{");
        sb.append("date=").append(date);
        sb.append(", canComment=").append(canComment);
        sb.append(", comments=").append(comments);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", privacyComment='").append(privacyComment).append("'");
        sb.append(", readComments=").append(readComments);
        sb.append(", viewUrl=").append(viewUrl);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", textWiki='").append(textWiki).append("'");
        sb.append(", title='").append(title).append("'");
        sb.append(", privacyView='").append(privacyView).append("'");
        sb.append('}');
        return sb.toString();
    }
}
