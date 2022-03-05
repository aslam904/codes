package aslam;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeScreen implements Screen{
    private String welcomeText = "Welcome to LockedMe.com";
    private String developerText = "Developer: MOHAMEDASLAM O M";


    public void introWS() {
        System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
        Show();
    }



    @Override
    public void Show() {
        System.out.println("1. Show Files ");
        System.out.println("2. Show File Options Menu");
        System.out.println("3. Quit");
    }

    public void GetUserInput() {

        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }

    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                this.Show();

                break;

            case 2: // Show File Options menu
                ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();

                this.Show();

                break;

            default:
                System.out.println("Invalid Option");
                break;
        }

    }

    public void ShowFiles() {

        System.out.println("List of Files: ");
        DirectoryService.PrintFiles();

    }

    private int getOption() {
        Scanner in = new Scanner(System.in);

        int option = 0;
        try {
            option = in.nextInt();
        }
        catch (Exception e) {

        }
        return option;

    }
}
