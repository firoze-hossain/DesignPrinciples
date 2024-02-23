package com.roze.solid.openClosedPrinciple;

public class RegistrationHelper {
    public void register(Course course){
        if(course instanceof Java){
            System.out.println(((Java) course).doRegistration());
        }
        if (course instanceof Spring) {
            String doRegistration = ((Spring) course).doRegistration();
            System.out.println(doRegistration);
        }
        if (course instanceof Hibernate) {
            String doRegistration = ((Hibernate) course).doRegistration();
            System.out.println(doRegistration);
        }
        if (course instanceof MicroServices) {
            String doRegistration = ((MicroServices) course).doRegistration();
            System.out.println(doRegistration);
        }
        if (course instanceof SQL) {
            String doRegistration = ((SQL) course).doRegistration();
            System.out.println(doRegistration);
        }
    }
}
