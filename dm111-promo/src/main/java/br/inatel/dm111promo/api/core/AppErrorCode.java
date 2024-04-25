package br.inatel.dm111promo.api.core;

import org.springframework.http.HttpStatus;

public enum AppErrorCode {

    PROMO_NOT_FOUND("entity.promo.not-found", "The Promo does not exist.", HttpStatus.NOT_FOUND),

    PROMO_QUERY_ERROR("query.product.error", "The promo query is not working. Please try again!", HttpStatus.INTERNAL_SERVER_ERROR),

    PASSWORD_ENCRYPTION_ERROR("encrypt.user.error", "The user encryption did not work!", HttpStatus.INTERNAL_SERVER_ERROR);
    private String code;
    private String message;
    private HttpStatus status;

    AppErrorCode(String code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}