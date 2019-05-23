package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class Country {
    // todo: pattern
    @Tag(1)
    @Valid
    @NotNull(message = "countryCode NotNull.")
    @JsonProperty("countryCode")
    private String countryCode;

    @Tag(2)
    @Valid
    @JsonProperty("countryName")
    private String countryName;
}
