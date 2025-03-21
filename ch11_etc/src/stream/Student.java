package stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

// @Getter
// @AllArgsConstructor
public class Student {
    private System name;
    private int math;

    public System getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    public void setName(System name) {
        this.name = name;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", math=" + math + "]";
    }

    public Student(System name, int math) {
        this.name = name;
        this.math = math;
    }

}
