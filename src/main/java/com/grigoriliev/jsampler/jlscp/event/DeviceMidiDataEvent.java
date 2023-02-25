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
 * A semantic event which indicates that MIDI data has arrived on a specific MIDI device.
 * @author Grigor Iliev
 */
public class DeviceMidiDataEvent extends MidiDataEvent {
	private int deviceId = -1;
	private int portId = -1;
	
	/** Creates a new instance of <code>DeviceMidiDataEvent</code> */
	public
	DeviceMidiDataEvent(Object source, Type type, int note, int velocity) {
		super(source, type, note, velocity);
	}
	
	/**
	 * Returns the ID of the MIDI device, to which MIDI data has arrived.
	 */
	public int
	getDeviceId() { return deviceId; }
	
	/**
	 * Sets the ID of the MIDI device, to which MIDI data has arrived.
	 */
	public void
	setDeviceId(int id) { deviceId = id; }
	
	/**
	 * Returns the ID of the device's MIDI port, to which MIDI data has arrived.
	 */
	public int
	getPortId() { return portId; }
	
	/**
	 * Sets the ID of the device's MIDI port, to which MIDI data has arrived.
	 */
	public void
	setPortId(int id) { portId = id; }
}
