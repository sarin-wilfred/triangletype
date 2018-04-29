/**
 * 
 */
package org.telstra.triangletype.srvc.rest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.telstra.triangletype.srvc.rest.exceptions.TriangleTypeException;

/**
 * @author Sarin
 *
 */
@RestControllerAdvice
public class TriangleTypeControllerAdvice {

	/**
	 * Method added to handle TriangleTypeException
	 * 
	 * @param request
	 * @param ttex
	 */
	@ExceptionHandler(TriangleTypeException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Triangle Type App: Exception occurred while finding triangle type.")
	public void handleException(HttpServletRequest request, TriangleTypeException ttex) {
	}

	/**
	 * Method added to handle NumberFormatException
	 * 
	 * @param request
	 * @param nfEx
	 */
	@ExceptionHandler(NumberFormatException.class)
	@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "Triangle Type App: Exception occurred while finding triangle type.")
	public void handleException(HttpServletRequest request, NumberFormatException nfEx) {
	}

	/**
	 * Method added to handle Exception
	 * 
	 * @param request
	 * @param ex
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED, reason = "Triangle Type Application Error.")
	public void handleException(HttpServletRequest request, Exception ex) {
	}

}
