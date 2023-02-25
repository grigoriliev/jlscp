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

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;


/**
 *
 * @author  Grigor Iliev
 */
class LscpOutputStream {
	private OutputStream out;
	
	/** Creates a new instance of LscpOutputStream */
	public
	LscpOutputStream(OutputStream out) { this.out = out; }
	
	/*
	 * Writes a line.
	 * @param line a string to be written.
	 */
	public void
	writeLine(String line) throws IOException {
		try {
			out.write(line.getBytes("US-ASCII"));
			out.write('\r');
			out.write('\n');
			out.flush();
		} catch(UnsupportedEncodingException x) { 
			Client.getLogger().log(java.util.logging.Level.FINE, x.getMessage(), x); 
		}
	}
}
