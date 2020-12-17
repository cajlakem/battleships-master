package tests;
import static org.junit.jupiter.api.Assertions.*;

import fh.campus.asd.battleship.backend.models.Player;
import fh.campus.asd.battleship.backend.models.Ship;
import fh.campus.asd.battleship.backend.models.ShipPart;
import org.junit.jupiter.api.Test;

public class BackendTest {


    @Test
    void TestShipPart() {

        ShipPart shipPart = new ShipPart(4,6);

        assertEquals(4,shipPart.getX());
        assertEquals(6,shipPart.getY());

        assertFalse(shipPart.isDamaged());
        assertNotEquals(5, shipPart.getX());

        shipPart.destroy();
        assertNotEquals(false,shipPart.isDamaged());

    }


    @Test
    void TestPlayer() {

        Player player1 = new Player();
        player1.saveAttack(2,3);
        player1.saveAttack(3,5);
        player1.saveAttack(7,2);
        player1.saveAttack(7,2);

        assertFalse(player1.attackPossible(3,5));

        player1.saveAttack(1,2);
        player1.saveAttack(33,12);

        assertTrue(player1.attackPossible(4,5));

    }

    @Test
    void TestShipr() {

        //Ship ship1

    }


}
