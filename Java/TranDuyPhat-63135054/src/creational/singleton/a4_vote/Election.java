package creational.singleton.a4_vote;

public class Election {
    //khai bao bien instance
    public static  Election instance;
    int trump = 0, biden = 0;
    //phuong thuc khoi tao
    private Election(){
    }
    //phuong thuc getInstance de tra ve bien instance
    public static Election getInstance(){
        if(instance == null)
            instance = new Election();
        return instance;
    }
    public  void vote(Candidate c){
        if(c == Candidate.BIDEN)
            biden++;
        else if(c == Candidate.TRUMP)
            trump++;
    }
    public void inKetQua(){
        System.out.println("Trump: " + trump);
        System.out.println("Biden: " + biden);
    }
}
