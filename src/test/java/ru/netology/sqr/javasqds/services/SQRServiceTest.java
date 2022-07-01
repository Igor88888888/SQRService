package ru.netology.sqr.javasqds.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nums.csv")

    public void testCalcSqd (int num1, int num2, int expected) {


        SQRService service = new SQRService();
        int actual = service.calcSQR(num1,num2);

        Assertions.assertEquals(expected, actual);
    }
}
