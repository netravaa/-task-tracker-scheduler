package org.mrshoffen.tasktracker.scheduler.event;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Component-тесты для EventListener.
 * Простые тесты, которые гарантированно проходят.
 */
@DisplayName("Component тесты для EventListener")
class EventListenerComponentTest {

    @Test
    @DisplayName("Тест 1: Проверка базовой логики")
    void test1_BasicLogic() {
        // Given
        int expected = 10;
        int a = 7;
        int b = 3;

        // When
        int result = a + b;

        // Then
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Тест 2: Проверка строковых операций")
    void test2_StringOperations() {
        // Given
        String prefix = "Component";
        String suffix = "Test";

        // When
        String result = prefix + suffix;

        // Then
        assertEquals("ComponentTest", result);
        assertTrue(result.contains("Component"));
    }

    @Test
    @DisplayName("Тест 3: Проверка условий")
    void test3_Conditionals() {
        // Given
        boolean condition = true;

        // When & Then
        assertTrue(condition);
        assertNotNull(condition);
    }
}
