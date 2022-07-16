package Lab8;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {
    @org.junit.jupiter.api.Test
    void testConstructorAndGets() {
        String expectedBreadType = "Whole Grain";
        Double expectedBaseCost = 5.00;
        Double expectedCostPerItem = 2.50;

        Sandwich sandwich = new Sandwich(expectedBreadType,expectedBaseCost,expectedCostPerItem);

        String actualBreadType = sandwich.getBreadType();
        Double actualBaseCost = sandwich.getBaseCost();
        Double actualCostPerItem = sandwich.getCostPerItem();

        assertEquals(expectedBaseCost, actualBaseCost);
        assertEquals(expectedCostPerItem, actualCostPerItem);
        assertEquals(expectedBreadType, actualBreadType);
    }

    @org.junit.jupiter.api.Test
    void testAddItems() {
        Sandwich sandwich = new Sandwich("Whole Grain", 5.00, 2.50);

        sandwich.addItem("Tomatoes");
    }

    @org.junit.jupiter.api.Test
    void testTotalCost() {
        Double expectedBaseCost = 1.00;
        Double expectedCostPerItem = 0.50;

    }
}