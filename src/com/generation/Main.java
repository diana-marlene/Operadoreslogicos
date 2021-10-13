package com.generation;

public class Main {
    public static void main(String[] args){
        boolean x = true;
        boolean y = false;
        boolean z = true;

        boolean a,b,c,d,e,f;

        a = (x && y) || (x && z);
        b = (x || !y)&& (!x || z);
        c = x || y && z;
        d = !(x || y) && z;
        e = x || y || x && !z && !y;
        f = !x || !y || z && x && !y;

        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        System.out.println("d) "+d);
        System.out.println("e) "+e);
        System.out.println("f) "+f);
    }
}
