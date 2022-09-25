package dev.coffee.cardapp.cardapp.repository.repository;

import dev.coffee.cardapp.cardapp.repository.entity.ranch.RanchEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RanchRepository extends CrudRepository<RanchEntity, Long> {

    Optional<RanchEntity> findByName(String name);
}
