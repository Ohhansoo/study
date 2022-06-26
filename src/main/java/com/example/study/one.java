package com.example.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        for(int i =0; (str = br.readLine()) != null; i++){
            int A = Integer.parseInt(str);
            int count = 1;
            int result = 1;
            while(result % A != 0){
                result = (result * 10 + 1) % A;
                count++;
            }
            System.out.println(count);
        }
    }
}
