package io.hotchat.hotchatbackend.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SearchRankingRepository extends MongoRepository<SearchRanking, String> {
}
