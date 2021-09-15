package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.comment.Thread;
import java.util.List;
import java.util.Objects;

/**
 * WallComment object
 */
public class WallComment implements Validable {
    /**
     * Comment ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Author ID
     */
    @SerializedName("from_id")
    private Integer fromId;

    @SerializedName("can_edit")
    private BoolInt canEdit;

    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("owner_id")
    private Integer ownerId;

    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

    @SerializedName("photo_id")
    private Integer photoId;

    @SerializedName("video_id")
    private Integer videoId;

    /**
     * Date when the comment has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    /**
     * Comment text
     */
    @SerializedName("text")
    @Required
    private String text;

    @SerializedName("attachments")
    private List<CommentAttachment> attachments;

    @SerializedName("donut")
    private WallCommentDonut donut;

    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Real position of the comment
     */
    @SerializedName("real_offset")
    private Integer realOffset;

    /**
     * Replied user ID
     */
    @SerializedName("reply_to_user")
    private Integer replyToUser;

    /**
     * Replied comment ID
     */
    @SerializedName("reply_to_comment")
    private Integer replyToComment;

    @SerializedName("thread")
    private Thread thread;

    @SerializedName("deleted")
    private Boolean deleted;

    /**
     * Photo ID
     */
    @SerializedName("pid")
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public WallComment setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getFromId() {
        return fromId;
    }

    public WallComment setFromId(Integer fromId) {
        this.fromId = fromId;
        return this;
    }

    public boolean canEdit() {
        return canEdit == BoolInt.YES;
    }

    public BoolInt getCanEdit() {
        return canEdit;
    }

    public Integer getPostId() {
        return postId;
    }

    public WallComment setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public WallComment setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public WallComment setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public WallComment setPhotoId(Integer photoId) {
        this.photoId = photoId;
        return this;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public WallComment setVideoId(Integer videoId) {
        this.videoId = videoId;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public WallComment setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getText() {
        return text;
    }

    public WallComment setText(String text) {
        this.text = text;
        return this;
    }

    public List<CommentAttachment> getAttachments() {
        return attachments;
    }

    public WallComment setAttachments(List<CommentAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public WallCommentDonut getDonut() {
        return donut;
    }

    public WallComment setDonut(WallCommentDonut donut) {
        this.donut = donut;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public WallComment setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Integer getRealOffset() {
        return realOffset;
    }

    public WallComment setRealOffset(Integer realOffset) {
        this.realOffset = realOffset;
        return this;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public WallComment setReplyToUser(Integer replyToUser) {
        this.replyToUser = replyToUser;
        return this;
    }

    public Integer getReplyToComment() {
        return replyToComment;
    }

    public WallComment setReplyToComment(Integer replyToComment) {
        this.replyToComment = replyToComment;
        return this;
    }

    public Thread getThread() {
        return thread;
    }

    public WallComment setThread(Thread thread) {
        this.thread = thread;
        return this;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public WallComment setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Integer getPid() {
        return pid;
    }

    public WallComment setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, attachments, canEdit, photoId, pid, videoId, thread, postId, ownerId, fromId, replyToComment, parentsStack, realOffset, deleted, donut, id, text, replyToUser, likes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WallComment wallComment = (WallComment) o;
        return Objects.equals(date, wallComment.date) &&
                Objects.equals(fromId, wallComment.fromId) &&
                Objects.equals(attachments, wallComment.attachments) &&
                Objects.equals(replyToComment, wallComment.replyToComment) &&
                Objects.equals(photoId, wallComment.photoId) &&
                Objects.equals(parentsStack, wallComment.parentsStack) &&
                Objects.equals(ownerId, wallComment.ownerId) &&
                Objects.equals(canEdit, wallComment.canEdit) &&
                Objects.equals(pid, wallComment.pid) &&
                Objects.equals(thread, wallComment.thread) &&
                Objects.equals(realOffset, wallComment.realOffset) &&
                Objects.equals(deleted, wallComment.deleted) &&
                Objects.equals(postId, wallComment.postId) &&
                Objects.equals(replyToUser, wallComment.replyToUser) &&
                Objects.equals(donut, wallComment.donut) &&
                Objects.equals(id, wallComment.id) &&
                Objects.equals(text, wallComment.text) &&
                Objects.equals(videoId, wallComment.videoId) &&
                Objects.equals(likes, wallComment.likes);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("WallComment{");
        sb.append("date=").append(date);
        sb.append(", fromId=").append(fromId);
        sb.append(", attachments=").append(attachments);
        sb.append(", replyToComment=").append(replyToComment);
        sb.append(", photoId=").append(photoId);
        sb.append(", parentsStack=").append(parentsStack);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", pid=").append(pid);
        sb.append(", thread=").append(thread);
        sb.append(", realOffset=").append(realOffset);
        sb.append(", deleted=").append(deleted);
        sb.append(", postId=").append(postId);
        sb.append(", replyToUser=").append(replyToUser);
        sb.append(", donut=").append(donut);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", videoId=").append(videoId);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }
}
