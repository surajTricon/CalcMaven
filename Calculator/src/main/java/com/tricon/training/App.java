package com.tricon.training;
import com.tricon.training.add.AddClass;
import com.tricon.training.div.DivideClass;
import com.tricon.training.sub.SubtractClass;
import com.tricon.training.mul.MultiplyClass;
public class App {
    public static void main(String[] args) {
        AddClass a = new AddClass();
       SubtractClass s = new SubtractClass();
        MultiplyClass m = new MultiplyClass();
        DivideClass d = new DivideClass();
        int x = 86;        int y = 9;
        System.out.println("Addition: " + a.add(x, y));
       System.out.println("Subtraction: " + s.sub(x, y));
        System.out.println("Multiplication: " + m.mul(x, y));
        System.out.println("Division: " + d.divide(x, y));
    }}