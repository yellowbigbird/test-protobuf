package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class Leg {
    @Tag(1)
    @Valid
    @JsonProperty("destination")
    private TransportInfo destination;

    @Tag(2)
    @Valid
    @NotNull(message = "legId NotNull.")
    @JsonProperty("legId")
    private String legID;

    @Tag(3)
    @Valid
    @JsonProperty("origin")
    private TransportInfo origin;

    @Tag(4)
    @Valid
    @NotNull(message = "segmentReferences NotNull.")
    @JsonProperty("segmentReferences")
    private List<String> segmentReferences;
}
