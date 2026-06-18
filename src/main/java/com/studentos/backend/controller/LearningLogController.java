package com.studentos.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentos.backend.model.LearningLog;
import com.studentos.backend.service.LearningLogService;

@RestController
@RequestMapping("/api/learning")
public class LearningLogController {

    @Autowired
    private LearningLogService learningLogService;

    @PostMapping
    public LearningLog addLog(@RequestBody LearningLog log) {
        return learningLogService.saveLog(log);
    }

    @GetMapping
    public List<LearningLog> getAllLogs() {
        return learningLogService.getAllLogs();
    }
}