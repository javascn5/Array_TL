package com.sda.kolekcje;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CustomList<String> lista = new CustomList<>();
        lista.add("Jan1");
        lista.add("Jan2");
        lista.add("Jan3");
        lista.add("Jan4");
        lista.add("Jan5");
        lista.add("Jan6");
        lista.add("Jan7");
        lista.add("Jan8");
        lista.add("Jan9");
        lista.add("Jan10");
        lista.add("Jan11");
        lista.add("Jan12");
        lista.add("Jan13");
        lista.add("Jan14");

//lista.get(-2);
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
