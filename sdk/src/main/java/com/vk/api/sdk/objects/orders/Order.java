package com.vk.api.sdk.objects.orders;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * Order object
 */
public class Order implements Validable {
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
    private OrderStatus status;

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

    public Order setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getAppOrderId() {
        return appOrderId;
    }

    public Order setAppOrderId(String appOrderId) {
        this.appOrderId = appOrderId;
        return this;
    }

    public String getCancelTransactionId() {
        return cancelTransactionId;
    }

    public Order setCancelTransactionId(String cancelTransactionId) {
        this.cancelTransactionId = cancelTransactionId;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Order setDate(String date) {
        this.date = date;
        return this;
    }

    public String getId() {
        return id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public String getItem() {
        return item;
    }

    public Order setItem(String item) {
        this.item = item;
        return this;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public Order setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Order setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public Order setUserId(String userId) {
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
        Order order = (Order) o;
        return Objects.equals(date, order.date) &&
                Objects.equals(transactionId, order.transactionId) &&
                Objects.equals(cancelTransactionId, order.cancelTransactionId) &&
                Objects.equals(amount, order.amount) &&
                Objects.equals(item, order.item) &&
                Objects.equals(userId, order.userId) &&
                Objects.equals(receiverId, order.receiverId) &&
                Objects.equals(id, order.id) &&
                Objects.equals(appOrderId, order.appOrderId) &&
                Objects.equals(status, order.status);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Order{");
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
