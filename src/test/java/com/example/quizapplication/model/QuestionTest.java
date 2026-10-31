package com.example.quizapplication.model;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionTest {

	@Test
	void constructorStoresQuestionData() {
		ArrayList<String> options = new ArrayList<>();
		options.add("Spring MVC");
		options.add("Java Swing");

		Question question = new Question(1, "¿Qué tecnología gestiona las vistas web?", options, "Spring MVC");

		assertEquals(1, question.getId());
		assertEquals("¿Qué tecnología gestiona las vistas web?", question.getQuestionText());
		assertEquals(options, question.getOptions());
		assertEquals("Spring MVC", question.getCorrectAnswer());
	}
}
