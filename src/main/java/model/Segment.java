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
public class Segment {
    @Tag(6)
    @Valid
    @NotNull(message = "segmentId NotNull.")
    @JsonProperty("segmentId")
    private String segmentID;

    @Tag(1)
    @Valid
    @NotNull(message = "arrival NotNull.")
    @JsonProperty("arrival")
    private TransportInfo arrival;

    @Tag(2)
    @Valid
    @NotNull(message = "departure NotNull.")
    @JsonProperty("departure")
    private TransportInfo departure;

    @Tag(3)
    @Valid
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;

    @Tag(4)
    @Valid
    @JsonProperty("marketingCarrierInfo")
    private Carrier marketingCarrierInfo;

    @Tag(5)
    @Valid
    @JsonProperty("operatingCarrierInfo")
    private Carrier operatingCarrierInfo;

    @Tag(7)
    @Valid
    @JsonProperty("serviceClassCode")
    private String serviceClassCode;
}
