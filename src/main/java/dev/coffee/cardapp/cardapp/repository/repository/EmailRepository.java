package dev.coffee.cardapp.cardapp.repository.repository;

import dev.coffee.cardapp.cardapp.repository.entity.ranch.EmailEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<EmailEntity, Long> {
}
