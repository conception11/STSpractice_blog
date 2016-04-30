/**
 * fileName : PostDao.java
 * date : 2016. 4. 30.
 * details : 
 */
package com.gtgt.blog;

/**
 * @author 김기태(GT)
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.gtgt.blog.domain.model.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer> {
}