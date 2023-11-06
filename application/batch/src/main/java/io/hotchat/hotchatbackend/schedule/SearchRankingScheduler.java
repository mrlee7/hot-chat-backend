package io.hotchat.hotchatbackend.schedule;

import io.hotchat.hotchatbackend.domain.SearchRanking;
import io.hotchat.hotchatbackend.domain.SearchRankingRepository;
import io.hotchat.hotchatbackend.service.SearchRankingScraper;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SearchRankingScheduler {

    private final SearchRankingScraper searchRankingScraper;
    private final SearchRankingRepository searchRankingRepository;


    @Scheduled(fixedRate = 60000)
    public void fetchAndStoreRankings() {
        try {
            List<SearchRanking> rankings = searchRankingScraper.scrapeRankings();
            searchRankingRepository.deleteAll();
            searchRankingRepository.saveAll(rankings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
