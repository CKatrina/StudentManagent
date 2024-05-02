package com.management.utils;

public enum  EnumCode {
    /**
     * 200 request successful
     */
    OK(200, "request successful"),
    /**
     * 303 Login Failure
     */
    LOGIN_FAIL(303, "Login Failure"),
    /**
     * 400 request parameter error
     */
    BAD_REQUEST(400, "request parameter error"),
    /**
     * 401 not logged in
     */
    UNAUTHORIZED(401, "not logged in"),
    /**
     * 403 no authority
     */
    FORBIDDEN(403, "403 no authority"),
    /**
     * 410 has been deleted.
     */
    GONE(410, "it has been deleted"),
    /**
     * 423 is locked.
     */
    LOCKED(423, "it is locked"),
    /**
     * 500 Server Error
     */
    INTERNAL_SERVER_ERROR(500, "Server Error"),
    /**
     * Exceptional
     */
    EXCPTION_ERROR(4001, "Exceptional");

    private final Integer value;
    private final String text;

    private EnumCode(Integer value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * Get value
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Get Text
     */
    public String getText() {
        return this.text;
    }
}
