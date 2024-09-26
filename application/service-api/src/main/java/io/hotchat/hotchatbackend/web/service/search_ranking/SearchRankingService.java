package io.hotchat.hotchatbackend.web.service.search_ranking;


import io.hotchat.hotchatbackend.domain.search_ranking.SearchRanking;
import io.hotchat.hotchatbackend.domain.search_ranking.SearchRankingRepository;
import io.hotchat.hotchatbackend.web.dto.SearchRankingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public List<SearchRanking> findAllChatRooms() {
        return searchRankingRepository.findAll();
    }

    public Optional<SearchRanking> findChatRoomByKeyword(String keyword) {
        return searchRankingRepository.findByKeyword(keyword);
    }

    public SearchRanking createChatRoom(int rank, String keyword) {
        SearchRanking chatRoom = new SearchRanking(rank, keyword);
        return searchRankingRepository.save(chatRoom);
    }
}