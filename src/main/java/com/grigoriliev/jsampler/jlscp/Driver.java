/*
 *   jlscp - a java LinuxSampler control protocol API
 *
 *   Copyright (C) 2005-2023 Grigor Iliev <grigor@grigoriliev.com>
 *
 *   This file is part of jlscp.
 *
 *   jlscp is free software: you can redistribute it and/or modify it under
 *   the terms of the GNU General Public License as published by the Free
 *   Software Foundation, either version 3 of the License, or (at your option)
 *   any later version.
 *
 *   jlscp is distributed in the hope that it will be useful, but WITHOUT
 *   ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *   FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 *   more details.
 *
 *   You should have received a copy of the GNU General Public License along
 *   with jlscp. If not, see <https://www.gnu.org/licenses/>. 
 */

package com.grigoriliev.jsampler.jlscp;

/**
 * Defines the generic properties that every driver should have.
 * @author  Grigor Iliev
 */
public interface Driver {
	/**
	 * Gets the name of this driver.
	 * @return The name of this driver.
	 */
	public String getName();
	
	/**
	 * Gets a description about this driver.
	 * @return A description about this driver.
	 */
	public String getDescription();
	
	/**
	 * Gets the version of this driver.
	 * @return The version of this driver.
	 */
	public String getVersion();
	
	/**
	 * Gets all parameters available for this driver.
	 * @return <code>Parameter</code> array with all parameters available for this driver.
	 */
	public Parameter[] getParameters();
	
	/**
	 * Gets the names of all parameters available for this driver.
	 * @return <code>String</code> array with the names of all parameters
	 * available for this driver.
	 */
	public String[] getParameterNames();
}
