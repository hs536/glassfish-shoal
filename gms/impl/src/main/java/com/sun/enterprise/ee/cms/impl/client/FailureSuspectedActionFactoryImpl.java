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

package com.sun.enterprise.ee.cms.impl.client;

import com.sun.enterprise.ee.cms.core.Action;
import com.sun.enterprise.ee.cms.core.CallBack;
import com.sun.enterprise.ee.cms.core.FailureSuspectedActionFactory;

/**
 * Reference implementation of FailureSuspectedActionFactory
 * @author Shreedhar Ganapathy
 *         Date: Sep 21, 2005
 * @version $Revision$
 */
public class FailureSuspectedActionFactoryImpl implements
                                               FailureSuspectedActionFactory
 {
    private final CallBack cb;
    public FailureSuspectedActionFactoryImpl(final CallBack cb){
        this.cb = cb;
    }
    /**
     * Produces an Action instance.
     * @return com.sun.enterprise.ee.cms.Action
     */
    public Action produceAction() {
        return new FailureSuspectedActionImpl(cb);
    }

}
