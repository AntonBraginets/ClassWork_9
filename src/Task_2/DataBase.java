package Task_2;

import java.util.ArrayList;

public class DataBase implements Interface {
    ArrayList<User> al = new ArrayList<>();

    @Override
    public void addUser(int ID, String login, String password, String fullName) {
        al.add(new User(ID, login, password, fullName));
    }

    @Override
    public void deleteUser(User user) {
        if (al.contains(user))
            al.remove(user);
    }

    @Override
    public void printAllUsersInfo() {
        for (User user :
                al) {
            System.out.println(user.getID());
            System.out.println(user.getLogin());
            System.out.println(user.getPassword());
            System.out.println(user.getFullName());
            System.out.println();
        }
    }

    @Override
    public void clearDataBase() {
        al.clear();
        System.out.println("Collection has been cleared!");
    }

    @Override
    public void changePassword(User user, String password) {
        user.setPassword(password);
    }
}
