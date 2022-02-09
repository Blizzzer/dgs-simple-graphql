package com.example.trainings;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node
public class Training {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String date;

    private String longDescription;

}
