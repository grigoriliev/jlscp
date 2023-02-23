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
package org.linuxsampler.lscp.event;

/**
 *
 * @author Grigor Iliev
 */
public class EffectInstanceCountEvent extends java.util.EventObject {
	private int instanceCount = -1;
	
	/**
	 * Constructs an <code>EffectInstanceCountEvent</code> object.
	 * @param source The object that originated the event.
	 */
	public
	EffectInstanceCountEvent(Object source, int instanceCount) {
		super(source);
		this.instanceCount = instanceCount;
	}
	
	public int
	getInstanceCount() { return instanceCount; }
}
