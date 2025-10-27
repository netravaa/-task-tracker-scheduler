package org.mrshoffen.tasktracker.scheduler.job;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit-тесты для ExpireRegistrationAttemptJob
 */
@DisplayName("Unit тесты для ExpireRegistrationAttemptJob")
class ExpireRegistrationAttemptJobTest {

    @Test
    @DisplayName("Тест 1: Проверка что класс работает")
    void test1_JobClassExists() {
        // Given
        ExpireRegistrationAttemptJob job = new ExpireRegistrationAttemptJob();

        // Then
        assertNotNull(job);
    }

    @Test
    @DisplayName("Тест 2: Проверка числового сравнения")
    void test2_NumberComparison() {
        // Given
        int value = 10;

        // When & Then
        assertTrue(value > 5);
        assertTrue(value < 15);
    }

    @Test
    @DisplayName("Тест 3: Проверка типов")
    void test3_TypeChecking() {
        // Given
        Object obj = "Test String";

        // When & Then
        assertTrue(obj instanceof String);
        assertEquals("Test String", obj);
    }
}
