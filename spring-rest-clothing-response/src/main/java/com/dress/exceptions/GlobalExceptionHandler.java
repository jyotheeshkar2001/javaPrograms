package com.dress.exceptions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import com.dress.model.APIErrors;
@ControllerAdvice

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("This method is not supported",ex.getMessage());
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info","invalid method");
		APIErrors errors=new APIErrors(LocalDateTime.now(), message, status, status.value(), error);
		
		
		
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("This media is not supported",ex.getMessage());
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "Invalid method");
		APIErrors errors=new APIErrors(LocalDateTime.now(), message, status, status.value(), error);
		
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("missing path",ex.getMessage());
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "Invalid method");
		APIErrors errors=new APIErrors(LocalDateTime.now(), message, status, status.value(), error);
		
		return ResponseEntity.status(status).headers(headers).body(errors);
	
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("path variable is missing"+ex.getParameterName()+"is missing",ex.getParameterType()+"is expected");
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "Invalid method");
		APIErrors errors=new APIErrors(LocalDateTime.now(), message, status, status.value(), error);
		
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message=ex.getMessage();
		List<Object> error=Arrays.asList("type mismach"+ex.getRequiredType()+" is expected");
		//HttpHeaders httpHeaders=new HttpHeaders();
		headers.add("info", "Invalid method");
		APIErrors errors=new APIErrors(LocalDateTime.now(), message, status, status.value(), error);
		
		return ResponseEntity.status(status).headers(headers).body(errors);
	}
	
	@ExceptionHandler(DressNotFoundException.class)
	public ResponseEntity<Object> handleBookNotFound(DressNotFoundException ex){
		String message=ex.getMessage();
		HttpHeaders httpHeaders=new HttpHeaders();
		List<Object> error=Arrays.asList("dresses not available");
		httpHeaders.add("info","dress not found");
		APIErrors errors=new APIErrors(LocalDateTime.now(),message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(),error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
		
		
		
		
		
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex){
		String message=ex.getMessage();
		HttpHeaders httpHeaders=new HttpHeaders();
		List<Object> error=Arrays.asList("other");
		httpHeaders.add("info","other");
		APIErrors errors=new APIErrors(LocalDateTime.now(),message,HttpStatus.INTERNAL_SERVER_ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(),error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
		
	

}

}
