package model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class CardSurcharge {
    @Tag(1)
    @Valid
    @JsonProperty("fees")
    private List<Price> fees;

    @Tag(2)
    @Valid
    @JsonProperty("percentage")
    private double percentage;

    @Tag(3)
    @Valid
    @JsonProperty("surchargeCap")
    private double surchargeCap;

    @Tag(4)
    @Valid
    @NotNull(message = "CardSurcharge.total NotNull.")
    @JsonProperty("total")
    private Price total;
}
