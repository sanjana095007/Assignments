package com.xworkz.Instance.Animal;

public class Colubridae extends Snake {
    public void hunt(Snake snake){
        snake.slither();
        if(snake instanceof Colubridae){
            System.out.println("is snake a Colubridae");
            Colubridae colubridae = (Colubridae) snake;
            colubridae.crawl();
        }
    }

    public void crawl(){
        System.out.println("running the crawl method");
    }
}

