package dev.coffee.cardapp.cardapp.repository.repository;

import dev.coffee.cardapp.cardapp.repository.entity.ranch.EmailRanchEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailRanchRepository extends CrudRepository<EmailRanchEntity, Long> {
}
