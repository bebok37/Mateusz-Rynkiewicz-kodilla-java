package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CollectionTestSuite")
public class CollectionTestSuite {

    private OddNumbersExterminator exterminator;

    @BeforeEach
    void setUp() {
        exterminator = new OddNumbersExterminator();
        System.out.println("Preparing for the test...");
    }

    @AfterEach
    void tearDown() {
        exterminator = null;
        System.out.println("Cleaning up after the test...");
    }

    @Test
    @DisplayName("Test exterminating odd numbers from an empty list")
    void testOddNumbersExterminatorEmptyList() {
        // Given
        List<Integer> emptyList = new ArrayList<>();

        // When
        List<Integer> result = exterminator.exterminate(emptyList);

        // Then
        assertTrue(result.isEmpty(), "Result should be an empty list");
    }

    @Test
    @DisplayName("Test exterminating odd numbers from a normal list")
    void testOddNumbersExterminatorNormalList() {
        // Given
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // When
        List<Integer> result = exterminator.exterminate(numbers);

        // Then
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);
        assertEquals(expected, result, "Result should contain only even numbers");
    }
}