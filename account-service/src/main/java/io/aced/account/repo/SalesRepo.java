package io.aced.account.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.aced.account.entity.SalesEntity;

public interface SalesRepo extends JpaRepository<SalesEntity, Long> {

	SalesEntity findBySaleId(Long userId);
}
