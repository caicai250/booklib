package com.cct.qslib.security.exception;

import com.cct.qslib.security.enums.ResponseCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {
    private ResponseCodeEnum responseCode;

    public BaseException(ResponseCodeEnum responseCode, String message) {
        super(message);

        setResponseCode(responseCode);
    }

}
