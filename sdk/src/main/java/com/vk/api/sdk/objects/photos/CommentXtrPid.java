package com.vk.api.sdk.objects.photos;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.wall.CommentAttachment;
import java.util.List;
import java.util.Objects;

/**
 * CommentXtrPid object
 */
public class CommentXtrPid {
    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    /**
     * Comment ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Photo ID
     */
    @SerializedName("pid")
    private Integer pid;

    /**
     * Replied comment ID
     */
    @SerializedName("reply_to_comment")
    private Integer replyToComment;

    /**
     * Replied user ID
     */
    @SerializedName("reply_to_user")
    private Integer replyToUser;

    /**
     * Comment text
     */
    @SerializedName("text")
    private String text;

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public CommentXtrPid setAttachments(List<CommentAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public CommentXtrPid setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public CommentXtrPid setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CommentXtrPid setId(Integer id) {
        this.id = id;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public CommentXtrPid setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getPid() {
        return pid;
    }

    public CommentXtrPid setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public Integer getReplyToComment() {
        return replyToComment;
    }

    public CommentXtrPid setReplyToComment(Integer replyToComment) {
        this.replyToComment = replyToComment;
        return this;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public CommentXtrPid setReplyToUser(Integer replyToUser) {
        this.replyToUser = replyToUser;
        return this;
    }

    public String getText() {
        return text;
    }

    public CommentXtrPid setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, pid, id, text, fromId, replyToComment, replyToUser, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentXtrPid commentXtrPid = (CommentXtrPid) o;
        return Objects.equals(date, commentXtrPid.date) &&
                Objects.equals(attachments, commentXtrPid.attachments) &&
                Objects.equals(fromId, commentXtrPid.fromId) &&
                Objects.equals(replyToComment, commentXtrPid.replyToComment) &&
                Objects.equals(replyToUser, commentXtrPid.replyToUser) &&
                Objects.equals(pid, commentXtrPid.pid) &&
                Objects.equals(id, commentXtrPid.id) &&
                Objects.equals(text, commentXtrPid.text) &&
                Objects.equals(likes, commentXtrPid.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CommentXtrPid{");
        sb.append("date=").append(date);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", pid=").append(pid);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
