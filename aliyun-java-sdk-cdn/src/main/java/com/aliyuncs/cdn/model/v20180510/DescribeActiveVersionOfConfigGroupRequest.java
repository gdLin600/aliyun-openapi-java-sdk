/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveVersionOfConfigGroupRequest extends RpcAcsRequest<DescribeActiveVersionOfConfigGroupResponse> {
	   

	private Long ownerId;

	private String env;

	private String configGroupId;
	public DescribeActiveVersionOfConfigGroupRequest() {
		super("Cdn", "2018-05-10", "DescribeActiveVersionOfConfigGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putQueryParameter("Env", env);
		}
	}

	public String getConfigGroupId() {
		return this.configGroupId;
	}

	public void setConfigGroupId(String configGroupId) {
		this.configGroupId = configGroupId;
		if(configGroupId != null){
			putQueryParameter("ConfigGroupId", configGroupId);
		}
	}

	@Override
	public Class<DescribeActiveVersionOfConfigGroupResponse> getResponseClass() {
		return DescribeActiveVersionOfConfigGroupResponse.class;
	}

}
