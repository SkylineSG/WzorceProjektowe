package prototype;

import java.util.HashSet;
import java.util.Set;

public class CasRegister extends Prototype {
    private String name;
    private Set<Basket> lists = new HashSet<>();
    private Basket[] baskets;

    public CasRegister(String name,Basket... baskets) {
        this.name = name;
        this.baskets = baskets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Basket[] getBaskets(Product[] product) {
        return baskets;
    }

    public String getName() {
        return name;
    }

    public Set<Basket> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "CarRegister [" + name + "]\n";
        for(Basket list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public CasRegister shallowCopy() throws CloneNotSupportedException {
        return (CasRegister)super.clone();
    }

    public CasRegister deepCopy() throws CloneNotSupportedException {
        CasRegister clonedBoard = (CasRegister)super.clone();
        clonedBoard.lists = new HashSet<>();
        for(Basket theList : lists) {
            Basket clonedList = new Basket(theList.getName());
            for(Product task : theList.getProducts()) {
                clonedList.getProducts().add(task);
            }
            clonedBoard.getLists().add(clonedList);
        }
        return clonedBoard;
    }





}
