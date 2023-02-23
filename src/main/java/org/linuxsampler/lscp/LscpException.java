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

package org.linuxsampler.lscp;

/**
 * Thrown to indicate unexpected error in the LinuxSampler control protocol.
 * @author  Grigor Iliev
 */
public class LscpException extends Exception {
	
	/** Creates a new instance of LscpException with empty detail message. */
	public
	LscpException() { super(""); }
	
	/** 
	 * Creates a new instance of LscpException with the specified detail message.
	 * @param msg The detail message.
	 */
	public
	LscpException(String msg) { super(msg); }
	
	/** 
	 * Creates a new instance of LscpException with the specified cause
	 * and a detail message of <code>(cause==null ? null : cause.toString())</code>.
	 * @param cause The cause.
	 */
	public
	LscpException(Throwable cause) { super(cause); }
	
	/** 
	 * Creates a new instance of LscpException with the specified detail message and cause.
	 * @param msg The detail message.
	 * @param cause The cause.
	 */
	public
	LscpException(String msg, Throwable cause) { super(msg, cause); }
}
