package day5_oop;
// Question1:Printthesum,differenceandproductoftwocomplexnumbersbycreatingaclassnamed'Complex'withseparatemethodsforeachoperationwhoserealandimaginaryparts are entered by the user

import java.util.*;


public class Solution {
    public static void main(String[] args){
        complex a = new complex(7, 8);
        complex b = new complex(2, 5);
        
        complex m = complex.add(a, b);
        complex.printComplex(m);
        
        complex n = complex.sub(a, b);
        complex.printComplex(n);
        
        complex o = complex.mul(a, b);
        complex.printComplex(o);
    }
}
 class complex {
    
    int real;
    int imag;
 
    
    
    public complex(int r, int i){
        real = r;
        imag = i;
    }
    
    public static complex add(complex a, complex b){
        complex c = new complex(0, 0);
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    
    public static complex sub(complex a, complex b){
        complex c = new complex(0, 0);
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }
    
    public static complex mul(complex a, complex b){
        int x = a.real;
        int y = a.imag;
        
        int p = b.real;
        int q = b.imag;
        
        complex c = new complex(0, 0);
        c.real = x * p - y * q;
        c.imag = x * q + p * y;
        return c;
    }
    
    public static void printComplex(complex c){
        if(c.real == 0 && c.imag != 0){
            System.out.println(c.imag + "i");
        }
        else if(c.imag == 0 && c.real != 0){
            System.out.println(c.real);
        }else{
            System.out.println(c.real + "+" + c.imag + "i");
        }
    }
}


