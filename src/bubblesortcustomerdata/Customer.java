/*
* This program displays a welcome message to the user, then an unsorted collection
* array of customer data, then displays an array of customers rating order of 
* ascending. It also displays a sorted array displayed in customer name descending.
*/
package bubblesortcustomerdata;

/**
 * @Date 8/07/2019
 * @author 92019124
 */

public class Customer{//Public class Customer.
    
    private final String name;//Set variable name to String type.
    private final int rating;//Set variable rating to int type.
    private final String address;//Set variable address to String type.
    
    // getCustomerName getter method.
    public String getCustomerName(){
    return name;
    }
    //getCustomerRating getter method.
    public int getCustomerRating(){
    return rating;
    }
    //getCustomerAddress getter method.
    public String getCustomerAddress(){
    return address;
    }
    //Customer Constructor.
    public Customer(String customerName, int customerRating, String customerAddress){
    name = customerName;//Variable name set to customerName.
    rating = customerRating;//variable rating set to customerRating.
    address = customerAddress;//Variable address set to customerAddress.
    }
}
