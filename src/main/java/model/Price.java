package model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class Price {
    @Tag(1)
    @Valid
    @NotNull(message = "Price.amount NotNull.")
    @JsonProperty("amount")
    private Amount amount;

    @Tag(2)
    @Valid
    @NotNull(message = "Price.currency NotNull.")
    @Size(min = 2, max = 3, message = "Price.currency Size[2,3]")
    @JsonProperty("currency")
    private String currency;
}
