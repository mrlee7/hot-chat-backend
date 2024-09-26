package io.hotchat.hotchatbackend.service;

import io.hotchat.hotchatbackend.domain.search_ranking.SearchRanking;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Component
public class ZumSearchRankingScraper implements SearchRankingScraper {

    private static final String ZUM_REALTIME_SEARCH_URL = "https://search.zum.com/search.zum?method=uni&option=accu&qm=f_typing&rd=1&query=%08a";

    public List<SearchRanking> scrapeRankings() throws IOException {
        Document doc = Jsoup.connect(ZUM_REALTIME_SEARCH_URL).get();
        Elements txtElements = doc.select("#issueList .txt");

        Set<String> rankingElements = txtElements.stream()
            .map(elem -> elem.text()).collect(Collectors.toSet());
        AtomicInteger rank = new AtomicInteger(1);

        return rankingElements.stream()
            .map(elem -> new SearchRanking(rank.getAndIncrement(), elem))
            .collect(Collectors.toList());
    }
}
