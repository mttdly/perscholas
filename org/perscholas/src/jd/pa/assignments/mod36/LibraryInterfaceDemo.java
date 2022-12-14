package org.perscholas.src.jd.pa.assignments.mod3036.mod30363;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Implementing getters and setters would improve security

        // Test case #1:
        KidUser kidUser = new KidUser(10, "Kids");
        KidUser kidUser2 = new KidUser(18, "Fiction");
        kidUser.registerAccount();
        kidUser.requestBook();
        kidUser2.registerAccount();
        kidUser2.requestBook();

        // Test case #2:
        AdultUser adultUser = new AdultUser(5, "Kids");
        AdultUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser.registerAccount();
        adultUser.requestBook();
        adultUser2.registerAccount();
        adultUser2.requestBook();
    }
}

interface LibraryUser {
    public void registerAccount();
    public void requestBook();
}

class KidUser implements LibraryUser {
    int age;
    String bookType;

    KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else if (age > 11) {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {
    int age;
    String bookType;


    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else if (age <= 11) {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

