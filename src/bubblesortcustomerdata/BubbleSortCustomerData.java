/*
* This program displays a welcome message to the user, then an unsorted collection
* array of customer data then displays an array of customers rating order of 
* ascending. It also displays a sorted array displayed in customer name descending.
*/
package bubblesortcustomerdata;

/**
 * @Date 8/07/2019
 * @author 92019124
 */

public class BubbleSortCustomerData {
    //Method to sort customer rating in ascending order.
     void customerRatingAscending(Customer arr[])
    {
      {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                //get customer rating method from Customer class.
                if (arr[j].getCustomerRating() > arr[j+1].getCustomerRating())
                {
                    // swap temp and arr[i]
                    Customer temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
      }
    }
     //Method to sort customer name by descending order.
     void customerNameDescending(Customer arr[])
    {
      {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                //get customer name method from Customer class.
                if (arr[j].getCustomerName().compareTo(arr[j+1].getCustomerName()) < 0)
                {
                    // swap temp and arr[i]
                    Customer temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
      }
    } 

    //Method to print out the Customer array.
    void printArray(Customer arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print( " Name: " + arr[i].getCustomerName() + " Rating: " 
                + arr[i].getCustomerRating() + " Address: " + arr[i].getCustomerAddress() +"\n");
      
    System.out.println();
    System.out.println();
       
    }

   // Driver method collection of customer data.
    public static void main(String args[])
    {
        BubbleSortCustomerData ob = new BubbleSortCustomerData();
        Customer arr[] = {
            new Customer("Tama", 2, "Auckland"),
            new Customer("Amelia", 5, "Taranaki"),
            new Customer("Kaos", 3, "Hamilton"),
            new Customer("Karl", 4, "Papatoetoe"),
            new Customer("Carlos", 5, "Glenfield"),
            new Customer("Alicia", 2, "Whangarai"),
            new Customer("Zion", 2, "Wellington"), 
            new Customer("Sara", 3, "Auckland"), 
            new Customer("Bob", 4, "Papakura"), 
            new Customer("Wiremu", 5, "Auckland"),   
        };
        
        //Print out welcome message.
        System.out.println("Welcome to Bubble sort Customer Data. \n");
        //unsorted array
        System.out.println("Original unsorted customer data collection:\n");
        ob.printArray(arr);
        
        //sorted array for customer rating ascending.
        ob.customerRatingAscending(arr);
        System.out.println("The customer array collection list Sorted by customer rating order acsending:\n");
        ob.printArray(arr); 
        
        //sorted array for customer name descending.
        ob.customerNameDescending(arr);
        System.out.println("The customer array collection list Sorted by customer name order descending:\n");
        ob.printArray(arr); 
        
    }
}
