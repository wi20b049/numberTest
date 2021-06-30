package at.Labuda;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class test_RandomNumber {



    @Test
    public void test_randomNumber_smallerThan100(){
        //Arrange
        at.Labuda.RandomNumber randomNumberTest = new at.Labuda.RandomNumber();

        //Act
        int value = randomNumberTest.randomNumber();
        //Assert
        Assertions.assertEquals(true, value <= 100);
    }


    @Test
    public void test_randomNumber_biggerThan0(){
        //Arrange
        at.Labuda.RandomNumber randomNumberTest = new at.Labuda.RandomNumber();
        //Act
        int value = randomNumberTest.randomNumber();
        //Assert
        Assertions.assertEquals(true, value >= 0);
    }


}



