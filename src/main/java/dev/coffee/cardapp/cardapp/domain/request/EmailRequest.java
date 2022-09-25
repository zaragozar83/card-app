package dev.coffee.cardapp.cardapp.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {

    private Long id;
    private String emailAddress;
    private String company;
}
