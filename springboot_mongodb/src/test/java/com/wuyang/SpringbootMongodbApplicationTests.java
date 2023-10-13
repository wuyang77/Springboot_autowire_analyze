package com.wuyang;

import com.wuyang.bean.Book;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootTest
class SpringbootMongodbApplicationTests {
  @Autowired
  private MongoTemplate mongoTemplate;

	@Test
	void contextLoads() {
    Book book = new Book();
    book.setId(2);
    book.setBookName("wuyang is 666");
    mongoTemplate.save(book);
	}
  @Test
  void findAll() {
    List<Book> all = mongoTemplate.findAll(Book.class);
    System.out.println(all);
  }

}
