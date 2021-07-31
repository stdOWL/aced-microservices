package io.aced.account.controller;

import java.security.Principal;
import java.util.List;

import io.aced.account.dto.SalesDTO;
import io.aced.account.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.aced.account.common.messages.BaseResponse;

@Validated
@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping(value = "/reset-password")
	public ResponseEntity<BaseResponse> sendResetPasswordMail(@RequestParam String email) {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/reset-password/{hash}")
	public ResponseEntity<List<SalesDTO>> resetPassword(String hash) {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/info")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/change-password")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/2fa/activate")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/2fa/disable")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/2fa/info")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/notifications")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

	@GetMapping(value = "/notifications")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}


	@GetMapping(value = "/register")
	public ResponseEntity<List<SalesDTO>> info() {
		return new ResponseEntity<BaseResponse>(null, HttpStatus.OK);
	}

}
