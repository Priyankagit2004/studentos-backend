package com.studentos.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentos.backend.model.DsaRecord;
import com.studentos.backend.repository.DsaRecordRepository;

@Service
public class DsaRecordService {

    @Autowired
    private DsaRecordRepository repository;

    public DsaRecord saveRecord(DsaRecord record) {
        return repository.save(record);
    }

    public List<DsaRecord> getAllRecords() {
        return repository.findAll();
    }
}