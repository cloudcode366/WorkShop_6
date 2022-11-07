package model;

public class Student {
    private String code;
    private String name;
    private double mark;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Student() {

    }

    public Student(String code, String name, double mark) {
        setCode(code);
        setName(name);
        setMark(mark);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Code:" + getCode() + ", Name:" + getName() + ", Mark:" + getMark();
    }
}
