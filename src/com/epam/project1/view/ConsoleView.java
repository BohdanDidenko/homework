package com.epam.project1.view;

import java.util.List;
import java.util.Scanner;

public class ConsoleView implements View, ConsoleMessage {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Scanner getRequestFromUser() {
        return scanner;
    }

    @Override
    public void showMenu() {
        showMessage(ConsoleMessage.MAIN_MENU);
    }

    @Override
    public <String>void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public <E> void showList(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    @Override
    public <E> void showList(List<E> list, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));
        }
    }
}
