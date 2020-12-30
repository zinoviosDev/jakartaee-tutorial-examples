/*
 * Copyright (c) 2014, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.tutorial.simplegreeting;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Greeting {
    public String greet(String name) {
        return "Hello, " + name + ".";
    }
}
