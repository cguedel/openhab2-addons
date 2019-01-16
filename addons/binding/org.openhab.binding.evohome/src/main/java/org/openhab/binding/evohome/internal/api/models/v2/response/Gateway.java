/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.evohome.internal.api.models.v2.response;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Response model for the gateway
 *
 * @author Jasper van Zuijlen - Initial contribution
 *
 */
public class Gateway {

    @SerializedName("gatewayInfo")
    private GatewayInfo gatewayInfo;

    @SerializedName("temperatureControlSystems")
    private List<TemperatureControlSystem> temperatureControlSystems;

    public GatewayInfo getGatewayInfo() {
        return gatewayInfo;
    }

    public List<TemperatureControlSystem> getTemperatureControlSystems() {
        return temperatureControlSystems;
    }

}