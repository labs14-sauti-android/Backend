package com.lambdaschool.starthere.config;

import com.lambdaschool.starthere.services.MarketPriceService;
import graphql.GraphQL;
import graphql.analysis.MaxQueryComplexityInstrumentation;
import graphql.analysis.MaxQueryDepthInstrumentation;
import graphql.execution.batched.BatchedExecutionStrategy;
import graphql.execution.instrumentation.ChainedInstrumentation;
import graphql.schema.GraphQLSchema;
import io.leangen.graphql.GraphQLSchemaGenerator;
import io.leangen.graphql.metadata.strategy.query.AnnotatedResolverBuilder;
import io.leangen.graphql.metadata.strategy.value.jackson.JacksonValueMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class GraphQLConfig {

    @Bean
    public GraphQL graphQL(MarketPriceService marketPriceService) {

        GraphQLSchema schema = new GraphQLSchemaGenerator()
                .withResolverBuilders(
                        new AnnotatedResolverBuilder())
                .withOperationsFromSingleton(marketPriceService)
                .withValueMapperFactory(new JacksonValueMapperFactory())
                .generate();
        return GraphQL.newGraphQL(schema)
                .queryExecutionStrategy(new BatchedExecutionStrategy())
                .instrumentation(new ChainedInstrumentation(Arrays.asList(
                        new MaxQueryComplexityInstrumentation(200),
                        new MaxQueryDepthInstrumentation(20)
                )))
                .build();
    }
}
