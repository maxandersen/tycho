/*******************************************************************************
 * Copyright (c) 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.p2.tools;

import java.io.File;

public class DestinationRepositoryDescriptor {
    final File location;
    final String name;

    public DestinationRepositoryDescriptor(File location, String name) {
        this.location = location;
        this.name = name;
    }

    public File getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

}