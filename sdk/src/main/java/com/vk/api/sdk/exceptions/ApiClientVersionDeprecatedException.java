package com.vk.api.sdk.exceptions;

public class ApiClientVersionDeprecatedException extends ApiException {
    public ApiClientVersionDeprecatedException(String message) {
        super(34, "Client version deprecated", message);
    }
}
