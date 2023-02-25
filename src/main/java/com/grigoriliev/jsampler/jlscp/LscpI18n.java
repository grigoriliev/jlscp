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

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;


/**
 *
 * @author  Grigor Iliev
 */
class LscpI18n {
	private static Locale currentLocale = null;
	private static Locale[] locales = {  new Locale("en", "US"), new Locale("bg", "BG") };
	
	private static ResourceBundle errors = null;
	
	public static Locale[]
	getAvailableLocales() { return locales; }
	
	public static Locale
	getCurrentLocale() {
		if(currentLocale == null) setLocale("en", "US");
		return currentLocale;
	}
	
	public static String
	getLogMsg(String s) {
		// in case that currentLocale is null
		getCurrentLocale();
		
		return errors.getString(s);
	}
	
	public static String
	getLogMsg(String pattern, Object argument) {
		Object[] args = { argument };
		return getLogMsg(pattern, args);
	}
	
	public static String
	getLogMsg(String pattern, Object[] arguments) {
		// in case that currentLocale is null
		getCurrentLocale();
		
		MessageFormat mf = new MessageFormat("");
		mf.setLocale(getCurrentLocale());
		mf.applyPattern(getLogMsg(pattern));
		return mf.format(arguments);
	}
	
	public static void
	setLocale(String language, String country) {
		currentLocale = new Locale(language, country);
		
		errors = ResourceBundle.getBundle (
			"com.grigoriliev.jsampler.jlscp.langprops.LogsBundle",
			currentLocale
		);
	}
}
