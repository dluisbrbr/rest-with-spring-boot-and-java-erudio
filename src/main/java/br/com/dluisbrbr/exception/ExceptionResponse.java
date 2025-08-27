package br.com.dluisbrbr.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}