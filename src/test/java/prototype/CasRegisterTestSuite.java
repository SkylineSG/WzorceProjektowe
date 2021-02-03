package prototype;

import org.junit.Assert;
import org.junit.Test;

public class CasRegisterTestSuite {

    @Test
    public void casRegister1() {
        //given
        Basket basket1 = new Basket("milk");
        Basket basket2 = new Basket("egg");
        Basket basket3 = new Basket("sugar");


        CasRegister casRegister = new CasRegister("Basket1");
        casRegister.getLists().add(basket1);
        casRegister.getLists().add(basket2);
        casRegister.getLists().add(basket3);

        CasRegister clonedBasket = null;
        try {
            clonedBasket = casRegister.shallowCopy();
            clonedBasket.setName("CasRegister1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(casRegister);
        System.out.println(clonedBasket);
        //When
        //Then
        Assert.assertEquals(3, casRegister.getLists().size());
        Assert.assertEquals(3, clonedBasket.getLists().size());

    }
    @Test
    public void casRegister2(){
        Basket basket1 = new Basket("Potato");
        Basket basket2 = new Basket("Banana");
        Basket basket3 = new Basket("Apple");
        Basket basket4 = new Basket("Ketchup");


        CasRegister casRegister = new CasRegister("Basket2");
        casRegister.getLists().add(basket1);
        casRegister.getLists().add(basket2);
        casRegister.getLists().add(basket3);
        casRegister.getLists().add(basket4);
    //making a deep copy
    CasRegister casRegisterDeepCopy = new CasRegister("CasRegister2");


    //making a deep copy of object board
        CasRegister deepClonedBoard = null;
        try {
        deepClonedBoard = casRegister.deepCopy();
        deepClonedBoard.setName("casRegister2copy");
    } catch (CloneNotSupportedException e) {
        System.out.println(e);
    }

    //When
        casRegister.getLists().remove(basket1);

    //Then
        System.out.println(casRegister);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(4, deepClonedBoard.getLists().size());
        Assert.assertEquals(3, casRegister.getLists().size());

}
}

