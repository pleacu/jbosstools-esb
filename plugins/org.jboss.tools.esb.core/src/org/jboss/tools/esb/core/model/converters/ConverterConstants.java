/******************************************************************************* 
 * Copyright (c) 2007 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.tools.esb.core.model.converters;

import org.jboss.tools.esb.core.model.ESBConstants;

/**
 * @author Viacheslav Kabanovich
 */
public interface ConverterConstants {
	String ALIAS_ENTITY = "ESBPreAlias";
	String ALIASES = "aliases";
	IPropertyConverter ALIAS_CONVERTER = new BasicListConverter(ALIASES, ALIAS_ENTITY);

	String ROUTE_TO_ENTITY = "ESBPreRouteTo";
	String DESTINATIONS = "destinations";
	IPropertyConverter ROUTE_CONVERTER = new BasicListConverter(DESTINATIONS, ROUTE_TO_ENTITY);

	String OBJECT_PATH_ENTITY = "ESBPreObjectPath";
	String OBJECT_PATHS = "object-paths";
	IPropertyConverter OBJECT_PATHS_CONVERTER = new BasicListConverter(OBJECT_PATHS, OBJECT_PATH_ENTITY);

	IPropertyConverter NOTIFICATION_CONVERTER = new BasicListConverter(DESTINATIONS, ESBConstants.ENT_ESB_NOTIFICATION);
	IPropertyConverter NOTIFICATION_CONVERTER_2 = new NotificationListConverter(DESTINATIONS, ESBConstants.ENT_ESB_NOTIFICATION_120);

	String BPM_VAR_ENTITY = "ESBPreBPMVar";
	String BPM_VARS = "esbToBpmVars";
	IPropertyConverter BPM_VAR_CONVERTER = new BasicListConverter(BPM_VARS, BPM_VAR_ENTITY);

	String BPM_PARAM_ENTITY = "ESBPreBPMParam";
	String BPM_PARAMS = "esbToBpmParams";
	IPropertyConverter BPM_PARAM_CONVERTER = new BasicListConverter(BPM_PARAMS, BPM_PARAM_ENTITY);

	String HTTP_CLIENT_PROP_ENTITY = "ESBPreClientProp";
	String END_POINT_URL = "endpointUrl";
	IPropertyConverter ENDPOINT_CONVERTER = new EndpointConverter();

	String HEADER_ENTITY = "ESBPreHeader";
	String HEADERS = "headers";
	IPropertyConverter HEADER_CONVERTER = new BasicListConverter(HEADERS, HEADER_ENTITY);

	String NAMESPACE_ENTITY = "ESBPreNamespace";
	String NAMESPACES = "namespaces";
	IPropertyConverter NAMESPACES_CONVERTER = new BasicListConverter(NAMESPACES, NAMESPACE_ENTITY);

	String ROUTER_NAMESPACE_ENTITY = "ESBPreRouterNamespace";
	String ROUTER_NAMESPACES = "namespaces";
	IPropertyConverter ROUTER_NAMESPACES_CONVERTER = new BasicListConverter(ROUTER_NAMESPACES, ROUTER_NAMESPACE_ENTITY);

	String FIELD_ALIAS_ENTITY = "ESBPreFieldAlias";
	String FIELD_ALIASES = "fieldAliases";
	IPropertyConverter FIELD_ALIAS_CONVERTER = new BasicListConverter(FIELD_ALIASES, FIELD_ALIAS_ENTITY);

	String IMPLICIT_COLLECTION_ENTITY = "ESBPreImplicitCollection";
	String IMPLICIT_COLLECTIONS = "implicit-collections";
	IPropertyConverter IMPLICIT_COLLECTION_CONVERTER = new BasicListConverter(IMPLICIT_COLLECTIONS, IMPLICIT_COLLECTION_ENTITY);

	String CONVERTER_ENTITY = "ESBPreConverter";
	String CONVERTERS = "converters";
	IPropertyConverter CONVERTER_CONVERTER = new BasicListConverter(CONVERTERS, CONVERTER_ENTITY);

	String ATTRIBUTE_ALIAS_ENTITY = "ESBPreAttributeAlias";
	String ATTRIBUTE_ALIASES = "attribute-aliases";
	IPropertyConverter ATTRIBUTE_ALIAS_CONVERTER = new BasicListConverter(ATTRIBUTE_ALIASES, ATTRIBUTE_ALIAS_ENTITY);

	String EJB_PARAM_ENTITY = "ESBPreEJBParam";
	String EJB_PARAMS = "ejb-params";
	IPropertyConverter EJB_PARAM_CONVERTER = new EJBParamConverter(EJB_PARAMS, EJB_PARAM_ENTITY);

	String SEND_TO_ENTITY = "ESBPreSendTo";
	String CHANNELS = "channels";
	IPropertyConverter CHANNELS_CONVERTER = new BasicListConverter(CHANNELS, SEND_TO_ENTITY);

}
