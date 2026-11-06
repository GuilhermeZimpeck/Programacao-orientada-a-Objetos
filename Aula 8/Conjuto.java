/*---------------------------------------

Conjuntos:
são grupos de itens assim como as lists,
porem ele ignora ordem e repetições.

----------------------------------------*/

import  java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet x = new HashSet();
        x.add("casa");
        x.add("mesa");
        x.add("casa");
        x.add("toalha");
        x.add("bola");
        System.out.println(x);
        System.out.println(x.size());
    }
}
