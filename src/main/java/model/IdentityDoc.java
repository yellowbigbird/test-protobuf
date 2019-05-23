package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class IdentityDoc {
    @Tag(1)
    @Valid
    @NotNull(message = "docNumber NotNull.")
    @JsonProperty("docNumber")
    private String docNumber;

    @Tag(2)
    @Valid
    @JsonProperty("expiryDate")
    private Date expiryDate; // todo

    @Tag(3)
    @Valid
    @NotNull(message = "identityDocTypeCode NotNull.")
    @JsonProperty("identityDocTypeCode")
    private String identityDocTypeCode;

    @Tag(4)
    @Valid
    @JsonProperty("issueDate")
    private Date issueDate; //todo

    @Tag(5)
    @Valid
    @JsonProperty("issuingCountryCode")
    private String issuingCountryCode;

    @Tag(6)
    @Valid
    @JsonProperty("residenceCountryCode")
    private String residenceCountryCode;
}
