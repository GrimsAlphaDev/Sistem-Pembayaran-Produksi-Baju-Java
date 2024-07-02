package Session;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class session {

    private static int customerId;
    private static int role;
    private static String name;

    public static void setCustomerId(int id) {
        customerId = id;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public static void setRole(int userRole) {
        role = userRole;
    }

    public static int getRole() {
        return role;
    }

    public static void setUsername(String username) {
        name = username;
    }

    public static String getName() {
        return name;
    }

    public static void logout() {
        customerId = 0;
        role = 0;
        name = null;
    }
}
