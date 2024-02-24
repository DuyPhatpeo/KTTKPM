package creational.singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User phat = new User("Phat");
        User lam = new User("Lam");
        User dan = new User("Dan");
        User phuc = new User("Phuc");
        phat.vote(Candidate.TRUMP);
        phat.vote(Candidate.TRUMP);
        lam.vote(Candidate.TRUMP);
        dan.vote(Candidate.TRUMP);
        phuc.vote(Candidate.BIDEN);
        Election.getInstance().inKetQua();
    }
}
