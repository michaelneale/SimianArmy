// CHECKSTYLE IGNORE Javadoc
/*
 *
 *  Copyright 2012 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.simianarmy.basic;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBasicContext {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBasicContext.class);

    @Test
    public void testContext() {
        BasicContext ctx = new BasicContext();
        Assert.assertNotNull(ctx.scheduler());
        Assert.assertNotNull(ctx.calendar());
        Assert.assertNotNull(ctx.configuration());
        Assert.assertNotNull(ctx.cloudClient());
        Assert.assertNotNull(ctx.chaosCrawler());
        Assert.assertNotNull(ctx.chaosInstanceSelector());
    }
}
