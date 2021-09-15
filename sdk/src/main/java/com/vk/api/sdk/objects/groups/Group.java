package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.video.LiveInfo;
import java.net.URI;
import java.util.Objects;

/**
 * Group object
 */
public class Group implements Validable {
    /**
     * Community ID
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Community name
     */
    @SerializedName("name")
    @Required
    private String name;

    /**
     * Domain of the community page
     */
    @SerializedName("screen_name")
    private String screenName;

    @SerializedName("is_closed")
    private GroupIsClosed isClosed;

    @SerializedName("type")
    private GroupType type;

    /**
     * Information whether current user is administrator
     */
    @SerializedName("is_admin")
    private BoolInt isAdmin;

    @SerializedName("admin_level")
    private GroupAdminLevel adminLevel;

    /**
     * Information whether current user is member
     */
    @SerializedName("is_member")
    private BoolInt isMember;

    /**
     * Information whether current user is advertiser
     */
    @SerializedName("is_advertiser")
    private BoolInt isAdvertiser;

    /**
     * Start date in Unixtime format
     */
    @SerializedName("start_date")
    private Integer startDate;

    /**
     * Finish date in Unixtime format
     */
    @SerializedName("finish_date")
    private Integer finishDate;

    /**
     * Information whether community is banned
     */
    @SerializedName("deactivated")
    private String deactivated;

    /**
     * URL of square photo of the community with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * URL of square photo of the community with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of square photo of the community with 200 pixels in width
     */
    @SerializedName("photo_200")
    private URI photo200;

    /**
     * URL of square photo of the community with 200 pixels in width original
     */
    @SerializedName("photo_200_orig")
    private URI photo200Orig;

    /**
     * URL of square photo of the community with 400 pixels in width
     */
    @SerializedName("photo_400")
    private URI photo400;

    /**
     * URL of square photo of the community with 400 pixels in width original
     */
    @SerializedName("photo_400_orig")
    private URI photo400Orig;

    /**
     * URL of square photo of the community with max pixels in width
     */
    @SerializedName("photo_max")
    private URI photoMax;

    /**
     * URL of square photo of the community with max pixels in width original
     */
    @SerializedName("photo_max_orig")
    private URI photoMaxOrig;

    /**
     * Established date
     */
    @SerializedName("est_date")
    private String estDate;

    /**
     * Public date label
     */
    @SerializedName("public_date_label")
    private String publicDateLabel;

    @SerializedName("photo_max_size")
    private PhotoSize photoMaxSize;

    @SerializedName("is_video_live_notifications_blocked")
    private BoolInt isVideoLiveNotificationsBlocked;

    @SerializedName("video_live")
    private LiveInfo videoLive;

    public Integer getId() {
        return id;
    }

