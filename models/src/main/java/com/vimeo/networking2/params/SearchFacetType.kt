package com.vimeo.networking2.params

import com.vimeo.networking2.enums.StringValue

/**
 * The search options for the facets requested in the result list.
 */
enum class SearchFacetType(override val value: String?) : StringValue {
    TYPE("type"),
    CATEGORY("category"),
    DURATION("duration"),
    LICENSE("license"),
    UPLOADED("uploaded"),
    USER_TYPE("user_type")
}
