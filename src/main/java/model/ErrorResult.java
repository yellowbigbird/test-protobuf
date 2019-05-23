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
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
public class ErrorResult {
    @Tag(1)
    @Valid
    @NotNull(message = "errorCodeText NotNull.")
    @JsonProperty("errorCodeText")
    private String errorCodeText;

    @Tag(2)
    @Valid
    @NotNull
    @JsonProperty("errorDesc")
    private String errorDesc;

    @Tag(3)
    @Valid
    @NotNull
    @JsonProperty("skyCode")
    private String skyCode;
}
