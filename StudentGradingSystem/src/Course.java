public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    String vPrefix;
    int note;


    public Course(String name, String code, String prefix, String vPrefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.vPrefix = vPrefix;
        this.note = 0;
    }
//Dışardaki teacher'ı içeriye aktarmak için addTeacher'ı kullandım.
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.courseTeacher = teacher;
            printTeacher();
        } else {
            System.out.println(courseTeacher + " Akademisyeni bu dersi veremez.");
        }

    }
//Ekrana hangi öğretmenin hangi derse atandığını gösterdim.
    void printTeacher() {
        System.out.println("===============");
        this.courseTeacher.print();
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.teachersName);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}


