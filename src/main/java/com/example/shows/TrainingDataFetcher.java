package com.shows;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DgsComponent
@RequiredArgsConstructor
public class TrainingDataFetcher {

    private final TrainingRepository repository;

    @DgsQuery
    public List<Training> trainings() {
        return repository.findAll();
    }
}
