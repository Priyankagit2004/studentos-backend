package com.studentos.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentos.backend.model.DsaRecord;

public interface DsaRecordRepository
        extends JpaRepository<DsaRecord, Long> {
}