package zhang.test.test4;

import java.util.*;

/**
 * @author Lewis
 */
public class App {
    public static void main(String[] args) {

        User user1 = new User("张先生", 1000,20);
        User user2 = new User("李先生",10000000,25);
        User user3 = new User("刘女士",100000,40);

        TreeSet<User> treeSetAge = new TreeSet<>();
        treeSetAge.add(user1);
        treeSetAge.add(user2);
        treeSetAge.add(user3);
        for (User user:treeSetAge) {
            System.out.println(user.getName()+": "+user.getAge()+": "+user.getBalance());
        }

        List<User> userList = new ArrayList<>();
        Collections.sort(userList, Comparator.comparingInt(User::getBalance)
        );
        TreeSet<User> treeSetBalance = new TreeSet<>(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getBalance() - o2.getBalance();
            }
        });


        treeSetBalance.add(user1);
        treeSetBalance.add(user2);
        treeSetBalance.add(user3);


        for (User user:treeSetBalance) {
            System.out.println(user.getName()+": "+user.getAge()+": "+user.getBalance());
        }
    }

}
