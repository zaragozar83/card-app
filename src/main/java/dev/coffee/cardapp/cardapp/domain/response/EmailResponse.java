package dev.coffee.cardapp.cardapp.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailResponse {

    private Long id;
    private String emailAddress;
    private String company;
}
