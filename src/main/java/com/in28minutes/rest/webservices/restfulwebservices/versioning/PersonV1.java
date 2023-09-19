package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {

    private String personName;
    public PersonV1(String personName) {
        super();
         this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    @Override
    public String toString() {
        return "PersonV1{" +
                "personName='" + personName + '\'' +
                '}';
    }
}
