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
public class PricedItem {
    @Tag(1)
    @Valid
    @JsonProperty("base")
    private Fee base;

    @Tag(2)
    @Valid
    @NotNull(message = "itemId NotNull.")
    @JsonProperty("itemId")
    private String itemId;

    @Tag(3)
    @Valid
    @JsonProperty("surcharges")
    private List<Fee> surcharges;

    @Tag(4)
    @Valid
    @JsonProperty("tax")
    private List<Tax> tax;

    @Tag(5)
    @Valid
    @NotNull(message = "totalAmount NotNull.")
    @JsonProperty("totalAmount")
    private Price totalAmount;
}
