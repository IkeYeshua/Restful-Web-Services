package com.in28minutes.rest.webservices.restfulwebservices.postjpa;

import com.in28minutes.rest.webservices.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}

