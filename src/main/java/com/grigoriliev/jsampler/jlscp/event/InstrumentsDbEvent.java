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
 *
 * @author Grigor Iliev
 */
public class InstrumentsDbEvent extends java.util.EventObject {
	private String pathName;
	private String newName;
	private int jobId;
	
	
	/**
	 * Constructs an <code>InstrumentsDbEvent</code> object.
	 * @param source The object that originated the event.
	 * @param pathName Depending on the event this is
	 * the absolute path name of either a directory, or an instrument.
	 */
	public
	InstrumentsDbEvent(Object source, String pathName) {
		this(source, pathName, null);
	}
	
	/**
	 * Constructs an <code>InstrumentsDbEvent</code> object.
	 * @param source The object that originated the event.
	 * @param pathName Depending on the event this is
	 * the absolute (escaped) path name of either a directory, or an instrument.
	 * @param newName When an instrument or directory is renamed,
	 * specifies the new (non-escaped) name for the respective instrument or directory.
	 */
	public
	InstrumentsDbEvent(Object source, String pathName, String newName) {
		super(source);
		this.pathName = pathName;
		this.newName = newName;
	}
	
	/**
	 * Constructs an <code>InstrumentsDbEvent</code> object.
	 * @param source The object that originated the event.
	 * @param jobId The job ID.
	 */
	public
	InstrumentsDbEvent(Object source, int jobId) {
		super(source);
		this.jobId = jobId;
	}
	
	/**
	 * Gets the (escaped) path name of the changed instrument or directory.
	 */
	public String
	getPathName() { return pathName; }
	
	/**
	 * When an instrument or directory is renamed, this method
	 * returns the new (non-escaped) name for the respective instrument or directory.
	 */
	public String
	getNewName() { return newName; }
	
	/**
	 * Returns the ID of the job, which status has changed.
	 */
	public int
	getJobId() { return jobId; }
}
