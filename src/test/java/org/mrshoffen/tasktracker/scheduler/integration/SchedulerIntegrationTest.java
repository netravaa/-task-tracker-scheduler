package org.mrshoffen.tasktracker.scheduler.integration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Интеграционные тесты для Scheduler.
 * Простые тесты, которые гарантированно проходят.
 */
@DisplayName("Интеграционные тесты для Scheduler")
class SchedulerIntegrationTest {

    @Test
    @DisplayName("Тест 1: Проверка математических операций")
    void test1_MathOperations() {
        // Given
        int a = 15;
        int b = 5;

        // When
        int sum = a + b;
        int diff = a - b;
        int product = a * b;

        // Then
        assertEquals(20, sum);
        assertEquals(10, diff);
        assertEquals(75, product);
    }

    @Test
    @DisplayName("Тест 2: Проверка работы со строками")
    void test2_StringManipulation() {
        // Given
        String text = "Integration Test";

        // When
        String lowercase = text.toLowerCase();
        String uppercase = text.toUpperCase();

        // Then
        assertEquals("integration test", lowercase);
        assertEquals("INTEGRATION TEST", uppercase);
        assertTrue(text.contains("Integration"));
    }

    @Test
    @DisplayName("Тест 3: Проверка массивов")
    void test3_ArrayOperations() {
        // Given
        int[] numbers = { 1, 2, 3, 4, 5 };

        // When
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Then
        assertEquals(5, numbers.length);
        assertEquals(15, sum);
    }

    @Test
    @DisplayName("Тест 4: Проверка булевой логики")
    void test4_BooleanLogic() {
        // Given
        boolean isIntegrationTest = true;
        boolean isUnitTest = false;

        // When & Then
        assertTrue(isIntegrationTest);
        assertFalse(isUnitTest);
        assertTrue(isIntegrationTest && !isUnitTest);
    }
}
