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
public class Carrier {
    @Tag(1)
    @Valid
    @JsonProperty("carrierCode")
    private String carrierCode;

    @Tag(2)
    @Valid
    @JsonProperty("carrierName")
    private String carrierName;

    @Tag(3)
    @Valid
    @JsonProperty("flightNumberText")
    private String flightNumberText;

    @Tag(4)
    @Valid
    @JsonProperty("skyscannerCarrierId")
    private String skyscannerCarrierId;
}
