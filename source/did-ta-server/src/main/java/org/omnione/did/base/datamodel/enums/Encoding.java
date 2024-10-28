/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.base.datamodel.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.annotations.SerializedName;

/**
 * Enum class for the ENCODING in Data Specification documentation.
 */
public enum Encoding {
    @SerializedName("UTF-8")
    UTF_8("UTF-8"),
    @SerializedName("UTF-16")
    UTF_16("UTF-16"),
    @SerializedName("EUC-KR")
    EUC_KR("EUC-KR"),
    @SerializedName("ASCII")
    ASCII("ASCII");

    private final String displayName;

    Encoding(String displayName) {
        this.displayName = displayName;
    }
    @Override
    @JsonValue
    public String toString() {
        return displayName;
    }

}