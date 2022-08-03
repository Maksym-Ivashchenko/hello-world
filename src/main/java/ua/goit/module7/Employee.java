package ua.goit.module7;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.id == employee.id && Objects.equals(this.name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id < o.id) {
            return -1;
        } if (this.id > o.id) {
            return 1;
        }
        return 0;
    }
}
