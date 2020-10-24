package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //1
        Book book = new Book();
        book.setTitle(JOptionPane.showInputDialog("Type the title of the book: "));
        book.setAuthor(JOptionPane.showInputDialog("Type the name of the author: "));
        book.setFiction(Boolean.valueOf(JOptionPane.showInputDialog("Is it a book of fiction?(true/false):  ")));
        book.setNumberOfPages(Integer.parseInt(JOptionPane.showInputDialog("Type number of pages: ")));
        book.setRating(Float.valueOf(JOptionPane.showInputDialog("How do you rate the book (1 to 5 star rating scale)?")));
        JOptionPane.showMessageDialog(null,"Title: "+ book.getTitle() +
                                                                    "\nAuthor: " + book.getAuthor() +
                                                                    "\nFiction: " + book.getFiction() +
                                                                    "\nNumber of pages: " + book.getNumberOfPages() +
                                                                    "\nRating: " + book.getRating());
        //2
        int x = Integer.parseInt(JOptionPane.showInputDialog("Type number of books: "));
        Book [] books = new Book[x];

        for (int i = 0; i < x ; i++) {
            books[i] = new Book();
            JOptionPane.showMessageDialog(null,"Book #"+(i+1));
            books[i].setTitle(JOptionPane.showInputDialog("Type the title of the book: "));
            books[i].setAuthor(JOptionPane.showInputDialog("Type the name of the author: "));
            books[i].setFiction(Boolean.valueOf(JOptionPane.showInputDialog("Is it a book of fiction?(true/false):  ")));
            books[i].setNumberOfPages(Integer.valueOf(JOptionPane.showInputDialog("Type number of pages: ")));
            books[i].setRating(Float.valueOf(JOptionPane.showInputDialog("How do you rate the book (1 to 5 star rating scale)?")));
        }

        JOptionPane.showMessageDialog(null,"Books are:");
        for (int i = 0; i < x ; i++) {
            JOptionPane.showMessageDialog(null,books[i].toString());

        }
    }
}
