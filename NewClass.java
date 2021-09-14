/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.stack;

/**
 *
 * @author farouk
 */
public class NewClass {
    
    int max_size;
    int top;
    
     public int item []= new int [max_size];

    public NewClass() {
        top=-1;
    } 
    
    void push (int element)
    {
    if (top>=100){System.out.println("the stack is full remove first then add");} 
    else{ top++; element = item[top];}
    }
    public boolean isempty ()
    {
    // if top < 0 will return true
    return top<0;
    }
    void pop ()
    {
    if (isempty() ) System.out.println("stack already empty");
    else top--;
    }
     void pop (int element)
    {
    if (isempty() ) System.out.println("stack already empty");
    else 
        element = item[top];
        top--;
    }
     void topelement(int element)
     {
       if (isempty() ) System.out.println("stack already empty");
       else
     element = item[top];
         System.out.println(element);
     }
    void print_All_Stack()
    
    {
    
    for(int i=top ;i < 0 ; i-- )
    
    {
    
        System.out.println( item[i] );
    
    }
    
    }
    
}
