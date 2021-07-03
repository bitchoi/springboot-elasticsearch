package com.bitchoi.elasticsearch.es.repository;

import com.bitchoi.elasticsearch.es.model.Post;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PostElasticRepository extends ElasticsearchRepository<Post, Integer> {
}
