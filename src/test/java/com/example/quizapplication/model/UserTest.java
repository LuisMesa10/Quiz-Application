package com.example.quizapplication.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UserTest {

	@Test
	void constructorStoresUserDataWithoutExposingPasswordInToString() {
		User user = new User("ana", "ana@example.com", "secret", "USER");

		assertEquals("ana", user.getUsername());
		assertEquals("ana@example.com", user.getEmail());
		assertEquals("secret", user.getPassword());
		assertEquals("USER", user.getRole());
		assertFalse(user.toString().contains("secret"));
	}
}
