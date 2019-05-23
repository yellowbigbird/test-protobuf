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
public class PaymentInfo {
    @Tag(1)
    @Valid
    @JsonProperty("fraudDataToken")
    private String fraudDataToken;

    @Tag(2)
    @Valid
    @NotNull(message = "PaymentInfo.paymentMethod NotNull.")
    @JsonProperty("paymentMethod")
    private PaymentMethod paymentMethod;

    @Tag(3)
    @Valid
    @NotNull(message = "PaymentInfo.paymentPrice NotNull.")
    @JsonProperty("paymentPrice")
    private PaymentPrice paymentPrice;
}
