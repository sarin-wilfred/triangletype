/**
 * 
 */
package org.telstra.triangletype.srvc.rest.services;

import org.telstra.triangletype.srvc.rest.enums.TriangleType;
import org.telstra.triangletype.srvc.rest.exceptions.TriangleTypeException;

/**
 * @author Sarin
 *
 */
public interface TriangleTypeService {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 * @throws TriangleTypeException
	 */
	public TriangleType process(Integer a, Integer b, Integer c) throws TriangleTypeException;

}
