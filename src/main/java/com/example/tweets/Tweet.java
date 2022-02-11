package com.example.tweets;

import lombok.Data;
import org.neo4j.driver.internal.value.DateTimeValue;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Data
@Node
public class Tweet {

    @Id
    @GeneratedValue
    private Long id;

    private String favourites;

    private String id_str;
    private String import_method;
    private String text;
}
