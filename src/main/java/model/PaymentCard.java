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
public class PaymentCard {
    @Tag(1)
    @Valid
    @JsonProperty("cardBrandCode")
    private String cardBrandCode;

    @Tag(2)
    @Valid
    @JsonProperty("cardProductTypeCode")
    private String cardProductTypeCode;

    @Tag(3)
    @Valid
    @JsonProperty("cardTypeText")
    private String cardTypeText;

    @Tag(4)
    @Valid
    @NotNull(message = "encryptedCardNumber NotNull.")
    @JsonProperty("encryptedCardNumber")
    private String encryptedCardNumber;

    @Tag(5)
    @Valid
    @NotNull(message = "encryptedCardSecurityCode NotNull.")
    @JsonProperty("encryptedCardSecurityCode")
    private String encryptedCardSecurityCode;

    @Tag(6)
    @Valid
    @JsonProperty("expirationDate")
    private String expirationDate;

    @Tag(7)
    @Valid
    @JsonProperty("holderContact")
    private ContactInfo holderContact;

    @Tag(8)
    @Valid
    @NotNull(message = "holderName NotNull.")
    @JsonProperty("holderName")
    private Name holderName;
}
