package org.example;

public class Person {

   int[] quantities;
    int total;
    int id =0;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public void setQuantities(int[] quantities) {
        this.quantities = quantities;

    }

    public Person(int[] quantities,int id) {
        this.quantities = quantities;
        this.id= id;
        this.total = 0;
        calculateTotal();
    }
    public int  getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Person() {
        this.total = 0;
    }


    public  void calculateTotal()
    {
        int sum =0;
        for(Breakfast item :Breakfast.values())
        {
            sum+= (item.getPrice()*quantities[item.getCode()]);
        }
        this.total=sum;
    }
}
