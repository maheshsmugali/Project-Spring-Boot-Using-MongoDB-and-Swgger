package com.pws.mongodbjoblisting.repo;

import com.pws.mongodbjoblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
