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
 * A semantic event which indicates that the number of MIDI instruments
 * in a MIDI instrument map has changed.
 * @author Grigor Iliev
 */
public class MidiInstrumentCountEvent extends java.util.EventObject {
	private int mapId;
	private int instrumentCount;
	
	/**
	 * Constructs a <code>MidiInstrumentCountEvent</code> object.
	 * @param source The object that originated the event.
	 * @param mapId The numerical ID of the MIDI instrument map.
	 * @param count The new number of MIDI instruments.
	 */
	public
	MidiInstrumentCountEvent(Object source, int mapId, int count) {
		super(source);
		this.mapId = mapId;
		this.instrumentCount = count;
	}
	
	/**
	 * Gets the numerical ID of the MIDI instrument map, in which
	 * the number of MIDI instruments has changed.
	 * @return The numerical ID of the MIDI instrument map, in which
	 * the number of MIDI instruments has changed.
	 */
	public int
	getMapId() { return mapId; }
	
	/**
	 * Gets the new number of MIDI instruments in the MIDI instrument map.
	 * @return The new number of MIDI instruments in the MIDI instrument map.
	 */
	public int
	getInstrumentCount() { return instrumentCount; }
}
