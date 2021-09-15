package com.vk.api.sdk.objects.orders.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * GetResponse object
 */
public class GetResponse implements Validable {
    /**
     * Amount
     */
    @SerializedName("amount")
    @Required
    private String amount;

    /**
     * App order ID
     */
    @SerializedName("app_order_id")
    private String appOrderId;

    /**
     * Cancel transaction ID
     */
    @SerializedName("cancel_transaction_id")
    private String cancelTransactionId;

    /**
     * Date of creation in Unixtime
     */
    @SerializedName("date")
    @Required
    private String date;

    /**
     * Order ID
     */
    @SerializedName("id")
    @Required
    private String id;

    /**
     * Order item
     */
    @SerializedName("item")
    @Required
    private String item;

    /**
     * Receiver ID
     */
    @SerializedName("receiver_id")
    private String receiverId;

    /**
     * Order status
     */
    @SerializedName("status")
    @Required
    private GetResponseStatus status;

    /**
     * Transaction ID
     */
    @SerializedName("transaction_id")
    private String transactionId;

    /**
     * User ID
     */
    @SerializedName("user_id")
    private String userId;

    public String getAmount() {
        return amount;
    }

    public GetResponse setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getAppOrderId() {
        return appOrderId;
    }

    public GetResponse setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    public String getCancelTransactionId() {
        return cancelTransactionId;
    }

    public GetResponse setCancelTransactionId(String cancelTransactionId) {
        this.cancelTransactionId = cancelTransactionId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public GetResponse setDate(String date) {
        this.date = date;
        return this;
    }

    public String getId() {
        return id;
    }

    public GetResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public GetResponse setItem(String item) {
        this.item = item;
        return this;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public GetResponse setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public GetResponseStatus getStatus() {
        return status;
    }

    public GetResponse setStatus(GetResponseStatus status) {
        this.status = status;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public GetResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public GetResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, amount, item, receiverId, appOrderId, cancelTransactionId, id, userId, transactionId, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse getResponse = (GetResponse) o;
        return Objects.equals(date, getResponse.date) &&
                Objects.equals(transactionId, getResponse.transactionId) &&
                Objects.equals(cancelTransactionId, getResponse.cancelTransactionId) &&
                Objects.equals(amount, getResponse.amount) &&
                Objects.equals(item, getResponse.item) &&
                Objects.equals(userId, getResponse.userId) &&
                Objects.equals(receiverId, getResponse.receiverId) &&
                Objects.equals(id, getResponse.id) &&
                Objects.equals(appOrderId, getResponse.appOrderId) &&
                Objects.equals(status, getResponse.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetResponse{");
        sb.append("date='").append(date).append("'");
        sb.append(", transactionId='").append(transactionId).append("'");
        sb.append(", cancelTransactionId='").append(cancelTransactionId).append("'");
        sb.append(", amount='").append(amount).append("'");
        sb.append(", item='").append(item).append("'");
        sb.append(", userId='").append(userId).append("'");
        sb.append(", receiverId='").append(receiverId).append("'");
        sb.append(", id='").append(id).append("'");
        sb.append(", appOrderId='").append(appOrderId).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append('}');
        return sb.toString();
    }
}
