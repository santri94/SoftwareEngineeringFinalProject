/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.finalproject;

/**
 *
 * @author santi
 */
public class Item {
    
    public String itemId;
    public String itemName;
    public int orderQty;
    public double totalPrice; // this price could be the price for one or more items of the same class
    
    
    public Item(String itemId, String itemName, int orderQty, double totalPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.orderQty = orderQty;
        this.totalPrice = totalPrice;
        
    }
}
