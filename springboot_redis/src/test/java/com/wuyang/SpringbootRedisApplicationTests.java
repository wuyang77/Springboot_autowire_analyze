package com.wuyang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	void set() {
		ValueOperations ops = redisTemplate.opsForValue();
		ops.set("age", 26);
	}
	@Test
	void hSet() {
		HashOperations hops = redisTemplate.opsForHash();
		hops.put("info", "a", "6666");
	}
	@Test
	void hGet() {
		HashOperations hops = redisTemplate.opsForHash();
		System.out.println(hops.get("info", "a"));
	}
	@Test
	void get() {
		ValueOperations ops = redisTemplate.opsForValue();
		System.out.println(ops.get("age"));
	}

	@Test
	void testSet() {
		ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
		stringStringValueOperations.set("name","wuyang");
	}
	@Test
	void testGet() {
		ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
		System.out.println(stringStringValueOperations.get("name"));
	}
}
