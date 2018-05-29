package pl.sdacademy.pp.part2;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

    @Test
    void Lists() {
        CustomArrayList customArrayList = new CustomArrayList(5);
        customArrayList.add("Pierwszy");
        System.out.println(customArrayList.length());
        System.out.println(customArrayList.get(0));
        customArrayList.add("Drugi");
        customArrayList.add("Trzeci");
        System.out.println(customArrayList.length());
        System.out.println(customArrayList.get(2));
        customArrayList.remove("Drugi");
        System.out.println(customArrayList.length());
        System.out.println(customArrayList.get(1));
        customArrayList.add(1,"Drugi");
        System.out.println(customArrayList.length());
        System.out.println(customArrayList.get(1));
        customArrayList.add("Czwarty");
        System.out.println(customArrayList.length());
        System.out.println(customArrayList.get(2));
        customArrayList.removeByIndex(2);
        System.out.println(customArrayList.length());
        customArrayList.add("Czwarty");
        System.out.println(customArrayList.get(2));
        System.out.println(customArrayList.length());



    }
}