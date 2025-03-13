package in.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCap {
        public static void main(String[] args) {
                Map<String, String> countryCapital = new HashMap<>();
                countryCapital.put("India", "New Delhi");
                countryCapital.put("USA", "Washington DC");
                countryCapital.put("France", "Paris");
                countryCapital.put("China", "Beijing");
                countryCapital.put("England", "London");
                Scanner sc = new Scanner(System.in);
                System.out.println("Please Enter Country: ");
                String country = sc.next();
                if(countryCapital.containsKey(country)){
                        capitalIS(countryCapital, country);
                } else{
                        System.out.println("Sorry, this country is not in our database");
                }
        }

        public static void capitalIS(Map<String,String> map,String country){
                System.out.println( map.get(country));
        }

}
