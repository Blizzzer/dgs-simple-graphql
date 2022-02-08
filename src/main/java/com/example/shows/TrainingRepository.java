package com.shows;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends Neo4jRepository<Training, String> {
}
