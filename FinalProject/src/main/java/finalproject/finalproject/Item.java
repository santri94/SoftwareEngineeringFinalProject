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
    public double price;
    
    
    public Item(String itemId, String itemName, int orderQty, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.orderQty = orderQty;
        this.price = price;
        
    }
}
