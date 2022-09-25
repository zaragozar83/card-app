package dev.coffee.cardapp.cardapp.repository;

import dev.coffee.cardapp.cardapp.repository.entity.ranch.RanchEntity;
import dev.coffee.cardapp.cardapp.repository.repository.RanchRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class RanchRepositoryTest {

    @Autowired
    private RanchRepository ranchRepository;

    @Test
    void saveRanch() {
        RanchEntity ranchEntity = ranchRepository.save(RanchEntity.builder()
                .name("Bates")
                .description("Bates description")
                .build());

        Assertions.assertThat(ranchEntity).isNotNull();

        Optional<RanchEntity> maybeRanch = ranchRepository.findByName("Bates");

        Assertions.assertThat(maybeRanch.isPresent()).isTrue();

        ranchRepository.deleteAll();

        Assertions.assertThat(ranchRepository.count()).isEqualTo(0);
    }
}
