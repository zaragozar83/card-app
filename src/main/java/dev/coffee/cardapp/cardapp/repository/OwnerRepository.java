package dev.coffee.cardapp.cardapp.repository;

import dev.coffee.cardapp.cardapp.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
