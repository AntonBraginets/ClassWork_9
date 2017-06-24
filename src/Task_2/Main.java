package Task_2;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.addUser(1, "login1", "password1", "Ivanov Ivan Ivanovich");
        dataBase.addUser(2, "login2", "password2", "Petrov Petr Petrovich");
        dataBase.addUser(3, "login3", "password3", "Sidorov Sidr Sidorovich");
        //dataBase.deleteUser(dataBase.al.get(1));
        //dataBase.printAllUsersInfo();
        //dataBase.clearDataBase();
        dataBase.changePassword(dataBase.al.get(1), "NEWpassword");
        dataBase.printAllUsersInfo();
    }
}
