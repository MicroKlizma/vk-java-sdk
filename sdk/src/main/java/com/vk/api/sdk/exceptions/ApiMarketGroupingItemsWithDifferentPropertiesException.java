package com.vk.api.sdk.exceptions;

public class ApiMarketGroupingItemsWithDifferentPropertiesException extends ApiException {
    public ApiMarketGroupingItemsWithDifferentPropertiesException(String message) {
        super(1412, "Grouping items with different properties", message);
    }
}
