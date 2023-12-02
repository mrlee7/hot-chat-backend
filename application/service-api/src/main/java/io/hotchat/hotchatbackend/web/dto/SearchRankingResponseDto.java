package io.hotchat.hotchatbackend.web.dto;

import io.hotchat.hotchatbackend.domain.search_ranking.SearchRanking;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SearchRankingResponseDto {

    private String id;
    private Integer rank;
    private String keyword;

    public SearchRankingResponseDto(String id, Integer rank, String keyword) {
        this.id = id;
        this.rank = rank;
        this.keyword = keyword;
    }

    public static SearchRankingResponseDto from(SearchRanking searchRanking) {
        return new SearchRankingResponseDto(
            searchRanking.getId(),
            searchRanking.getRank(),
            searchRanking.getKeyword()
        );
    }
}
