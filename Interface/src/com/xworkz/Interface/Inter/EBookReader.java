package com.xworkz.Interface.Inter;

import com.xworkz.Interface.Internal.Book;
import com.xworkz.Interface.Internal.Mobile;

public class EBookReader implements Book, Mobile {
    @Override
    public void read() {
        System.out.println("running the read method in EBookReader ");
    }

    @Override
    public void open() {
        System.out.println("running the open method in EBookReader ");
    }

    @Override
    public void close() {
        System.out.println("running the close method in EBookReader ");
    }

    @Override
    public void call() {
        System.out.println("running the call method in EBookReader ");
    }

    @Override
    public void text() {
        System.out.println("running the text method in EBookReader ");
    }

    @Override
    public void browseInternet() {
        System.out.println("running the browseInternet method in EBookReader ");
    }
}
