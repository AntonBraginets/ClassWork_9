package Task_2;

interface Interface {
    void addUser(int ID, String login, String password, String fullName);

    void deleteUser(User user);

    void printAllUsersInfo();

    void clearDataBase();

    void changePassword(User user, String password);
}
