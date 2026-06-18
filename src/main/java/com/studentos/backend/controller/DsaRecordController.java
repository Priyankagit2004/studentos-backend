package com.studentos.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentos.backend.model.DsaRecord;
import com.studentos.backend.service.DsaRecordService;

@RestController
@RequestMapping("/api/dsa")
public class DsaRecordController {

    @Autowired
    private DsaRecordService service;

    @PostMapping
    public DsaRecord addRecord(@RequestBody DsaRecord record) {
        return service.saveRecord(record);
    }

    @GetMapping
    public List<DsaRecord> getAllRecords() {
        return service.getAllRecords();
    }
}