    public Group setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }

    public String getScreenName() {
        return screenName;
    }

    public Group setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public GroupIsClosed getIsClosed() {
        return isClosed;
    }

    public Group setIsClosed(GroupIsClosed isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    public GroupType getType() {
        return type;
    }

    public Group setType(GroupType type) {
        this.type = type;
        return this;
    }

    public boolean isAdmin() {
        return isAdmin == BoolInt.YES;
    }

    public BoolInt getIsAdmin() {
        return isAdmin;
    }

    public GroupAdminLevel getAdminLevel() {
        return adminLevel;
    }

    public Group setAdminLevel(GroupAdminLevel adminLevel) {
        this.adminLevel = adminLevel;
        return this;
    }

    public boolean isMember() {
        return isMember == BoolInt.YES;
    }

    public BoolInt getIsMember() {
        return isMember;
    }

    public boolean isAdvertiser() {
        return isAdvertiser == BoolInt.YES;
    }

    public BoolInt getIsAdvertiser() {
        return isAdvertiser;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public Group setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getFinishDate() {
        return finishDate;
    }

    public Group setFinishDate(Integer finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public Group setDeactivated(String deactivated) {
        this.deactivated = deactivated;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public Group setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public Group setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto200() {
        return photo200;
    }

    public Group setPhoto200(URI photo200) {
        this.photo200 = photo200;
        return this;
    }

    public URI getPhoto200Orig() {
        return photo200Orig;
    }

    public Group setPhoto200Orig(URI photo200Orig) {
        this.photo200Orig = photo200Orig;
        return this;
    }

    public URI getPhoto400() {
        return photo400;
    }

    public Group setPhoto400(URI photo400) {
        this.photo400 = photo400;
        return this;
    }

    public URI getPhoto400Orig() {
        return photo400Orig;
    }

    public Group setPhoto400Orig(URI photo400Orig) {
        this.photo400Orig = photo400Orig;
        return this;
    }

    public URI getPhotoMax() {
        return photoMax;
    }

    public Group setPhotoMax(URI photoMax) {
        this.photoMax = photoMax;
        return this;
    }

    public URI getPhotoMaxOrig() {
        return photoMaxOrig;
    }

    public Group setPhotoMaxOrig(URI photoMaxOrig) {
        this.photoMaxOrig = photoMaxOrig;
        return this;
    }

    public String getEstDate() {
        return estDate;
    }

    public Group setEstDate(String estDate) {
        this.estDate = estDate;
        return this;
    }

    public String getPublicDateLabel() {
        return publicDateLabel;
    }

    public Group setPublicDateLabel(String publicDateLabel) {
        this.publicDateLabel = publicDateLabel;
        return this;
    }

    public PhotoSize getPhotoMaxSize() {
        return photoMaxSize;
    }

    public Group setPhotoMaxSize(PhotoSize photoMaxSize) {
        this.photoMaxSize = photoMaxSize;
        return this;
    }

    public boolean isVideoLiveNotificationsBlocked() {
        return isVideoLiveNotificationsBlocked == BoolInt.YES;
    }

    public BoolInt getIsVideoLiveNotificationsBlocked() {
        return isVideoLiveNotificationsBlocked;
    }

    public LiveInfo getVideoLive() {
        return videoLive;
    }

    public Group setVideoLive(LiveInfo videoLive) {
        this.videoLive = videoLive;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(estDate, isAdvertiser, adminLevel, photo50, photo400, screenName, photo200, isMember, type, deactivated, publicDateLabel, photoMaxSize, photoMaxOrig, photoMax, id, isVideoLiveNotificationsBlocked, videoLive, photo200Orig, isAdmin, photo100, isClosed, photo400Orig, name, finishDate, startDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(photo50, group.photo50) &&
                Objects.equals(type, group.type) &&
                Objects.equals(deactivated, group.deactivated) &&
                Objects.equals(isAdmin, group.isAdmin) &&
                Objects.equals(photoMaxOrig, group.photoMaxOrig) &&
                Objects.equals(photoMaxSize, group.photoMaxSize) &&
                Objects.equals(screenName, group.screenName) &&
                Objects.equals(isAdvertiser, group.isAdvertiser) &&
                Objects.equals(finishDate, group.finishDate) &&
                Objects.equals(adminLevel, group.adminLevel) &&
                Objects.equals(estDate, group.estDate) &&
                Objects.equals(id, group.id) &&
                Objects.equals(photo100, group.photo100) &&
                Objects.equals(photo200, group.photo200) &&
                Objects.equals(isClosed, group.isClosed) &&
                Objects.equals(startDate, group.startDate) &&
                Objects.equals(photo400, group.photo400) &&
                Objects.equals(isVideoLiveNotificationsBlocked, group.isVideoLiveNotificationsBlocked) &&
                Objects.equals(isMember, group.isMember) &&
                Objects.equals(publicDateLabel, group.publicDateLabel) &&
                Objects.equals(photoMax, group.photoMax) &&
                Objects.equals(name, group.name) &&
                Objects.equals(videoLive, group.videoLive) &&
                Objects.equals(photo200Orig, group.photo200Orig) &&
                Objects.equals(photo400Orig, group.photo400Orig);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Group{");
        sb.append("photo50=").append(photo50);
        sb.append(", type=").append(type);
        sb.append(", deactivated='").append(deactivated).append("'");
        sb.append(", isAdmin=").append(isAdmin);
        sb.append(", photoMaxOrig=").append(photoMaxOrig);
        sb.append(", photoMaxSize=").append(photoMaxSize);
        sb.append(", screenName='").append(screenName).append("'");
        sb.append(", isAdvertiser=").append(isAdvertiser);
        sb.append(", finishDate=").append(finishDate);
        sb.append(", adminLevel=").append(adminLevel);
        sb.append(", estDate='").append(estDate).append("'");
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", photo200=").append(photo200);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", startDate=").append(startDate);
        sb.append(", photo400=").append(photo400);
        sb.append(", isVideoLiveNotificationsBlocked=").append(isVideoLiveNotificationsBlocked);
        sb.append(", isMember=").append(isMember);
        sb.append(", publicDateLabel='").append(publicDateLabel).append("'");
        sb.append(", photoMax=").append(photoMax);
        sb.append(", name='").append(name).append("'");
        sb.append(", videoLive=").append(videoLive);
        sb.append(", photo200Orig=").append(photo200Orig);
        sb.append(", photo400Orig=").append(photo400Orig);
        sb.append('}');
        return sb.toString();
    }
}
