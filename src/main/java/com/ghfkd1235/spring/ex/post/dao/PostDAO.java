package com.ghfkd1235.spring.ex.post.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.ghfkd1235.spring.ex.post.model.Post;

@Repository
public interface PostDAO {

	public int insertPost(
			@Param("userId") int userId
			, @Param("title") String title
			, @Param("content") String content
			, @Param("imagePath") String imagePath);
	
	public List<Post> selectPostList(@Param("userId") int userId);
	
	public Post selectPost(@Param("id") int id);
}
