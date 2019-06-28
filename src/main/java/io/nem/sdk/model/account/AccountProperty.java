/*
 * Copyright 2019 NEM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.nem.sdk.model.account;

import java.util.List;

/**
 * Account property structure describes property information.
 */
public class AccountProperty {

	private final PropertyType propertyType;
	private final List<Object> values;

	public AccountProperty(PropertyType propertyType, List<Object> values) {
		this.propertyType = propertyType;
		this.values = values;
	}

	public PropertyType getPropertyType() {
		return propertyType;
	}

	public List<Object> getValues() {
		return values;
	}
}