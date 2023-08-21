package com.service.socialLogin.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserException extends RuntimeException {


    public UserException(String msg) {
        super(msg);
    }
}

