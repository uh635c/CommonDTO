package ru.uh635c.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;
import ru.uh635c.entity.Status;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class IndividualResponseDTO {

    private String id;
    private String firstName;
    private String lastName;
//    private String secretKey;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime verifiedAt;
    private LocalDateTime archivedAt;
    private boolean filled;
    private Status status;

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
