package creational.singleton.vote;

import java.util.Scanner;

public class User {
    String ten;
    public User(String ten){
        this.ten = ten;
    }
    public void vote(Candidate c){
        Election.getInstance().vote(c);
    }
}
