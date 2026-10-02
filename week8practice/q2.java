import java.util.*;
import java.time.*;

class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    int days() {
        return 0;
    }
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    int days() {
        return 14;
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    int days() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    int days() {
        return 3;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.of(2023, 10, 26);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();

            String[] a = line.split("\"");
            String type = a[0].trim();
            String title = a[1];

            LibraryItem item;

            if (type.equals("BOOK"))
                item = new Book(title);
            else if (type.equals("DVD"))
                item = new DVD(title);
            else
                item = new Magazine(title);

            LocalDate due = date.plusDays(item.days());

            System.out.println(title + ": " + due);
        }
    }
}