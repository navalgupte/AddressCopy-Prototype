package org.example;

public class RunPattern {
    public static void main(String[] args) {
        System.out.println("Example showing use of Prototype Pattern");
        System.out.println("---- ---- ---- ---- ----");
        System.out.println("Creating first address");
        Address address1 = new Address("8445 Rock Creek Trail", "Rutherford", "CA", "97128");
        System.out.println("First address created\n");
        System.out.println("    Hash Code: " + address1.hashCode());
        System.out.println(address1);
        System.out.println();
        System.out.println("Creating second address using clone() method");
        Address address2 = (Address) address1.copy();
        System.out.println("Second address created\n");
        System.out.println("    Hash Code: " + address2.hashCode());
        System.out.println(address2);
        System.out.println("---- ---- ---- ---- ----");
    }
}