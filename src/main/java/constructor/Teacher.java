package constructor;

public class Teacher {

    String name, mpno, branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print(){
        System.out.println("Adı: " + name);
        System.out.println("Tel: " + mpno);
        System.out.println("Bölüm: " + branch);
    }

}

