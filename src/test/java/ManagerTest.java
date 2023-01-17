import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ManagerTest {
    String film1 = "film1";
    String film2 = "film2";
    String film3 = "film3";
    String film4 = "film4";
    String film5 = "film5";
    String film6 = "film6";
    String film7 = "film7";
    String film8 = "film8";
    String film9 = "film9";
    String film10 = "film10";
    String film11 = "film11";
    String film12 = "film12";

    @BeforeEach

    @Test
    public void allFilms() {

        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {film1, film2, film3, film4, film5};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    public void showLast() {

        Manager manager = new Manager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        String[] expected = {film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void LessThanLimited() {
        Manager manager = new Manager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);


        String[] expected = {film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);

    }
    @Test
    public void MoreThanLimited() {
        Manager manager = new Manager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);


        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }


    @Test
    public void Limited() {
        Manager manager = new Manager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);


    }
    @Test
    public void MoreLimited() {
        Manager manager = new Manager(11);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
    }