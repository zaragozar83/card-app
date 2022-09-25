package dev.coffee.cardapp.cardapp.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RanchEmailResponse {

    private Long id;
    private Long ranchId;
    private Long emailId;
}
