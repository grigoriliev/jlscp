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
 * Adapter class for receiving events.
 * This class exists as convenience for creating listener objects.
 * The methods in this class are empty.
 * @author Grigor Iliev
 */
public class InstrumentsDbAdapter implements InstrumentsDbListener {
	/**
	 * Invoked when the number of instrument
	 * directories in a specific directory has changed.
	 */
	public void
	directoryCountChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when the settings of an instrument directory are changed.
	 */
	public void
	directoryInfoChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when an instrument directory is renamed.
	 */
	public void
	directoryNameChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when the number of instruments
	 * in a specific directory has changed.
	 */
	public void
	instrumentCountChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when the settings of an instrument are changed.
	 */
	public void
	instrumentInfoChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when an instrument is renamed.
	 */
	public void
	instrumentNameChanged(InstrumentsDbEvent e) { }
	
	/**
	 * Invoked when the status of particular job has changed.
	 */
	public void
	jobStatusChanged(InstrumentsDbEvent e) { }
}
