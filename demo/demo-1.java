/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambdaExpressionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author hv
 */
public class demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MathOperation multiplication;
        multiplication = (int a, int b) -> {
            return a * b;
        };
        MathOperation division;
        division = (a, b) -> a / b;

        System.out.println("3*4=" + multiplication.operation(3, 4)); // nhan
        System.out.println("12/4=" + division.operation(12, 4)); // chia
        List<Integer> lst = Arrays.asList(1, 3, 5, 4, 6, 8, 9, 10);
        String seperator = ", ";
        lst.stream().forEach((i) -> {
            System.out.print(i.toString() + seperator);
        });
        Collections.sort(lst, (o1, o2) -> o2.compareTo(o1));
        System.out.println("lst sorted: " + lst.toString());

        List<Student> lstStudent = new ArrayList<>();
        lstStudent.add(new Student("Thanh", 8.5));
        lstStudent.add(new Student("Anh", 9));
        lstStudent.add(new Student("Duyen", 7.5));
        
        System.out.println("Name sort: ");
        Collections.sort(lstStudent, (Student o1, Student o2) -> o1.name.compareTo(o2.name));
        lstStudent.stream().forEach((s) -> {
            System.out.println(s.toString());
        });
        
        System.out.println("Mark sort: ");
        Collections.sort(lstStudent, (Student o1, Student o2) -> Double.compare(o1.mark, o2.mark));
        lstStudent.stream().forEach((s) -> {
            System.out.println(s.toString());
        });
    }

}

interface MathOperation {

    int operation(int a, int b);
//    <T>  T operation(T a, T b) ;
//    double operation(double... p);    
}
