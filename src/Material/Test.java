package Material;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListManage listManage = new ListManage(scanner);
        int choice;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Display ListMaterial");
            System.out.println("2. Add ListMaterial");
            System.out.println("3. Update ListMaterial");
            System.out.println("4. Delete ListMaterial");
            System.out.println("5. Price difference");
            System.out.println("0. Exit");
            System.out.println("Enter choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println("______________________________________________________________________");
            switch (choice) {
                case 1:
                    listManage.disPlayListMaterial();
                    break;
                case 2:
                    listManage.addMaterial();
                    break;
                case 3:
                    listManage.updateMaterial();
                    break;
                case 4:
                    listManage.deleteMaterial();
                    break;
                case 5:
                    listManage.priceDifference();
                    break;

            }

        } while (choice != 0);

    }

}
