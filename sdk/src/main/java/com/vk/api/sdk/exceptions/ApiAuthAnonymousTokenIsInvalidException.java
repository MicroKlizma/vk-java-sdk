package com.vk.api.sdk.exceptions;

public class ApiAuthAnonymousTokenIsInvalidException extends ApiException {
    public ApiAuthAnonymousTokenIsInvalidException(String message) {
        super(1116, "Anonymous token is invalid", message);
    }
}
