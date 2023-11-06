package io.hotchat.hotchatbackend.web;

import io.hotchat.hotchatbackend.web.dto.SearchRankingResponseDto;
import io.hotchat.hotchatbackend.web.service.SearchRankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rankings")
public class SearchRankingController {

    private final SearchRankingService searchRankingService;

    @GetMapping
    public ResponseEntity<List<SearchRankingResponseDto>> getList() {
        List<SearchRankingResponseDto> responses = searchRankingService.getAllRanks();
        return ResponseEntity.ok(responses);
    }
}
