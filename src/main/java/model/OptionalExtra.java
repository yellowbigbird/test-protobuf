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
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class OptionalExtra {
    @Tag(1)
    @Valid
    @JsonProperty("description")
    private Description description;

    @Tag(2)
    @Valid
    @NotNull(message = "OptionalExtra.id NotNull.")
    @JsonProperty("id")
    private String id;

    @Tag(3)
    @Valid
    @JsonProperty("legReferences")
    private List<String> legReferences;

    @Tag(4)
    @Valid
    @JsonProperty("name")
    private String name;

    @Tag(5)
    @Valid
    @JsonProperty("segmentReferences")
    private List<String> segmentReferences;

    @Tag(7)
    @Valid
    @JsonProperty("travelerReferences")
    private List<String> travelerReferences;

    @Tag(8)
    @Valid
    @JsonProperty("price")
    private Price price;
}
