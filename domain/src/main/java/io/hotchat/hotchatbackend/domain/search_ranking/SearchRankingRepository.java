package io.hotchat.hotchatbackend.domain.search_ranking;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRankingRepository extends MongoRepository<SearchRanking, String> {
}
