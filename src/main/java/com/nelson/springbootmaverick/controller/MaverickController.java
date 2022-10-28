package com.nelson.springbootmaverick.controller;

import com.nelson.springbootmaverick.dto.MaverickDto;
import com.nelson.springbootmaverick.service.MaverickService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maverick")
@AllArgsConstructor
@Slf4j
public class MaverickController {

    private MaverickService maverickService;

    @PostMapping
    public ResponseEntity<MaverickDto> createSubreddit(@RequestBody MaverickDto maverickDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(maverickService.save(maverickDto));
    }

    @GetMapping
    public ResponseEntity<List<MaverickDto>> getAllSubreddits() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(maverickService.getAll());
    }

}
