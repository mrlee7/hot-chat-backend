package io.hotchat.hotchatbackend.web.service;


import io.hotchat.hotchatbackend.domain.search_ranking.SearchRankingRepository;
import io.hotchat.hotchatbackend.web.dto.SearchRankingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchRankingService {

    private final SearchRankingRepository searchRankingRepository;

    public List<SearchRankingResponseDto> getAllRanks() {
        return searchRankingRepository
            .findAll()
            .stream()
            .map(SearchRankingResponseDto::from)
            .collect(Collectors.toList());
    }
}