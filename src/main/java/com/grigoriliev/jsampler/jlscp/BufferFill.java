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
 * Provides information about the fill state of a disk stream buffer.
 * @author  Grigor Iliev
 */
public class BufferFill {
	private int streamId;
	private int value;
	
	/** Creates a new instance of <code>BufferFill</code>. */
	public
	BufferFill() { this(0, 0); }
	
	/** 
	 * Creates a new instance of <code>BufferFill</code> with
	 * the specified stream ID and fill amount.
	 * @param streamId The stream ID of the disk stream buffer.
	 * @param value The fill amount of the disk stream buffer.
	 */
	public
	BufferFill(int streamId, int value) {
		setStreamId(streamId);
		setValue(value);
	}
	
	/**
	 * Gets the stream ID of the disk stream buffer.
	 * @return The stream ID of the disk stream buffer.
	 */
	public int
	getStreamId() { return streamId; }
	
	/**
	 * Sets the stream ID of the disk stream buffer.
	 * @param id The stream ID of the disk stream buffer.
	 */
	public void
	setStreamId(int id) { streamId = id; }
	
	/**
	 * Gets the fill amount of the buffer.
	 * @return The fill amount of the buffer.
	 */
	public int
	getValue() { return value; }
	
	/**
	 * Sets the fill amount of the buffer.
	 * @param val The fill amount of the buffer.
	 */
	public void
	setValue(int val) { value = val; }
}
