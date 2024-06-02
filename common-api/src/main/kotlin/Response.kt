package com.christopherbell.dev.libs

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import lombok.experimental.SuperBuilder
import org.springframework.http.HttpStatus
import java.io.Serializable


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class Response : Serializable {
    @JsonProperty("httpStatus")
    private val httpStatus: HttpStatus? = null

    @JsonProperty("messages")
    private val messages: List<Message>? = null

    @JsonProperty("success")
    private val success = false
}