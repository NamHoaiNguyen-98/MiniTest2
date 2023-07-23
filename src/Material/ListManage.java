package Material;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ListManage {
    ArrayList<Material> list;
    private final Scanner scanner;

    public ListManage(Scanner scanner) {
        this.scanner = scanner;
        this.list = new ArrayList<>();
    }

    public void disPlayListMaterial() {
//        LocalDate localDate1 = LocalDate.of(2023, 7, 10);
//        CrispyFlour crispyFlour1 = new CrispyFlour("Cr1", "Fl1", localDate1, 5000, 100);
//        CrispyFlour crispyFlour2 = new CrispyFlour("Cr2", "Fl2", localDate1, 5000, 500);
//        CrispyFlour crispyFlour3 = new CrispyFlour("Cr3", "Fl3", localDate1, 5000, 80);
//        CrispyFlour crispyFlour4 = new CrispyFlour("Cr4", "Fl4", localDate1, 5000, 120);
//        CrispyFlour crispyFlour5 = new CrispyFlour("Cr5", "Fl5", localDate1, 5000, 10);
//        LocalDate localDate2 = LocalDate.of(2023, 7, 14);
//        Meat meat1 = new Meat("M1", "meat_1", localDate2, 60000, 1.5);
//        Meat meat2 = new Meat("M2", "meat_2", localDate2, 60000, 1.8);
//        Meat meat3 = new Meat("M3", "meat_3", localDate2, 60000, 2.2);
//        Meat meat4 = new Meat("M4", "meat_4", localDate2, 60000, 1.0);
//        Meat meat5 = new Meat("M5", "meat_5", localDate2, 60000, 1.2);
//        list.add(crispyFlour1);
//        list.add(crispyFlour2);
//        list.add(crispyFlour3);
//        list.add(crispyFlour4);
//        list.add(crispyFlour5);
//        list.add(meat1);
//        list.add(meat2);
//        list.add(meat3);
//        list.add(meat4);
//        list.add(meat5);
        for (Material material : list) {
            System.out.println(material);
        }

    }

    public void addMaterial() {
        int choice;
        do {
            System.out.println("Menu AddMaterial: ");
            System.out.println("1. Add CrispyFlour");
            System.out.println("2. Add Meat");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Input id: ");
                    String id = scanner.nextLine();
                    System.out.println("Input name: ");
                    String name = scanner.nextLine();
                    System.out.println("Input manufacturingDate: yyyy-MM-dd");
                    String manufacturingDateString = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate manufacturingDate = LocalDate.parse(manufacturingDateString, formatter);
                    System.out.println("Input cost: ");
                    Integer cost = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input quantity: ");
                    Integer quantity = Integer.parseInt(scanner.nextLine());
                    CrispyFlour crispyFlour = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
                    list.add(crispyFlour);
                    break;
                case 2:
                    System.out.println("Input id: ");
                    String id_2 = scanner.nextLine();
                    System.out.println("Input name: ");
                    String name_2 = scanner.nextLine();
                    System.out.println("Input manufacturingDate: yyyy-MM-dd");
                    String manufacturingDateString_2 = scanner.nextLine();
                    DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate manufacturingDate_2 = LocalDate.parse(manufacturingDateString_2, formatter_2);
                    System.out.println("Input cost: ");
                    Integer cost_2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input weight: ");
                    Double weight = Double.parseDouble(scanner.nextLine());
                    Meat meat = new Meat(id_2, name_2, manufacturingDate_2, cost_2, weight);
                    list.add(meat);
                    break;
            }
        } while (choice != 0);
    }

    public void updateMaterial() {
        int choice;
        do {
            System.out.println("Menu UpdateMaterial: ");
            System.out.println("1. Update CrispyFlour");
            System.out.println("2. Update Meat");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("input check id: ");
                    String idCheck = scanner.nextLine();
                    int index = getIndex(idCheck);
                    if (index != -1) {
                        System.out.println("Enter new id: ");
                        String id = scanner.nextLine();
                        list.get(index).setId(id);
                        System.out.println("Enter new name: ");
                        String name = scanner.nextLine();
                        list.get(index).setName(name);
                        System.out.println("Enter new manufacturingDate: yyyy-MM-dd");
                        String manufacturingDateString = scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate manufacturingDate = LocalDate.parse(manufacturingDateString, formatter);
                        list.get(index).setManufacturingDate(manufacturingDate);
                        System.out.println("Enter new cost: ");
                        Integer cost = Integer.parseInt(scanner.nextLine());
                        list.get(index).setCost(cost);
                        System.out.println("Enter new quantity: ");
                        Integer quantity = Integer.parseInt(scanner.nextLine());
                        if (list.get(index) instanceof CrispyFlour) {
                            ((CrispyFlour) list.get(index)).setQuantity(quantity);
                        }
                        break;


                    } else {
                        System.out.println("No id of List");

                    }
                    break;
                case 2:
                    System.out.println("input check id: ");
                    String idCheck1 = scanner.nextLine();
                    int index1 = getIndex(idCheck1);
                    if (index1 != -1) {
                        System.out.println("Enter new id:  ");
                        String id = scanner.nextLine();
                        list.get(index1).setId(id);
                        System.out.println("Enter new name: ");
                        String name = scanner.nextLine();
                        list.get(index1).setName(name);
                        System.out.println("Enter new manufacturingDate: yyyy-MM-dd");
                        String manufacturingDateString = scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate manufacturingDate = LocalDate.parse(manufacturingDateString, formatter);
                        list.get(index1).setManufacturingDate(manufacturingDate);
                        System.out.println("Enter new cost: ");
                        Integer cost = Integer.parseInt(scanner.nextLine());
                        list.get(index1).setCost(cost);
                        System.out.println("Enter new quantity: ");
                        Double quantity = Double.parseDouble(scanner.nextLine());
                        if (list.get(index1) instanceof Meat) {
                            ((Meat) list.get(index1)).setWeight(quantity);
                        }
                        break;
                    } else {
                        System.out.println("No id of List");

                    }
                    break;
            }
        } while (choice != 0);
    }

    public void deleteMaterial() {
        System.out.println("input check id: ");
        String idCheck = scanner.nextLine();
        int index = getIndex(idCheck);
        if (index != -1) {
            list.remove(index);
            System.out.println("Successful Delete");
        } else {
            System.out.println("No id of List");
        }
    }

    public void priceDifference() {
        int choice;
        do {
            System.out.println("Menu Price Difference: ");
            System.out.println("1. Price CrispyFlour");
            System.out.println("2. Price Meat");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("input check id: ");
                    String idCheck = scanner.nextLine();
                    int index = getIndex(idCheck);
                    if (index != -1) {
                        if (list.get(index) instanceof CrispyFlour) {
                            System.out.println("Amount Money= " + ((CrispyFlour) list.get(index)).getAmount());
                            System.out.println("Real Money= " + ((CrispyFlour) list.get(index)).getRealMoney());
                        }
                        break;
                    } else {
                        System.out.println("No id of List");
                        break;
                    }
                case 2:
                    System.out.println("input check id: ");
                    String idCheck1 = scanner.nextLine();
                    int index1 = getIndex(idCheck1);
                    if (index1 != -1) {
                        if (list.get(index1) instanceof Meat) {
                            System.out.println("Amount Money= " + ((Meat) list.get(index1)).getAmount());
                            System.out.println("Real Money= " + ((Meat) list.get(index1)).getRealMoney());
                        }
                        break;
                    } else {
                        System.out.println("No id of List");
                        break;
                    }
            }
        } while (choice != 0);
    }

    private int getIndex(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;

            }

        }
        return -1;
    }
}