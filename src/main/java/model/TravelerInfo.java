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
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class TravelerInfo {
    @Tag(1)
    @Valid
    @JsonProperty("age")
    private Integer age;

    @Tag(2)
    @Valid
    @JsonProperty("dateOfBirth")
    private Date dateOfBirth; //todo

    enum Gender
    {
        GENDER_UNSET,
        GENDER_MALE,
        GENDER_FEMALE;
    }

    @Tag(3)
    @Valid
    @JsonProperty("gender")
    private Gender gender;

    @Tag(4)
    @Valid
    @JsonProperty("identityDoc")
    private IdentityDoc identityDoc;

    @Tag(5)
    @Valid
    @JsonProperty("lead")
    private boolean lead;

    @Tag(6)
    @Valid
    @NotNull(message = "name NotNull.")
    @JsonProperty("name")
    private Name name;

    enum TravelerCategoryCode
    {
        TRAVELER_CATEGORY_CODE_ADT,
        TRAVELER_CATEGORY_CODE_CHD,
        TRAVELER_CATEGORY_CODE_INF;
    }

    @Tag(7)
    @Valid
    @JsonProperty("travelerCategoryCode")
    private TravelerCategoryCode travelerCategoryCode;

    @Tag(8)
    @Valid
    @NotBlank(message = "TravelerInfo.travelerId NotBlank.")
    @JsonProperty("travelerId")
    private String travelerID;
}
