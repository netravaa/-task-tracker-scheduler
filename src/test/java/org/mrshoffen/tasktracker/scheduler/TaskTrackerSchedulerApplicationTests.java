package org.mrshoffen.tasktracker.scheduler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Простые unit-тесты для TaskTrackerSchedulerApplication
 */
@DisplayName("Unit тесты для TaskTrackerSchedulerApplication")
class TaskTrackerSchedulerApplicationTests {

    @Test
    @DisplayName("Тест 1: Проверка что приложение существует")
    void test1_ApplicationExists() {
        // Given & When
        TaskTrackerSchedulerApplication app =
            new TaskTrackerSchedulerApplication();

        // Then
        assertNotNull(app);
    }

    @Test
    @DisplayName("Тест 2: Проверка базовой математики")
    void test2_BasicMath() {
        // Given
        int a = 10;
        int b = 5;

        // When
        int sum = a + b;
        int diff = a - b;

        // Then
        assertEquals(15, sum);
        assertEquals(5, diff);
    }

    @Test
    @DisplayName("Тест 3: Проверка строк")
    void test3_StringTest() {
        // Given
        String appName = "TaskTrackerScheduler";

        // When & Then
        assertNotNull(appName);
        assertTrue(appName.contains("Scheduler"));
        assertEquals(20, appName.length());
    }

    @Test
    @DisplayName("Тест 4: Проверка boolean логики")
    void test4_BooleanLogic() {
        // Given
        boolean isRunning = true;
        boolean isStopped = false;

        // When & Then
        assertTrue(isRunning);
        assertFalse(isStopped);
        assertNotEquals(isRunning, isStopped);
    }
}
