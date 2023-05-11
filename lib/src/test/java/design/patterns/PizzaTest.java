package design.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void givenPlainPizza_shouldReturnDefaultDescriptionAndPrice() {
        Pizza myPizza = new PlainPizza();
        myPizza = new PizzaWithTomato(myPizza);
        myPizza = new PizzaWithCheese(myPizza);

        assertEquals("Plain pizza, with tomato, with cheese", myPizza.getDescription());
        assertEquals(6, myPizza.getPrice());
    }
}