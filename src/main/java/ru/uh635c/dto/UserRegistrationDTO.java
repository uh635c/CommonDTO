package ru.uh635c.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRegistrationDTO {
    //user props
    private String firstName;
    private String lastName;
    private String password;
    private String confirmedPassword;

    //address props
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    //individual props
    private String phoneNumber;
    private String passportNumber;
    private String email;
}
