package com.ufp.domainentry.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.ufp.domainentry.domain.DomainEntry;

import java.util.List;
import java.time.LocalDateTime;

public interface DomainEntryRepository extends CrudRepository<DomainEntry, Long> {
}
