package dev.coffee.cardapp.cardapp.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RanchResponse {

    private Long id;
    private Long emailId;
    private String name;
    private String description;
}
