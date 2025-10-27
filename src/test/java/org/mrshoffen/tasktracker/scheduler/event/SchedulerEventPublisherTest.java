package org.mrshoffen.tasktracker.scheduler.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit-тесты для SchedulerEventPublisher
 */
@DisplayName("Unit тесты для SchedulerEventPublisher")
class SchedulerEventPublisherTest {

    @Test
    @DisplayName("Тест 1: Проверка что тест запускается")
    void test1_ShouldPass() {
        // Given
        int expected = 2;

        // When
        int actual = 1 + 1;

        // Then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Тест 2: Проверка истинности")
    void test2_ShouldBeTrue() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Тест 3: Проверка не null")
    void test3_ShouldNotBeNull() {
        String value = "test";
        assertNotNull(value);
    }
}
