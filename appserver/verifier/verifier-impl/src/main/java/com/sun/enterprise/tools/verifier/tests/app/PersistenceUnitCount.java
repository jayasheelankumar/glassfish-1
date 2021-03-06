/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.enterprise.tools.verifier.tests.app;

import org.glassfish.deployment.common.Descriptor;
import com.sun.enterprise.deployment.Application;
import com.sun.enterprise.tools.verifier.tests.AbstractPersistenceUnitCount;


/**
 * @author bshankar@sun.com
 * @see AbstractPersistenceUnitCount
 */
public class PersistenceUnitCount extends AbstractPersistenceUnitCount {
    
    protected Application getRootDescriptor(Descriptor descriptor) {
        return Application.class.cast(descriptor);
    }
    
}

