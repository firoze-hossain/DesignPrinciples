package com.roze.solid.openClosedPrinciple.test;

import com.roze.solid.openClosedPrinciple.*;

public class CoursePrinterTest {
    public void test_print() {
        new CoursePrinter().print(new Java());
        new CoursePrinter().print(new Spring());
        new CoursePrinter().print(new Hibernate());
        new CoursePrinter().print(new MicroServices());
        new CoursePrinter().print(new SQL());
    }
    /*
     Expected output:
     Java File Handling
    Java Collection
    Java Stream API
    Java Concurrency
    Spring Core
    Spring mvc
    Spring Boot
    Spring Security
    Hibernate Basic Concept
    Deep dive into MicroServices for 20 hours
*/
    /*
    actual output:

Java File Handling
Java Collection
Java Stream API
Java Concurrency
Spring Core
Spring mvc
Spring Boot
Spring Security
Hibernate Basic Concept
Deep dive into MicroServices for 20 hours
Indexing
Joining
function
    */

    public static void main(String[] args) {
        new CoursePrinterTest().test_print();
    }
}
