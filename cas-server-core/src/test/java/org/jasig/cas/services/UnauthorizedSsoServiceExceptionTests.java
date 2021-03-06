/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.services;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Misagh Moayyed
 * @since 4.0.0
 */
public class UnauthorizedSsoServiceExceptionTests {

    private static final String CODE = "service.not.authorized.sso";
    private static final String MESSAGE = "GG";

    @Test
    public void verifyGetCode() {
        final UnauthorizedSsoServiceException e = new UnauthorizedSsoServiceException();
        assertEquals(CODE, e.getMessage());
    }

    @Test
    public void verifyCodeConstructor() {
        final UnauthorizedSsoServiceException e = new UnauthorizedSsoServiceException(MESSAGE);

        assertEquals(MESSAGE, e.getMessage());
    }

    @Test
    public void verifyThrowableConstructorWithCode() {
        final RuntimeException r = new RuntimeException();
        final UnauthorizedSsoServiceException e = new UnauthorizedSsoServiceException(MESSAGE, r);

        assertEquals(MESSAGE, e.getMessage());
        assertEquals(r, e.getCause());
    }
}
