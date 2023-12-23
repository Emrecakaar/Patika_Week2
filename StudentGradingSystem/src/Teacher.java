public class Teacher {
    String teachersName;
    String mpno;
    String branch;
    String vBranch;


    Teacher(String teachersName, String mpno, String branch, String vBranch) {
        this.teachersName = teachersName;
        this.mpno = mpno;
        this.branch = branch;
        this.vBranch = vBranch;

    }

    void print(){

        System.out.println(this.teachersName);
        System.out.println(this.mpno);
        System.out.println(this.branch);
        System.out.println(this.vBranch);
    }

}


