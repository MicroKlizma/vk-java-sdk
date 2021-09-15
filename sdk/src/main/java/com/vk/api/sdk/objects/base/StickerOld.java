package com.vk.api.sdk.objects.base;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import java.net.URI;
import java.util.Objects;

/**
 * StickerOld object
 */
public class StickerOld implements Validable {
    /**
     * Sticker ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Pack ID
     */
    @SerializedName("product_id")
    private Integer productId;

    /**
     * Width in px
     */
    @SerializedName("width")
    private Integer width;

    /**
     * Height in px
     */
    @SerializedName("height")
    private Integer height;

    /**
     * URL of the preview image with 128 px in height
     */
    @SerializedName("photo_128")
    private URI photo128;

    /**
     * URL of the preview image with 256 px in height
     */
    @SerializedName("photo_256")
    private URI photo256;

    /**
     * URL of the preview image with 352 px in height
     */
    @SerializedName("photo_352")
    private URI photo352;

    /**
     * URL of the preview image with 512 px in height
     */
    @SerializedName("photo_512")
    private URI photo512;

    /**
     * URL of the preview image with 64 px in height
     */
    @SerializedName("photo_64")
    private URI photo64;

    /**
     * Information whether the sticker is allowed
     */
    @SerializedName("is_allowed")
    private Boolean isAllowed;

    public Integer getId() {
        return id;
    }

    public StickerOld setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getProductId() {
        return productId;
    }

    public StickerOld setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public StickerOld setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public StickerOld setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public URI getPhoto128() {
        return photo128;
    }

    public StickerOld setPhoto128(URI photo128) {
        this.photo128 = photo128;
        return this;
    }

    public URI getPhoto256() {
        return photo256;
    }

    public StickerOld setPhoto256(URI photo256) {
        this.photo256 = photo256;
        return this;
    }

    public URI getPhoto352() {
        return photo352;
    }

    public StickerOld setPhoto352(URI photo352) {
        this.photo352 = photo352;
        return this;
    }

    public URI getPhoto512() {
        return photo512;
    }

    public StickerOld setPhoto512(URI photo512) {
        this.photo512 = photo512;
        return this;
    }

    public URI getPhoto64() {
        return photo64;
    }

    public StickerOld setPhoto64(URI photo64) {
        this.photo64 = photo64;
        return this;
    }

    public Boolean getIsAllowed() {
        return isAllowed;
    }

    public StickerOld setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed, productId, photo64, photo352, width, photo256, id, photo128, photo512, height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StickerOld stickerOld = (StickerOld) o;
        return Objects.equals(photo512, stickerOld.photo512) &&
                Objects.equals(photo128, stickerOld.photo128) &&
                Objects.equals(productId, stickerOld.productId) &&
                Objects.equals(photo64, stickerOld.photo64) &&
                Objects.equals(width, stickerOld.width) &&
                Objects.equals(isAllowed, stickerOld.isAllowed) &&
                Objects.equals(id, stickerOld.id) &&
                Objects.equals(photo352, stickerOld.photo352) &&
                Objects.equals(photo256, stickerOld.photo256) &&
                Objects.equals(height, stickerOld.height);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StickerOld{");
        sb.append("photo512=").append(photo512);
        sb.append(", photo128=").append(photo128);
        sb.append(", productId=").append(productId);
        sb.append(", photo64=").append(photo64);
        sb.append(", width=").append(width);
        sb.append(", isAllowed=").append(isAllowed);
        sb.append(", id=").append(id);
        sb.append(", photo352=").append(photo352);
        sb.append(", photo256=").append(photo256);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
