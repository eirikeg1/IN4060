/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.rdf.model.test;

import java.util.Arrays;
import java.util.List;

import org.apache.jena.rdf.model.Model ;
import org.apache.jena.rdf.model.Statement ;
import org.apache.jena.rdf.model.test.helpers.ModelHelper ;
import org.apache.jena.rdf.model.test.helpers.TestingModelFactory ;
import org.junit.Assert;

/**
 * Tests of the Model-level bulk update API.
 */

public class TestModelBulkUpdate extends AbstractModelTestBase {
    public TestModelBulkUpdate(final TestingModelFactory modelFactory, final String name) {
        super(modelFactory, name);
    }

    public void testBulkByModel() {
        Assert.assertEquals("precondition: model must be empty", 0, model.size());
        final Model A = ModelHelper.modelWithStatements(this, "clouds offer rain; trees offer shelter");
        final Model B = ModelHelper.modelWithStatements(this, "x R y; y Q z; z P x");
        model.add(A);
        ModelHelper.assertIsoModels(A, model);
        model.add(B);
        model.remove(A);
        ModelHelper.assertIsoModels(B, model);
        model.remove(B);
        Assert.assertEquals("", 0, model.size());
    }

    public void testBulkRemoveSelf() {
        final Model m = ModelHelper.modelWithStatements(this, "they sing together; he sings alone");
        m.remove(m);
        Assert.assertEquals("", 0, m.size());
    }

    public void testContains(final Model m, final List<Statement> statements) {
        for ( Statement statement : statements ) {
            Assert.assertTrue("it should be here", m.contains(statement));
        }
    }

    public void testContains(final Model m, final Statement[] statements) {
        for ( final Statement statement : statements ) {
            Assert.assertTrue("it should be here", m.contains(statement));
        }
    }

    public void testMBU() {
        final Statement[] sArray = ModelHelper.statements(model, "moon orbits earth; earth orbits sun");
        final List<Statement> sList = Arrays.asList(ModelHelper.statements(model, "I drink tea; you drink coffee"));
        model.add(sArray);
        testContains(model, sArray);
        model.add(sList);
        testContains(model, sList);
        testContains(model, sArray);
        /* */
        model.remove(sArray);
        testOmits(model, sArray);
        testContains(model, sList);
        model.remove(sList);
        testOmits(model, sArray);
        testOmits(model, sList);
    }

    public void testOmits(final Model m, final List<Statement> statements) {
        for ( Statement statement : statements ) {
            Assert.assertFalse("it should not be here", m.contains(statement));
        }
    }

    public void testOmits(final Model m, final Statement[] statements) {
        for ( final Statement statement : statements ) {
            Assert.assertFalse("it should not be here", m.contains(statement));
        }
    }
}
