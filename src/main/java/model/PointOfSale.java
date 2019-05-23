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
public class PointOfSale {
    @Tag(1)
    @Valid
    @JsonProperty("deviceInfo")
    private DeviceInfo deviceInfo;

    @Tag(2)
    @Valid
    @JsonProperty("location")
    private Location location;

    @Tag(3)
    @Valid
    @NotNull(message = "market NotNull.")
    @JsonProperty("market")
    private String market;
}
