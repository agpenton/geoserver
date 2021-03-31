/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.wfs.xml.v1_1_0;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import net.opengis.wfs.GetFeatureWithLockType;
import net.opengis.wfs.QueryType;
import net.opengis.wfs.ResultTypeType;
import net.opengis.wfs.WfsFactory;
import org.eclipse.emf.common.util.EList;
import org.geotools.xsd.AbstractComplexBinding;
import org.geotools.xsd.ElementInstance;
import org.geotools.xsd.Node;

/**
 * Binding object for the type http://www.opengis.net/wfs:GetFeatureWithLockType.
 *
 * <p>
 *
 * <pre>
 *         <code>
 *  &lt;xsd:complexType name="GetFeatureWithLockType"&gt;
 *      &lt;xsd:annotation&gt;
 *          &lt;xsd:documentation&gt;
 *              A GetFeatureWithLock request operates identically to a
 *              GetFeature request expect that it attempts to lock the
 *              feature instances in the result set and includes a lock
 *              identifier in its response to a client.  A lock identifier
 *              is an identifier generated by a Web Feature Service that
 *              a client application can use, in subsequent operations,
 *              to reference the locked set of feature instances.
 *           &lt;/xsd:documentation&gt;
 *      &lt;/xsd:annotation&gt;
 *      &lt;xsd:complexContent&gt;
 *          &lt;xsd:extension base="wfs:BaseRequestType"&gt;
 *              &lt;xsd:sequence&gt;
 *                  &lt;xsd:element maxOccurs="unbounded" ref="wfs:Query"/&gt;
 *              &lt;/xsd:sequence&gt;
 *              &lt;xsd:attribute default="5" name="expiry"
 *                  type="xsd:positiveInteger" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       The expiry attribute is used to set the length
 *                       of time (expressed in minutes) that features will
 *                       remain locked as a result of a GetFeatureWithLock
 *                       request.  After the expiry period elapses, the
 *                       locked resources must be released.  If the
 *                       expiry attribute is not set, then the default
 *                       value of 5 minutes will be enforced.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute default="results" name="resultType"
 *                  type="wfs:ResultTypeType" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       See definition of wfs:GetFeatureType.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute default="text/xml; subtype=gml/3.1.1"
 *                  name="outputFormat" type="xsd:string" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       See definition of wfs:GetFeatureType.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="maxFeatures" type="xsd:positiveInteger" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       See definition of wfs:GetFeatureType.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="traverseXlinkDepth" type="xsd:string" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       See definition of wfs:GetFeatureType.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="traverseXlinkExpiry"
 *                  type="xsd:positiveInteger" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       See definition of wfs:GetFeatureType.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *          &lt;/xsd:extension&gt;
 *      &lt;/xsd:complexContent&gt;
 *  &lt;/xsd:complexType&gt;
 *
 *          </code>
 *         </pre>
 *
 * @generated
 */
public class GetFeatureWithLockTypeBinding extends AbstractComplexBinding {
    WfsFactory wfsfactory;

    public GetFeatureWithLockTypeBinding(WfsFactory wfsfactory) {
        this.wfsfactory = wfsfactory;
    }

    /** @generated */
    @Override
    public QName getTarget() {
        return WFS.GETFEATUREWITHLOCKTYPE;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Class<GetFeatureWithLockType> getType() {
        return GetFeatureWithLockType.class;
    }

    /**
     *
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated modifiable
     */
    @Override
    public Object parse(ElementInstance instance, Node node, Object value) throws Exception {
        GetFeatureWithLockType getFeatureWithLock = wfsfactory.createGetFeatureWithLockType();

        // &lt;xsd:element maxOccurs="unbounded" ref="wfs:Query"/&gt;
        @SuppressWarnings("unchecked")
        EList<QueryType> query = getFeatureWithLock.getQuery();
        query.addAll(node.getChildValues(QueryType.class));

        // &lt;xsd:attribute default="5" name="expiry" type="xsd:positiveInteger" use="optional"&gt;
        if (node.hasAttribute("expiry")) {
            getFeatureWithLock.setExpiry((BigInteger) node.getAttributeValue("expiry"));
        }

        // &lt;xsd:attribute default="results" name="resultType" type="wfs:ResultTypeType"
        // use="optional"&gt;
        if (node.hasAttribute("resultType")) {
            getFeatureWithLock.setResultType((ResultTypeType) node.getAttributeValue("resultType"));
        }

        // &lt;xsd:attribute default="text/xml; subtype=gml/3.1.1"
        //		name="outputFormat" type="xsd:string" use="optional"&gt;
        if (node.hasAttribute("outputFormat")) {
            getFeatureWithLock.setOutputFormat((String) node.getAttributeValue("outputFormat"));
        }

        // &lt;xsd:attribute name="maxFeatures" type="xsd:positiveInteger" use="optional"&gt;
        if (node.hasAttribute("maxFeatures")) {
            getFeatureWithLock.setMaxFeatures((BigInteger) node.getAttributeValue("maxFeatures"));
        }

        // &lt;xsd:attribute name="traverseXlinkDepth" type="xsd:string" use="optional"&gt;
        if (node.hasAttribute("traverseXlinkDepth")) {
            getFeatureWithLock.setTraverseXlinkDepth(
                    (String) node.getAttributeValue("traverseXlinkDepth"));
        }

        // &lt;xsd:attribute name="traverseXlinkExpiry"
        //		type="xsd:positiveInteger" use="optional"&gt;
        if (node.hasAttribute("traverseXlinkExpiry")) {
            getFeatureWithLock.setTraverseXlinkExpiry(
                    (BigInteger) node.getAttributeValue("traverseXlinkExpiry"));
        }

        return getFeatureWithLock;
    }
}
