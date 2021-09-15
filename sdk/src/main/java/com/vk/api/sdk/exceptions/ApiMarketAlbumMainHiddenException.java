package com.vk.api.sdk.exceptions;

public class ApiMarketAlbumMainHiddenException extends ApiException {
    public ApiMarketAlbumMainHiddenException(String message) {
        super(1446, "Main album can not be hidden", message);
    }
}
