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
 * Provides general information about LinuxSampler instance.
 * @author Grigor Iliev
 */
public final class ServerInfo implements Parseable {
	private String desc = null;
	private String ver = null;
	private String protoVer = null;
	private boolean instrumentsDbSupport = false;

	/** Creates a new instance of <code>ServerInfo</code>. */
	public
	ServerInfo() { }
	
	/**
	 * Creates a new instance of <code>ServerInfo</code> and parses the information
	 * described by <code>resultSet</code>.
	 * @param resultSet An array with information categories about a sampler.
	 */
	public
	ServerInfo(String[] resultSet) {
		for(String s : resultSet)
			if(!parse(s)) Client.getLogger().info(LscpI18n.getLogMsg("unknownLine", s));
	}
	
	/**
	 * Gets description about the sampler.
	 * @return Description about the sampler.
	 */
	public String
	getDescription() { return desc; }
	
	/**
	 * Gets the version of the sampler.
	 * @return The version of the sampler.
	 */
	public String
	getVersion() { return ver; }
	
	/**
	 * Gets the version of the LSCP protocol.
	 * @return The version of the LSCP protocol.
	 */
	public String
	getProtocolVersion() { return protoVer; }
	
	/**
	 * Determines whether the backend is
	 * build with instruments database support.
	 */
	public boolean
	hasInstrumentsDbSupport() { return instrumentsDbSupport; }
	
	/**
	 * Parses a line of text.
	 * @param s The string to be parsed.
	 * @return <code>true</code> if the line has been processed, <code>false</code> otherwise.
	 */
	public boolean
	parse(String s) {
		if(s.startsWith("DESCRIPTION: ")) {
			desc = s.substring("DESCRIPTION: ".length());
			desc = Parser.toNonEscapedString(desc);
		} else if(s.startsWith("VERSION: ")) {
			ver = s.substring("VERSION: ".length());
		} else if(s.startsWith("PROTOCOL_VERSION: ")) {
			protoVer = s.substring("PROTOCOL_VERSION: ".length());
		} else if(s.startsWith("INSTRUMENTS_DB_SUPPORT: ")) {
			s = s.substring("INSTRUMENTS_DB_SUPPORT: ".length());
			if(s.equalsIgnoreCase("yes")) instrumentsDbSupport = true;
		} else return false;
		
		return true;
	}
}
