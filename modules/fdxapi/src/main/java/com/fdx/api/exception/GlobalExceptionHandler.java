package com.fdx.api.exception;

import com.fdx.common.util.ApiUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    ApiUtil apiUtil = new ApiUtil();

    String errorResponse = null;

    public GlobalExceptionHandler() {
        super();
    }

    @Override
    public ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleServletRequestBindingException(ServletRequestBindingException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleConversionNotSupported(ConversionNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        //return new ResponseEntity<>(errorResponse, status);
        return apiUtil.getInvalidInputResponse();
    }

    @Override
    public ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleHttpMessageNotWritable(HttpMessageNotWritableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleMissingServletRequestPart(MissingServletRequestPartException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleAsyncRequestTimeoutException(AsyncRequestTimeoutException ex, HttpHeaders headers, HttpStatus status, WebRequest webRequest) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @Override
    public ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String errorCode = String.valueOf(status.value());
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, status);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleException(Exception ex){
        String errorCode = "500";
        String message = ex.getMessage();
        errorResponse = apiUtil.getErrorObject(errorCode, message);
        logger.error(errorResponse, ex);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
