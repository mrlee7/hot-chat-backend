package io.hotchat.hotchatbackend.domain.search_ranking;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface SearchRankingRepository extends MongoRepository<SearchRanking, String> {

    Optional<SearchRanking> findByKeyword(String keyword);
}
