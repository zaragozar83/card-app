package dev.coffee.cardapp.cardapp.controller;

import dev.coffee.cardapp.cardapp.domain.response.RanchResponse;
import dev.coffee.cardapp.cardapp.mapper.RanchMapper;
import dev.coffee.cardapp.cardapp.repository.entity.ranch.RanchEntity;
import dev.coffee.cardapp.cardapp.repository.repository.RanchRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ranches")
public class RanchController {

    private final RanchMapper ranchMapper;
    private final RanchRepository ranchRepository;

    @GetMapping
    public Iterable<RanchResponse> getRanches() {
        return ranchMapper.toRanchResponseListFromRanchEntityList((List<RanchEntity>) ranchRepository.findAll());
    }

}
