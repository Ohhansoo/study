package com.example.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer stk = new StringTokenizer(str, " ");

        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((A+B)%C);
        sb.append("\n");
        sb.append(((A%C)+(B%C))%C);
        sb.append("\n");
        sb.append((A*B)%C);
        sb.append("\n");
        sb.append(((A%C)*(B%C))%C);
        System.out.println(sb);

    }
}
