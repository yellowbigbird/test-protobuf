package model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class ContactInfo {
    @Tag(1)
    @Valid
    @NotBlank(message = "ContactInfo.contactEmail NotBlank.")
    @JsonProperty("contactEmail")
    private String contactEmail;

    @Tag(2)
    @Valid
    @NotNull(message = "phoneInfo NotNull.")
    @JsonProperty("phoneInfo")
    private PhoneNumber phoneInfo;

    @Tag(3)
    @Valid
    @JsonProperty("postalAddress")
    private PostalAddress postalAddress;
}
