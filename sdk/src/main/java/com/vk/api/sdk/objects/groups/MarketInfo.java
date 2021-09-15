package com.vk.api.sdk.objects.groups;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.market.Currency;
import com.vk.api.sdk.objects.market.Price;
import java.util.Objects;

/**
 * MarketInfo object
 */
public class MarketInfo implements Validable {
    /**
     * Market type
     */
    @SerializedName("type")
    private String type;

    /**
     * Contact person ID
     */
    @SerializedName("contact_id")
    private Integer contactId;

    @SerializedName("currency")
    private Currency currency;

    /**
     * Currency name
     */
    @SerializedName("currency_text")
    private String currencyText;

    /**
     * Information whether the market is enabled
     */
    @SerializedName("enabled")
    private BoolInt enabled;

    /**
     * Main market album ID
     */
    @SerializedName("main_album_id")
    private Integer mainAlbumId;

    /**
     * Maximum price
     */
    @SerializedName("price_max")
    private String priceMax;

    /**
     * Minimum price
     */
    @SerializedName("price_min")
    private String priceMin;

    @SerializedName("min_order_price")
    private Price minOrderPrice;

    public String getType() {
        return type;
    }

    public MarketInfo setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getContactId() {
        return contactId;
    }

    public MarketInfo setContactId(Integer contactId) {
        this.contactId = contactId;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public MarketInfo setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyText() {
        return currencyText;
    }

    public MarketInfo setCurrencyText(String currencyText) {
        this.currencyText = currencyText;
        return this;
    }

    public boolean isEnabled() {
        return enabled == BoolInt.YES;
    }

    public BoolInt getEnabled() {
        return enabled;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public MarketInfo setMainAlbumId(Integer mainAlbumId) {
        this.mainAlbumId = mainAlbumId;
        return this;
    }

    public String getPriceMax() {
        return priceMax;
    }

    public MarketInfo setPriceMax(String priceMax) {
        this.priceMax = priceMax;
        return this;
    }

    public String getPriceMin() {
        return priceMin;
    }

    public MarketInfo setPriceMin(String priceMin) {
        this.priceMin = priceMin;
        return this;
    }

    public Price getMinOrderPrice() {
        return minOrderPrice;
    }

    public MarketInfo setMinOrderPrice(Price minOrderPrice) {
        this.minOrderPrice = minOrderPrice;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceMin, mainAlbumId, priceMax, minOrderPrice, currencyText, contactId, currency, type, enabled);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarketInfo marketInfo = (MarketInfo) o;
        return Objects.equals(minOrderPrice, marketInfo.minOrderPrice) &&
                Objects.equals(currencyText, marketInfo.currencyText) &&
                Objects.equals(currency, marketInfo.currency) &&
                Objects.equals(type, marketInfo.type) &&
                Objects.equals(contactId, marketInfo.contactId) &&
                Objects.equals(priceMin, marketInfo.priceMin) &&
                Objects.equals(mainAlbumId, marketInfo.mainAlbumId) &&
                Objects.equals(enabled, marketInfo.enabled) &&
                Objects.equals(priceMax, marketInfo.priceMax);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("MarketInfo{");
        sb.append("minOrderPrice=").append(minOrderPrice);
        sb.append(", currencyText='").append(currencyText).append("'");
        sb.append(", currency=").append(currency);
        sb.append(", type='").append(type).append("'");
        sb.append(", contactId=").append(contactId);
        sb.append(", priceMin='").append(priceMin).append("'");
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", enabled=").append(enabled);
        sb.append(", priceMax='").append(priceMax).append("'");
        sb.append('}');
        return sb.toString();
    }
}
