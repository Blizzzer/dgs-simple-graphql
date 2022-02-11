package com.example.tweets;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DgsComponent
@RequiredArgsConstructor
public class TweetDataFetcher {

    private final TweetRepository repository;

    @DgsQuery
    public List<Tweet> tweets() {
        return repository.findAll();
    }
}
