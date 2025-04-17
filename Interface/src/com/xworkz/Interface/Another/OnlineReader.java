package com.xworkz.Interface.Another;

import com.xworkz.Interface.Internal.Book;
import com.xworkz.Interface.Internal.Mobile;
import com.xworkz.Interface.Internal.Router;

public class OnlineReader implements Book, Mobile, Router {

    @Override
    public void read() {
        System.out.println("running the read method in EBookReader");
    }

    @Override
    public void open() {
        System.out.println("running the open method in EBookReader");
    }

    @Override
    public void close() {
        System.out.println("running the close method in EBookReader");
    }

    @Override
    public void call() {
        System.out.println("running the call method in EBookReader");
    }

    @Override
    public void text() {
        System.out.println("running the text method in EBookReader");
    }

    @Override
    public void browseInternet() {
        System.out.println("running the browseInternet method in EBookReader");
    }

    @Override
    public void connect() {
        System.out.println("running the connect method in EBookReader");

    }

    @Override
    public void disconnect() {
        System.out.println("running the disconnect method in EBookReader");

    }

    @Override
    public void reset() {
        System.out.println("running the reset method in EBookReader");

    }
}
