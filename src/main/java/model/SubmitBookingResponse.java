package model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static lombok.AccessLevel.PUBLIC;

@Getter
@Setter
@Builder
@JsonInclude(NON_NULL)
@NoArgsConstructor(access = PUBLIC)
@AllArgsConstructor(access = PUBLIC)
public class SubmitBookingResponse {
    @Valid
    @NotNull(message = "bookingId NotNull.")
    @JsonProperty("skyscannerBookingId")
    private String bookingId;

    public enum Status{
        STATUS_ACCEPTED,
        STATUS_FAILED;
    }

    @Valid
    @NotNull(message = "status NotNull.")
    @JsonProperty("status")
    private Status status;

    @Valid
    @JsonProperty("errors")
    private ErrorResult errors;
}
