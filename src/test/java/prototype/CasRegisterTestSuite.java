package prototype;

import org.junit.Assert;
import org.junit.Test;

public class CasRegisterTestSuite {

    @Test
    public void casRegister1() {
        //given
        Product milk = new Product("Milk", 2.20);
        Product egg = new Product("Egg", 1.20);
        Product sugar = new Product("Sugar", 5.30);


        Basket basket1 = new Basket("basket1",milk,egg,sugar);


        CasRegister casRegister = new CasRegister("Basket1",basket1);
        casRegister.getLists().add(basket1);

        CasRegister clonedBasket = null;
        try {
            clonedBasket = casRegister.shallowCopy();
            clonedBasket.setName("CasRegisterCloned");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(casRegister);
        System.out.println(clonedBasket);
        //When
        //Then
        Assert.assertEquals(3,basket1.getProduct().length);
        Assert.assertEquals(1, casRegister.getLists().size());
        Assert.assertEquals(1, clonedBasket.getLists().size());

    }
    @Test
    public void casRegister2(){
        Product potato = new Product("Potato",2.30);
        Product banana = new Product("Banana",4.20);
        Product apple = new Product("Apple",1.30);
        Product ketchup = new Product("Ketchup",4.40);

        Basket basketToRegister2 = new Basket("Basket 2" ,potato,banana,apple,ketchup);
        Basket basketToRegister3 = new Basket("Basket 3" ,potato,banana,apple,ketchup);


        CasRegister casRegister = new CasRegister("CasRegister2");
        casRegister.getLists().add(basketToRegister2);
        casRegister.getLists().add(basketToRegister3);

    //making a deep copy of object board
        CasRegister deepClonedBoard = null;
        try {
        deepClonedBoard = casRegister.deepCopy();
        deepClonedBoard.setName("casRegister2Cloned");
    } catch (CloneNotSupportedException e) {
        System.out.println(e);
    }

    //When
        casRegister.getLists().remove(basketToRegister3);

    //Then
        System.out.println(casRegister);
        System.out.println("---------------------");
        System.out.println();
        System.out.println(deepClonedBoard);
        System.out.println("---------------------");

        Assert.assertEquals(2, deepClonedBoard.getLists().size());
        Assert.assertEquals(1, casRegister.getLists().size());

    }
}

