/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteRouteTable(DeleteRouteTableRequest) DeleteRouteTable operation}.
 * <p>
 * Deletes a route table from a VPC. The route table must not be
 * associated with a subnet. You can't delete the main route table. For
 * more information about route tables, go to <a
 * azonwebservices.com/AmazonVPC/latest/UserGuide/VPC_Route_Tables.html">
 * Route Tables </a> in the Amazon Virtual Private Cloud User Guide.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteRouteTable(DeleteRouteTableRequest)
 */
public class DeleteRouteTableRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the route table to be deleted.
     */
    private String routeTableId;

    /**
     * The ID of the route table to be deleted.
     *
     * @return The ID of the route table to be deleted.
     */
    public String getRouteTableId() {
        return routeTableId;
    }
    
    /**
     * The ID of the route table to be deleted.
     *
     * @param routeTableId The ID of the route table to be deleted.
     */
    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }
    
    /**
     * The ID of the route table to be deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableId The ID of the route table to be deleted.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteRouteTableRequest withRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("RouteTableId: " + routeTableId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    