/*Write a program that reads a list of strings, converts them to uppercase,
filters out the strings starting with a vowel, and then prints the remaining
strings*/

import java.util.*;
public class prog_5 
{
    public static void main(String[] args) 
    {
        List<String> list=Arrays.asList("Yuvraj","Aditya","Sachin","Sanket");
		
		String vowels="AEIOU";
		
		List<String> filteredlist=list.stream()
		.map(s -> s.toUpperCase())
		.filter(x->!vowels.contains(x.substring(0,1)))
		.collect(Collectors.toList());
		
		System.out.println(filteredlist);
    }

 }

//Output:
//	YUVRAJ
//	SACHIN
//	SANKET
