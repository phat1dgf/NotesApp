import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedListNote Notes = new LinkedListNote();
        int option;
        do {
            System.out.println("1. Display");
            System.out.println("2. Add");
            System.out.println("3. Edit");
            System.out.println("4. Delete");
            option = sc.nextInt();
            switch (option) {
                case 1 -> Notes.display();
                case 2 -> Notes.addNote();
                case 3 -> {
                    String nameNote;
                    sc.nextLine();
                    System.out.print("Enter the name of the note to edit: ");
                    nameNote = sc.nextLine();
                    Notes.update(nameNote);
                }
                case 4 -> {
                    String nameNote;
                    sc.nextLine();
                    System.out.print("Enter the name of the note to delete: ");
                    nameNote = sc.nextLine();
                    Notes.delete(nameNote);
                }
            }
        } while (0 < option && option < 5);
    }
}