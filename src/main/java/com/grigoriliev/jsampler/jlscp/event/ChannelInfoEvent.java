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

/**
 * A semantic event which indicates changes to a specific sampler channel.
 *
 * @author  Grigor Iliev
 */
public class ChannelInfoEvent extends java.util.EventObject {
	private int samplerChn;
	
	/**
	 * Constructs a <code>ChannelInfoEvent</code> object.
	 *
	 * @param source The object that originated the event.
	 * @param samplerChn The number of the sampler channel whose settings have changed.
	 */
	public
	ChannelInfoEvent(Object source, int samplerChn) {
		super(source);
		this.samplerChn = samplerChn;
	}
	
	/**
	 * Gets the number of the sampler channel whose settings have changed.
	 *
	 * @return The number of the sampler channel whose settings have changed.
	 */
	public int
	getSamplerChannel() { return samplerChn; }
}
