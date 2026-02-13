package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkServiceTest {


    @Test
    public void testfirst() {
        WorkService service = new WorkService();
        int actual = service.calculate(10000, 3000, 20000);
        int count = 3;
        Assertions.assertEquals(count, actual);
    }


    @Test
    public void testsecond() {
        WorkService service = new WorkService();
        int actual = service.calculate(100000, 60000, 150000);
        int count = 2;
        Assertions.assertEquals(count, actual);
    }
}