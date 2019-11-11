package pojo;

/**
 * Package: pojo
 * Author: ad
 * Date: Created in 2019/11/10 21:59
 **/
public class Student {
    private String name;//姓名
    private int age;//年龄
    private int score;//分数
    private String address;//地址	

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }	

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
