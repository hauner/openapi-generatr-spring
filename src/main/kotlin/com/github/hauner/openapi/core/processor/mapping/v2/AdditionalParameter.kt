/*
 * Copyright 2020 the original authors
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

package com.github.hauner.openapi.core.processor.mapping.v2

/**
 * a "parameters:" add parameter entry in the mapping yaml
 *
 *  @author Martin Hauner
 */
data class AdditionalParameter(

    /**
     * the mapping of an additional parameter name to target, ie a mapping string like:
     *
     * foo => mapping.Bar
     */
    val add: String,

    /**
     * (optional) generic parameters of {@link #name} target
     */
    val generics: List<String>?

): Parameter {}