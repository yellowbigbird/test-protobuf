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
public class Name {
    @Tag(1)
    @Valid
    @NotNull(message = "firstName NotNull.")
    @JsonProperty("firstName")
    private String firstName;

    @Tag(2)
    @Valid
    @NotNull(message = "lastName NotNull.")
    @JsonProperty("lastName")
    private String lastName;

    @Tag(3)
    @Valid
    @JsonProperty("middleName")
    private String middleName;

    enum Title{
        TITLE_UNSET ,
        TITLE_MR ,
        TITLE_MS,
        TITLE_MRS,
        TITLE_MISS,
        TITLE_DR ;
    }

    @Tag(4)
    @Valid
    @JsonProperty("title")
    private Title title;
}
