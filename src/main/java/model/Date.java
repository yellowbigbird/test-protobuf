package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
//@JsonInclude(NON_NULL)
@ToString
@NoArgsConstructor(access = PUBLIC)
public class Date {
    @Tag(1)
    @Valid
    @NotNull(message = "year NotNull.")
    @Min(value = 1900, message = "year Min.")
    @Max(value = 2200, message = "year Max.")
    @JsonProperty("year")
    private Integer year;

    @Tag(3)
    @Valid
    @NotNull(message = "month NotNull.")
    @Min(value = 1, message = "month Min.")
    @Max(value = 12, message = "month Max.")
    @JsonProperty("month")
    private Integer month;

    @Tag(2)
    @Valid
    @NotNull(message = "day NotNull.")
    @Min(value = 0, message = "day Min.")
    @Max(value = 31, message = "day Max.")
    @JsonProperty("day")
    private Integer day;
}
