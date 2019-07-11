/* (c) 2019 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.api.styles;

import org.geoserver.api.OGCApiTestSupport;
import org.geoserver.catalog.WorkspaceInfo;
import org.geoserver.data.test.SystemTestData;

public class StylesTestSupport extends OGCApiTestSupport {

    @Override
    protected void setUpTestData(SystemTestData testData) throws Exception {
        // no actual need for data
    }

    @Override
    protected void onSetUp(SystemTestData testData) throws Exception {
        // add a work-spaced style
        testData.addWorkspace("ws", "http://www.geoserver.org/ws", getCatalog());
        WorkspaceInfo ws = getCatalog().getWorkspaceByName("ws");
        testData.addStyle(ws, "NamedPlaces", "NamedPlaces.sld", SystemTestData.class, getCatalog());
    }
}
