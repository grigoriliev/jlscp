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
 *
 * @author Grigor Iliev
 */
public class EffectParameter extends FloatParameter {
	private final int instanceId;
	private final int index;
	
	public EffectParameter(int instanceId, int index) {
		this.instanceId = instanceId;
		this.index = index;
	}
	
	/** Gets the numerical ID of the effect instance to which this parameter belongs. */
	public int
	getEffectInstanceId() { return instanceId; }
	
	/** Gets the position of the parameter in the effect instance's parameter list. */
	public int
	getIndex() { return index; }
	
	/**
	 * Parses a line of text.
	 * @param s The string to be parsed.
	 * @return <code>true</code> if the line has been processed, <code>false</code> otherwise.
	 * @throws LscpException If some error occurs.
	 */
	@Override
	public boolean
	parse(String s) throws LscpException {
		if(s.startsWith("DESCRIPTION: ")) {
			s = s.substring("DESCRIPTION: ".length(), s.length());
			setDescription(Parser.toNonEscapedString(s));
			return true;
		}
		
		if(super.parse(s)) return true;
		else if(s.startsWith("VALUE: ")) {
			s = s.substring("VALUE: ".length(), s.length());
			setValue(Parser.parseFloat(s));
			return true;
		}
		
		return false;
	}
	
	@Override
	public String
	toString() { return getDescription() != null ? getDescription() : super.toString(); }
}
