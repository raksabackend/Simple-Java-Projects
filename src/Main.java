import java.util.*;

public class Main {

    // An array list of strings to store the tasks
    private static ArrayList<String> tasks = new ArrayList<String>();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int choice;

        while(true) {

            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Edit Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {

                choice = in.nextInt();

                switch(choice){

                    case 1:
                        addTask();
                        break;

                    case 2:
                        completeTask();
                        break;

                    case 3:
                        editTask();
                        break;

                    case 4:
                        viewTasks();
                        break;

                    case 5:
                        exit();
                        break;

                    default:

                        System.out.println("Invalid choice. Please try again");
                        break;
                }

            } catch (InputMismatchException e){

                System.out.println("Invalid input. Please enter a number: ");
                in.nextLine();
            }

        }

    }

    private static void addTask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Task: ");
        tasks.add(in.nextLine());
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display");
        }else{

            for(int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void completeTask() {

        Scanner in = new Scanner(System.in);
        int taskNum;

        viewTasks();
        System.out.println("Enter task number to complete: ");

        try {

            taskNum = in.nextInt();
            if(taskNum <=0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }

        }catch (InputMismatchException e){

            System.out.println("Invalid input. Please enter a number");

        }catch (IndexOutOfBoundsException e) {

            System.out.println("Invalid task number. Please try again");

        }


    }

    public static void editTask() {

        Scanner in = new Scanner(System.in);
        int taskNum;
        String newTask;

        viewTasks();

        System.out.println("Enter task number to edit: ");

        try {

            taskNum = in.nextInt();
            if(taskNum <= 0 || taskNum > tasks.size()) {
                throw new IndexOutOfBoundsException();
            }

            System.out.println("Enter new task description: ");
            newTask = in.nextLine();
            tasks.set(taskNum-1,newTask);

        }catch (InputMismatchException e) {

            System.out.println("Invalid input. Please enter a number");
            in.nextLine();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid task number. Please try again");
        }

    }

    private static void exit() {
        System.out.println("Exiting Program");
        System.exit(0);
    }

}