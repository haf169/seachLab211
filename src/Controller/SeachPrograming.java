/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

/**
 *
 * @author Tran HaF
 */
public class SeachPrograming extends Menu<String>{
    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    public SeachPrograming(Element element) {
        super("PROGRAMING SEACH", mc);
        this.library = library;
        this.algorithm = algorithm;
        this.array = array;
        this.size_array = size_array;
        size_array = element.getSize_array();
        array = element.getArray();
    }

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;
    
    public void execute(int n) {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        switch (n) {
            case 1:
                System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array,array.length,value));
                break;
            case 2:
                System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                break;
            case 3:
                System.exit(0);
        }
 
    }
}
