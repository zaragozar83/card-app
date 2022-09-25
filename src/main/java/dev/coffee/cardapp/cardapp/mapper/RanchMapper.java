package dev.coffee.cardapp.cardapp.mapper;

import dev.coffee.cardapp.cardapp.domain.request.RanchRequest;
import dev.coffee.cardapp.cardapp.domain.response.RanchResponse;
import dev.coffee.cardapp.cardapp.repository.entity.ranch.RanchEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RanchMapper {

    public RanchResponse toRanchResponseFromRanchEntity(RanchEntity ranchEntity) {

        return RanchResponse.builder()
                .id(ranchEntity.getId())
                .name(ranchEntity.getName())
                .description(ranchEntity.getDescription())
                .build();
    }

    public RanchEntity toRanchEntityFromRanchRequest(RanchRequest ranchRequest) {

        return RanchEntity.builder()
                .name(ranchRequest.getName())
                .emailId(ranchRequest.getEmailId())
                .description(ranchRequest.getDescription())
                .build();
    }

    public List<RanchResponse> toRanchResponseListFromRanchEntityList(List<RanchEntity> ranches) {

        return ranches.stream()
                .map(this::toRanchResponseFromRanchEntity)
                .collect(Collectors.toList());
    }

}
