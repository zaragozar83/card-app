package dev.coffee.cardapp.cardapp.domain.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RanchEmailRequest {

    private Long id;
    private Long ranchId;
    private Long emailId;
}
