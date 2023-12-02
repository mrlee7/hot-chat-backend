package io.hotchat.hotchatbackend.service;

import io.hotchat.hotchatbackend.domain.search_ranking.SearchRanking;

import java.io.IOException;
import java.util.List;

public interface SearchRankingScraper {

    List<SearchRanking> scrapeRankings() throws IOException;
}
