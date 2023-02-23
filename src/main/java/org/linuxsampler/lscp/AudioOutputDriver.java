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

/**
 * This class provides detailed information about an audio output driver.
 * @author  Grigor Iliev
 */
public class AudioOutputDriver extends AbstractDriver {
	
	/** Creates a new instance of AudioOutputDriverInfo */
	public
	AudioOutputDriver() {
		
	}
	
	/**
	 * Creates a new instance of AudioOutputDriver and parses the detailed information
	 * about an audio output driver described by <code>resultSet</code>.
	 * @param resultSet An array with information categories about an audio output driver.
	 */
	protected
	AudioOutputDriver(String[] resultSet) {
		for(String s : resultSet)
			if(!parse(s)) Client.getLogger().info(LscpI18n.getLogMsg("unknownLine", s));
	}
}
