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
import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PRIVATE)
public class Description {
    @Tag(1)
    @Valid
    @JsonProperty("link")
    private String link;

    @Tag(2)
    @Valid
    @NotNull(message = "text NotNull.")
    @Size(min = 1, message = "text Size(1,).")
    @JsonProperty("text")
    private String text;
}
