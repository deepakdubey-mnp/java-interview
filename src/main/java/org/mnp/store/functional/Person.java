package org.mnp.store.functional;


public record Person(String name, int age) {
    public Person{
        if(name.isEmpty())throw  new IllegalArgumentException("name is empty");
        if(age < 0)throw  new IllegalArgumentException("age is negative");
    }
    public int ageDifference(final Person person) {
        return age - person.age();
    }
}
