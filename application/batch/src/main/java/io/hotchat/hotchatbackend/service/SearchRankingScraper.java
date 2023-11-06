package io.hotchat.hotchatbackend.service;

import io.hotchat.hotchatbackend.domain.SearchRanking;

import java.io.IOException;
import java.util.List;

public interface SearchRankingScraper {

    List<SearchRanking> scrapeRankings() throws IOException;
}
