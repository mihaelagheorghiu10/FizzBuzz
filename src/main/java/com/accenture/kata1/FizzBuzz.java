package com.accenture.kata1;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class FizzBuzz {
    //*public String execute(int i){
    //return "hola";


    public String execute(int i) {
        if (i % 15 == 0) {return "FizzBuzz";}
        if (i % 3 == 0) {return "Fizz";}
        if (i % 5 == 0) {return "Buzz";}
        return "null";}

}






