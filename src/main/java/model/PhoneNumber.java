package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class PhoneNumber {
    @Tag(1)
    @Valid
    @JsonProperty("areaCode")
    private String areaCode;

    @Tag(2)
    @Valid
    @JsonProperty("countryCode")
    private String countryCode;

    @Tag(3)
    @Valid
    @NotBlank(message = "PhoneNumber.phoneNumber NotBlank.")
    @JsonProperty("phoneNumber")
    private String phoneNumberCode;
}
