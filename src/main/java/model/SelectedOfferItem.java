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
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class SelectedOfferItem {
    @Tag(1)
    @Valid
    @JsonProperty("legReferences")
    private List<String> legReferences;

    @Tag(2)
    @Valid
    @NotNull(message = "offerItemId NotNull.")
    @JsonProperty("offerItemId")
    private String offerItemId;

    @Tag(3)
    @Valid
    @JsonProperty("segmentReferences")
    private List<String> segmentReferences;

    @Tag(4)
    @Valid
    @JsonProperty("travelerReferences")
    private List<String> travelerReferences;
}
