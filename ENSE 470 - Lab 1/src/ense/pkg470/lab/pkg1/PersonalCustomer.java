/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ense.pkg470.lab.pkg1;
/**
 *
 * @author Dolan
 */
public class PersonalCustomer extends BusinessCustomer
{
   
    public PersonalCustomer()
    {
        this.name = "";
        this.address = "";
        this.creditRating = 0;
    }  
    
    public PersonalCustomer(String inName, String inAddress, int inCreditRating)
    {
        this.name = inName;
        this.address = inAddress;
        this.creditRating = inCreditRating;
    }
};
