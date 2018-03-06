package com.swift.academy.annotations;

import java.lang.annotation.Annotation;

@ClassInfo(author = "Peter Petrov", date = "11/09/2011")
public class AnnotationsExample {

    public static void main(String[] args) {
        AnnotationsExample.class.getDeclaredAnnotation(ClassInfo.class);

        AnnotationsExample annotationsExample = new AnnotationsExample();

        Annotation[] annotations = annotationsExample.getClass().getDeclaredAnnotations();

        for (Annotation annotation: annotations) {
            System.out.println(annotation.toString());
        }

        annotationsExample.toString();
    }


    @Override
    @Deprecated
    public String toString() {
        return super.toString();
    }


    class Person {

        void getAge() {

        }

        /**
         * Use getFullName instead
         */
        @Deprecated
        void getName() {

        }
    }

    class Student extends Person {

        @Override
        void getAge() {
            super.getName();
        }


    }
}
