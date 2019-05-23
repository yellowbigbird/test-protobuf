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
public class PaymentPrice {
    @Tag(1)
    @Valid
    @JsonProperty("priceBreakdown")
    private PriceBreakdown priceBreakdown;

    @Tag(2)
    @Valid
    @NotNull
    @JsonProperty("totalAmount")
    private Price totalAmount;
}
