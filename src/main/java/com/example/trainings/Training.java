package com.example.trainings;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.time.LocalDate;

@Data
@Node
public class Training {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate date;

    private String longDescription;

}
