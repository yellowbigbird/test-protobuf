package model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.protostuff.Tag;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@Builder
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PUBLIC)
public class SubmitBookingRequest {
    @Tag(9)
    @Valid
    @NotNull(message = "bookingId can't be null.")
    @JsonProperty("skyscannerBookingId")
    private String skyscannerBookingId;

    @Tag(1)
    @Valid
    @JsonProperty("additionalInfos")
    private AdditionalInfos additionalInfos;

    @Tag(2)
    @Valid
    @NotNull(message = "SubmitBookingRequest.basicInfo can't be null.")
    @JsonProperty("basicInfo")
    private BasicInfo basicInfo;

    @Tag(3)
    @Valid
    @NotNull(message = "SubmitBookingRequest.contactInfo NotNull.")
    @JsonProperty("contactInfo")
    private ContactInfo contactInfo;

    @Tag(4)
    @Valid
    @JsonProperty("flightData")
    private FlightData flightData;

    @Tag(5)
    @Valid
    @NotNull(message = "SubmitBookingRequest.paymentInfo NotNull.")
    @JsonProperty("paymentInfo")
    private PaymentInfo paymentInfo;

    @Tag(6)
    @Valid
    @JsonProperty("remarketingConsent")
    private Boolean remarketingConsent;

    @Tag(7)
    @Valid
    @NotNull(message = "SubmitBookingRequest.selectedOffer NotNull.")
    @JsonProperty("selectedOffer")
    private SelectedOffer selectedOffer;

    @Tag(8)
    @Valid
    @JsonProperty("selectedOptionalExtras")
    private List<OptionalExtra> selectedOptionalExtras;

    @Tag(10)
    @Valid
    @NotNull(message = "SubmitBookingRequest.travelers NotNull.")
    @JsonProperty("travelers")
    private Map<String, TravelerInfo> travelers;

}
