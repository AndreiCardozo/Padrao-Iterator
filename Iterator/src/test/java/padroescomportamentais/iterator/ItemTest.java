package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void deveRetornarNomeDoItem() {
        Item item1 = new Item("Caneta", true);
        Item item2 = new Item("Caderno", true);
        Item item3 = new Item("Lápis", true);

        assertEquals("Caneta", item1.getName());
        assertEquals("Caderno", item2.getName());
        assertEquals("Lápis", item3.getName());
    }

    @Test
    void deveRetornarDisponibilidadeDoItem() {
        Item item1 = new Item("Caneta", true);
        Item item2 = new Item("Caderno", false);
        Item item3 = new Item("Lápis", true);

        assertEquals(true, item1.isAvailable());
        assertEquals(false, item2.isAvailable());
        assertEquals(true, item3.isAvailable());
    }
}