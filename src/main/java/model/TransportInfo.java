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
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class TransportInfo {
    // todo @pattern
    @Tag(1)
    @Valid
    @NotNull(message = "airportIataCode NotNull.")
    @JsonProperty("airportIataCode")
    private String airportIATACode;

    @Tag(2)
    @Valid
    @JsonProperty("datetime")
    private String datetime ;  //todo
}
