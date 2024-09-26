package io.hotchat.hotchatbackend.web.service.search_ranking;

import io.hotchat.hotchatbackend.domain.search_ranking.SearchRanking;
import io.hotchat.hotchatbackend.web.dto.SearchRankingResponseDto;
import io.hotchat.hotchatbackend.web.service.search_ranking.SearchRankingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    public SearchRankingController(SearchRankingService service) {
        this.searchRankingService = service;
    }

    @GetMapping
    public List<SearchRanking> getAllChatRooms() {
        return searchRankingService.findAllChatRooms();
    }

    @GetMapping("/{keyword}")
    public SearchRanking getChatRoomByKeyword(@PathVariable String keyword) {
        return searchRankingService.findChatRoomByKeyword(keyword)
            .orElseThrow(() -> new RuntimeException("존재하지 않음"));
    }

    @PostMapping
    public SearchRanking createChatRoom(@RequestParam int rank, @RequestParam String keyword) {
        return searchRankingService.createChatRoom(rank, keyword);
    }
}
