package io.hotchat.hotchatbackend.domain.search_ranking;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class SearchRanking {

    @Id
    private String id;
    private int rank;
    private String keyword;

    public SearchRanking(int rank, String keyword) {
        this.rank = rank;
        this.keyword = keyword;
    }
}
