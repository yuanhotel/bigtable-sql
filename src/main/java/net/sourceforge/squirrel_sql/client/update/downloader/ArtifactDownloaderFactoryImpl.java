/*
 * Copyright (C) 2008 Rob Manning
 * manningr@users.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package net.sourceforge.squirrel_sql.client.update.downloader;

import java.util.List;

import net.sourceforge.squirrel_sql.client.update.gui.ArtifactStatus;
import net.sourceforge.squirrel_sql.fw.util.Utilities;

public class ArtifactDownloaderFactoryImpl implements ArtifactDownloaderFactory
{

	/**
	 * @see net.sourceforge.squirrel_sql.client.update.downloader.ArtifactDownloaderFactory#create(java.util.List)
	 */
	public ArtifactDownloader create(List<ArtifactStatus> artifactStatus) {
		Utilities.checkNull("create", "artifactStatus", artifactStatus);
		if (artifactStatus.size() == 0) {
			throw new IllegalArgumentException("create: list parameter must have one or more artifacts");
		}
		return new ArtifactDownloaderImpl(artifactStatus);
	}
}
