package at.resources;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class test_RandomNumber {



    @Test
    public void test_randomNumber_smallerThan100(){
        //Arrange
        at.resources.RandomNumber randomNumberTest = new at.resources.RandomNumber();

        //Act
        int value = randomNumberTest.randomNumber();
        //Assert
        Assertions.assertEquals(true, value <= 100);
    }


    @Test
    public void test_randomNumber_biggerThan0(){
        //Arrange
        at.resources.RandomNumber randomNumberTest = new at.resources.RandomNumber();
        //Act
        int value = randomNumberTest.randomNumber();
        //Assert
        Assertions.assertEquals(true, value >= 0);
    }


}



