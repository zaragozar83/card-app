package dev.coffee.cardapp.cardapp.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RanchRequest {

    private Long emailId;
    private String name;
    private String description;
}
