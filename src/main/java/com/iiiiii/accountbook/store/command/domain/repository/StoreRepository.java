package com.iiiiii.accountbook.store.command.domain.repository;

import com.iiiiii.accountbook.store.command.domain.aggregate.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}
