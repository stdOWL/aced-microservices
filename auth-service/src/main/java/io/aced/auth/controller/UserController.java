package io.aced.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @PostMapping(value = "/reset-password")
    public ResponseEntity sendResetPasswordMail(@RequestParam String email) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/reset-password/{hash}")
    public ResponseEntity resetPassword(String hash) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/info")
    public ResponseEntity info() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/change-password")
    public ResponseEntity changePassword() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/2fa/activate")
    public ResponseEntity activate2FA() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/2fa/disable")
    public ResponseEntity disable2FA() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/2fa/info")
    public ResponseEntity infoTFA() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);	}

    @GetMapping(value = "/notifications")
    public ResponseEntity notification() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }



    @GetMapping(value = "/register")
    public ResponseEntity register() {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
