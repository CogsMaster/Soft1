package com.company;


public class Main {

    public static void main(String[] args) {
        Employee tester = new Employee(7, "Developer");
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
    static class Employee {
        private long id;
        private String vacancy;

        public Employee(int id, String vacancy) {
            this.id = id;
            this.vacancy = vacancy;
        }

        String getVacancy() {
            return vacancy;
        }
        long getId() {
            return id;
        }
    }


    }

