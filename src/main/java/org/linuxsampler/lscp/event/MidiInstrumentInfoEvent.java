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
 * A semantic event which indicates that a MIDI instrument
 * in a MIDI instrument map is changed.
 * @author Grigor Iliev
 */
public class MidiInstrumentInfoEvent extends java.util.EventObject {
	private int mapId;
	private int midiBank;
	private int midiProgram;
	
	/**
	 * Constructs a <code>MidiInstrumentInfoEvent</code> object.
	 * @param source The object that originated the event.
	 * @param mapId The numerical ID of the MIDI
	 * instrument map, containing the changed instrument.
	 * @param bank The index of the MIDI bank, containing the instrument.
	 * @param program The MIDI program number of the instrument.
	 */
	public
	MidiInstrumentInfoEvent(Object source, int mapId, int bank, int program) {
		super(source);
		this.mapId = mapId;
		this.midiBank = bank;
		this.midiProgram = program;
	}
	
	/**
	 * Gets the numerical ID of the MIDI instrument map, which
	 * instrument number is changed.
	 * @return The numerical ID of the MIDI instrument map, which
	 * instrument number is changed.
	 */
	public int
	getMapId() { return mapId; }
	
	/**
	 * Gets the index of the MIDI bank, containing the instrument.
	 * @return The index of the MIDI bank, containing the instrument.
	 */
	public int
	getMidiBank() { return midiBank; }
	
	/**
	 * Gets the MIDI program number of the instrument.
	 * @return The MIDI program number of the instrument.
	 */
	public int
	getMidiProgram() { return midiProgram; }
}
