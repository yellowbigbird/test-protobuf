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
public class DeviceInfo {
    @Tag(1)
    @Valid
    @JsonProperty("browserName")
    private String browserName;

    @Tag(2)
    @Valid
    @JsonProperty("browserVersion")
    private String browserVersion;

    enum DeviceType
    {
        DEVICE_TYPE_DESKTOP,
        DEVICE_TYPE_MOBILE,
        DEVICE_TYPE_TABLET,
        DEVICE_TYPE_UNKNOWN;
    }

    @Tag(3)
    @Valid
    @NotNull(message = "deviceType NotNull.")
    @JsonProperty("deviceType")
    private DeviceType deviceType;

    @Tag(4)
    @Valid
    @JsonProperty("ipAddressText")
    private String ipAddressText;

    @Tag(5)
    @Valid
    @JsonProperty("osName")
    private String osName;

    @Tag(6)
    @Valid
    @JsonProperty("osVersion")
    private String osVersion;

    @Tag(7)
    @Valid
    @JsonProperty("appVersion")
    private String appVersion;
}
