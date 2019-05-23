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
public class BasicInfo {
    @Tag(1)
    @Valid
    @NotNull(message = "currency NotNull.")
    @JsonProperty("currency")
    private String currency;

    @Tag(2)
    @Valid
    @NotNull(message = "deepLink NotNull.")
    @JsonProperty("deepLink")
    private String deepLink;

    @Tag(3)
    @Valid
    @NotNull(message = "locale NotNull.")
    @JsonProperty("locale")
    private String locale;

    @Tag(4)
    @Valid
    @NotNull(message = "pointOfSale NotNull.")
    @JsonProperty("pointOfSale")
    private PointOfSale pointOfSale;

    public enum Proposition
    {
        PROPOSITION_BWS,
        PROPOSITION_DBOOK,
        PROPOSITION_UNSET;
    }

    @Tag(5)
    @Valid
    @NotNull(message = "proposition NotNull.")
    @JsonProperty("proposition")
    private Proposition proposition; // todo: protostuff enum

    @Tag(6)
    @Valid
    @NotNull(message = "testBooking NotNull.")
    @JsonProperty("testBooking")
    private boolean testBooking;

    @Tag(7)
    @Valid
    @NotNull(message = "websiteId NotNull.")
    @JsonProperty("websiteId")
    private String websiteID;
}
