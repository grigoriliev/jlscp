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

package org.linuxsampler.lscp;

import java.util.Vector;


/**
 * This class provides default implementation of the <code>Driver</code> interface.
 * @author  Grigor Iliev
 */
public abstract class AbstractDriver implements Driver, Parseable {
	private String name = null;
	private String desc = null;
	private String ver = null;
	private String[] prmNames = null;
	private final Vector<Parameter> prmList = new Vector<Parameter>();
	
	
	/** Creates a new instance of <code>AbstractDriver</code> */
	public AbstractDriver() {
	}
	
	/**
	 * Gets the name of this driver.
	 * @return The name of this driver.
	 */
	public String
	getName() { return name; }
	
	/**
	 * Sets the name of this driver.
	 * @param name A <code>String</code> object containing the new name for this driver.
	 */
	public void
	setName(String name) { this.name = name; }
	
	/**
	 * Gets a description about this driver.
	 * @return A description about this driver.
	 */
	public String
	getDescription() { return desc; }
	
	/**
	 * Gets the version of this driver.
	 * @return The version of this driver.
	 */
	public String
	getVersion() { return ver; }
	
	/**
	 * Adds driver parameter.
	 * @param prm The additional parameter to be added.
	 */
	public void
	addParameter(Parameter prm) { prmList.add(prm); }
	
	/**
	 * Gets all parameters available for this driver.
	 * @return <code>Parameter</code> array with all parameters available for this driver.
	 */
	public Parameter[]
	getParameters() { return prmList.toArray(new Parameter[prmList.size()]); }
	
	/**
	 * Gets the names of all parameters available for this driver.
	 * @return <code>String</code> array with the names of all parameters
	 * available for this driver.
	 */
	public String[]
	getParameterNames() { return prmNames; }
	
	/**
	 * Parses a line of text.
	 * @param s A string to be parsed.
	 * @return <code>true</code> if the line has been processed, <code>false</code> otherwise.
	 */
	public boolean
	parse(String s) {
		if(s.startsWith("DESCRIPTION: ")) {
			desc = s.substring("DESCRIPTION: ".length(), s.length());
		} else if(s.startsWith("VERSION: ")) {
			ver = s.substring("VERSION: ".length(), s.length());
		} else if(s.startsWith("PARAMETERS: ")) {
			s = s.substring("PARAMETERS: ".length(), s.length());
			prmNames = Parser.parseList(s);
		} else return false;
		
		return true;
	}
	
	/**
	 * Returns the name of this driver.
	 * @return The name of this driver.
	 */
	public String
	toString() { return getName(); }
}
