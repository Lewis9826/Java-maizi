package zhang.test.test4;

/**
 * @author Lewis
 */
public class User implements Comparable<User>{
    private String name;

    private int balance;

    private int age;

    public User(String name, int balance, int age){
        this.name = name;
        this.balance = balance;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }

}
