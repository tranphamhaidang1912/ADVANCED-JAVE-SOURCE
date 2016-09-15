/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpressionDemo;

/**
 *
 * @author hv
 */
public class Student {

    @Override
    public String toString() {
        return this.name + "--" + this.mark; 
    }

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }
    String name;
    double mark;    
}
