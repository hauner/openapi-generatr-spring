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

package com.github.hauner.openapi.core.framework

import com.github.hauner.openapi.core.model.parameters.CookieParameter
import com.github.hauner.openapi.core.model.parameters.HeaderParameter
import com.github.hauner.openapi.core.model.parameters.MultipartParameter
import com.github.hauner.openapi.core.model.parameters.Parameter
import com.github.hauner.openapi.core.model.parameters.PathParameter
import com.github.hauner.openapi.core.model.parameters.QueryParameter
import com.github.hauner.openapi.spring.model.datatypes.DataType

class FrameworkBase implements Framework {

    @Override
        Parameter createQueryParameter (com.github.hauner.openapi.spring.parser.Parameter parameter, DataType dataType) {
        new QueryParameter (
            name: parameter.name,
            required: parameter.required,
            dataType: dataType)
    }

    @Override
    Parameter createHeaderParameter (com.github.hauner.openapi.spring.parser.Parameter parameter, DataType dataType) {
        new HeaderParameter (
            name: parameter.name,
            required: parameter.required,
            dataType: dataType)
    }

    @Override
    Parameter createCookieParameter (com.github.hauner.openapi.spring.parser.Parameter parameter, DataType dataType) {
        new CookieParameter (
            name: parameter.name,
            required: parameter.required,
            dataType: dataType)
    }

    @Override
    Parameter createPathParameter (com.github.hauner.openapi.spring.parser.Parameter parameter, DataType dataType) {
        new PathParameter (
            name: parameter.name,
            required: parameter.required,
            dataType: dataType)
    }

    @Override
    Parameter createMultipartParameter (com.github.hauner.openapi.spring.parser.Parameter parameter, DataType dataType) {
        new MultipartParameter (
            name: parameter.name,
            required: parameter.required,
            dataType: dataType)
    }

}