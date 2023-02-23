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
 * The listener interface that is notified when
 * the global settings of the sampler are changed.
 * @author Grigor Iliev
 */
public interface GlobalInfoListener extends java.util.EventListener {
	/** Invoked when the global volume of the sampler is changed. */
	public void volumeChanged(GlobalInfoEvent e);
	
	/** Invoked when the global sampler-wide limit of maximum voices is changed. */
	public void voiceLimitChanged(GlobalInfoEvent e);
	
	/** Invoked when the global sampler-wide limit of maximum disk streams is changed. */
	public void streamLimitChanged(GlobalInfoEvent e);
}
