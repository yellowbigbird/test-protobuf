package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class PriceBreakdown {
    @Tag(1)
    @Valid
    @JsonProperty("cardSurcharge")
    private CardSurcharge cardSurcharge;

    @Tag(2)
    @Valid
    @JsonProperty("pricedItems")
    private List<PricedItem> pricedItemList;
}
