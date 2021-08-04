package Pages;

import javax.swing.JFrame;

public class Navigation {

    // Global methods for navigation to different pages
    // Each method takes caller parameter as JFrame, so that we can
    // dispose it and show new window instead
    public static void NavigateHome(JFrame caller) {
        caller.dispose();
        Dashboard window = new Dashboard();
        window.setVisible(true);
    }

    public static void NavigateAccounts(JFrame caller) {
        caller.dispose();
        Accounts window = new Accounts();
        window.setVisible(true);
    }

    public static void NavigateProfile(JFrame caller) {
        caller.dispose();
        EditProfile window = new EditProfile();
        window.setVisible(true);
    }

    public static void NavigateUsers(JFrame caller) {
        caller.dispose();
        Users window = new Users();
        window.setVisible(true);
    }

    public static void Logout(JFrame caller) {
        // clear global variables
        GlobalStorage.first_name = "";
        GlobalStorage.last_name = "";
        GlobalStorage.user_role = "";
        GlobalStorage.userId = "";

        caller.dispose();
        Login window = new Login();
        window.setVisible(true);
    }
}
