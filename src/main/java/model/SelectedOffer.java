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
public class SelectedOffer {
    @Tag(2)
    @Valid
    @NotNull(message = "offerId NotNull.")
    @JsonProperty("offerId")
    private String offerId;

    @Tag(1)
    @Valid
    @JsonProperty("selectedOfferItems")
    private List<SelectedOfferItem> selectedOfferItems;

}
