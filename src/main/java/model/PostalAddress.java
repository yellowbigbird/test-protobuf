package model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class PostalAddress {
    @Tag(1)
    @Valid
    @JsonProperty("city")
    private String city;

    @Tag(2)
    @Valid
    @JsonProperty("countryCode")
    private String countryCode;

    @Tag(3)
    @Valid
    @JsonProperty("postalCode")
    private String postalCode;

    @Tag(4)
    @Valid
    @JsonProperty("state")
    private String state;

    @Tag(5)
    @Valid
    @JsonProperty("street")
    private String street;
}
