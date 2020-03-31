/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.FoodItems;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Order {
    private int orderId;
    private static int counter=1;
    private String restaurantName;
    private String status;
    private String deliveryManName;
    private String deliveryManUserName;
    private String customerName;
    private int customerId;
    private int deliveryManId;
    private String  customerUserName;
    private ArrayList<FoodItems> itemsList;
    private String customerNotes;
    private String feedback;
    
      public Order() {
        orderId = counter;
        ++counter;
        itemsList=new ArrayList<FoodItems>();
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getDeliveryManId() {
        return deliveryManId;
    }

    public void setDeliveryManId(int deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getDeliveryManUserName() {
        return deliveryManUserName;
    }

    public void setDeliveryManUserName(String deliveryManUserName) {
        this.deliveryManUserName = deliveryManUserName;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

      
      
    public ArrayList<FoodItems> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<FoodItems> itemsList) {
        this.itemsList = itemsList;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public FoodItems addItem(){
        FoodItems item = new FoodItems(); 
        itemsList.add(item);
        return item;
    } 
      
      public void deleteItem(FoodItems item){
        itemsList.remove(item); 
    }
    @Override
    public String toString() {
        return Integer.toString(this.orderId);
    }
}
