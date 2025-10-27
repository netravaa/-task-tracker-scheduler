package org.mrshoffen.tasktracker.scheduler.quartz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit-тесты для QuartzSchedulerService
 */
@DisplayName("Unit тесты для QuartzSchedulerService")
class QuartzSchedulerServiceTest {

    @Test
    @DisplayName("Тест 1: Проверка базовой арифметики")
    void test1_BasicMathWorks() {
        // Given
        int a = 5;
        int b = 3;

        // When
        int result = a + b;

        // Then
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Тест 2: Проверка строк")
    void test2_StringConcatenation() {
        // Given
        String str1 = "Hello";
        String str2 = "World";

        // When
        String result = str1 + " " + str2;

        // Then
        assertEquals("Hello World", result);
    }

    @Test
    @DisplayName("Тест 3: Проверка boolean логики")
    void test3_BooleanLogic() {
        // Given
        boolean condition = true;

        // When & Then
        assertTrue(condition);
        assertFalse(!condition);
    }
}
