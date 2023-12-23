public class Main {
    public static void main(String[] args) {
//Öğretmenlerin bilgilerini girdim.
        Teacher teacher= new Teacher("Melek Ceyhun", "09873", "BIO", "VBIO");
        Teacher teacher1 = new Teacher("Serkan Narlı", "09754", "PHY", "VPHY");
        Teacher teacher2 = new Teacher("Arda Güler", "09101", "MAT", "VMAT");
        Teacher teacher3 = new Teacher("Alex De Souza", "09121", "HST", "VHST");

//Hem Ders bilgilerini girdim hemde öğretmenlere dersleri atadım
        Course biology = new Course("Biology", "101", "BIO", "VBIO");
        biology.addTeacher(teacher);

        Course physics = new Course("Physics", "102", "PHY", "VPHY");
        physics.addTeacher(teacher1);

        Course mathematic = new Course("Mathematic", "103", "MAT", "VMAT");
        mathematic.addTeacher(teacher2);

        Course history = new Course("History", "104", "HST", "VHST");
        history.addTeacher(teacher3);

        Course vBiology = new Course("Biology", "101", "BIO", "VBIO");
        vBiology.addTeacher(teacher);

        Course vPhysics = new Course("Physics", "102", "PHY", "VPHY");
        vPhysics.addTeacher(teacher1);

        Course vMathematic = new Course("Mathematic", "103", "MAT", "VMAT");
        vMathematic.addTeacher(teacher2);

        Course vHistory = new Course("History", "104", "HST", "VHST");
        vHistory.addTeacher(teacher3);

//Öğrencinin bilgilerini ve notlarını oluşturdum.
        Student info = new Student("Johanna Pschibul", "2023", "4/A sınıfı", biology, physics, mathematic, history, vBiology, vPhysics, vMathematic, vHistory);
        info.addBulkExamNote(30, 50, 70, 20);
        info.verbalNote(60, 90, 100, 40);
        info.calcAvarage();
        info.isPass();

    }
}