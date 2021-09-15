package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.addToAlbum method
 */
public class MarketAddToAlbumQuery extends AbstractQueryBuilder<MarketAddToAlbumQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param itemIds value of "item ids" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketAddToAlbumQuery(VkApiClient client, UserActor actor, int ownerId,
            Integer[] itemIds, Integer... albumIds) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemIds(itemIds);
        albumIds(albumIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter.
     * @param itemIds value of "item ids" parameter.
     * @param albumIds value of "album ids" parameter.
     */
    public MarketAddToAlbumQuery(VkApiClient client, UserActor actor, int ownerId,
            List<Integer> itemIds, List<Integer> albumIds) {
        super(client, "market.addToAlbum", OkResponse.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        itemIds(itemIds);
        albumIds(albumIds);
    }

    /**
     * ID of an item owner community.
     *
     * @param value value of "owner id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery ownerId(int value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * item_ids
     * Set item ids
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery itemIds(Integer... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * Set item ids
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery itemIds(List<Integer> value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * album_ids
     * Collections IDs to add item to.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery albumIds(Integer... value) {
        return unsafeParam("album_ids", value);
    }

    /**
     * Collections IDs to add item to.
     *
     * @param value value of "album ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketAddToAlbumQuery albumIds(List<Integer> value) {
        return unsafeParam("album_ids", value);
    }

    @Override
    protected MarketAddToAlbumQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("album_ids", "item_ids", "owner_id", "access_token");
    }
}
