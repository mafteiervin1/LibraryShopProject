/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryShop;

/**
 *
 * @author Bogdan
 */
public class Price {
    private String name;
    private int price;

    public Price(String Name, int Price)
    {
        this.name=Name;
        this.price=Price;
    }
    @Override
    public String toString(){ return this.name + " - " + this.price; }
}

