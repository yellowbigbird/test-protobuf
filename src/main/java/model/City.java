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
public class City {
    @Tag(1)
    @Valid
    @JsonProperty("cityName")
    private String cityName;

    //    @Pattern(regexp = "^(.+)@(.+)$",message = "iataLocationCode Pattern.") // todo: pattern
    @Tag(2)
    @Valid
    @NotNull(message = "iataLocationCode NotNull.")
    @JsonProperty("iataLocationCode")
    private String iataLocationCode;
}
