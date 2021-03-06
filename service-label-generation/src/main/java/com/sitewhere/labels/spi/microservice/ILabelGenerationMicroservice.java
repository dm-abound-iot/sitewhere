/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.labels.spi.microservice;

import com.sitewhere.grpc.client.spi.client.IAssetManagementApiChannel;
import com.sitewhere.grpc.client.spi.client.IDeviceManagementApiChannel;
import com.sitewhere.labels.spi.grpc.ILabelGenerationGrpcServer;
import com.sitewhere.spi.asset.IAssetManagement;
import com.sitewhere.spi.device.IDeviceManagement;
import com.sitewhere.spi.microservice.MicroserviceIdentifier;
import com.sitewhere.spi.microservice.multitenant.IMultitenantMicroservice;

/**
 * Microservice that provides label generation functionality.
 * 
 * @author Derek
 */
public interface ILabelGenerationMicroservice
	extends IMultitenantMicroservice<MicroserviceIdentifier, ILabelGenerationTenantEngine> {

    /**
     * Get label generation GRPC server.
     * 
     * @return
     */
    public ILabelGenerationGrpcServer getLabelGenerationGrpcServer();

    /**
     * Get device management API access via GRPC channel.
     * 
     * @return
     */
    public IDeviceManagementApiChannel<?> getDeviceManagementApiChannel();

    /**
     * Caching wrapper around device management API channel.
     * 
     * @return
     */
    public IDeviceManagement getCachedDeviceManagement();

    /**
     * Get asset management API access via GRPC channel.
     * 
     * @return
     */
    public IAssetManagementApiChannel<?> getAssetManagementApiChannel();

    /**
     * Get wrapper for caching data from the asset management API channel.
     * 
     * @return
     */
    public IAssetManagement getCachedAssetManagement();
}