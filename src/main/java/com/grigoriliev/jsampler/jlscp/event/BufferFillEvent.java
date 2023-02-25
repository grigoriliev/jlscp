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

package com.grigoriliev.jsampler.jlscp.event;

import java.util.Vector;

import com.grigoriliev.jsampler.jlscp.BufferFill;

/**
 * A semantic event which indicates that the fill state of a disk stream buffer
 * in a sampler channel has changed.
 *
 * @author  Grigor Iliev
 */
public class BufferFillEvent extends java.util.EventObject {
	private int samplerChn;
	private Vector<BufferFill> fills = new Vector<BufferFill>();
	
	/**
	 * Constructs a <code>BufferFillEvent</code> object.
	 *
	 * @param source The object that originated the event.
	 * @param samplerChn The number of the sampler channel for which 
	 * the buffer fill state change occurred.
	 * @param fills The new fill state of all disk streams in percent.
	 */
	public
	BufferFillEvent(Object source, int samplerChn, Vector<BufferFill> fills) {
		super(source);
		this.samplerChn = samplerChn;
		this.fills = fills;
	}
	
	/**
	 * Gets the number of the sampler channel for which 
	 * the buffer fill state change occurred.
	 *
	 * @return The number of the sampler channel for which 
	 * the buffer fill state change occurred.
	 */
	public int
	getSamplerChannel() { return samplerChn; }
	
	/**
	 *  Gets the new fill state of all disk streams in percent.
	 *
	 * @return The new fill state of all disk streams in percent.
	 */
	public Vector<BufferFill>
	getChannelBufferFillPercentage() { return fills; }
}
