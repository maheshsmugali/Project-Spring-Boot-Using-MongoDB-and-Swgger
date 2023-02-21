package com.pws.mongodbjoblisting.repo;

import com.pws.mongodbjoblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
