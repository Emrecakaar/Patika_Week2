public class Student {
    String studentsName;
    String studentsNo;
    String studentsClasses;
    Course biology;
    double impBiology = 0.3;
    Course physics;
    double impPhysics = 0.5;
    Course mathematic;
    double impMathematic = 0.7;
    Course history;
    double impHistory = 0.2;//imp ile başlayan derslerin etki ettiği yüzde
    Course vBiology;// -v ile başlayan dersler sözlü notlarıdır.
    double impVBiology = 0.2;
    Course vPhysics;
    double impVPhysics = 0.3;
    Course vMathematic;
    double impVMathematic = 0.5;
    Course vHistory;
    double impVHistory = 0.2;
    double avarage;
    double verbalAvarage;//Sözlü ortalaması için
    double examAvarage;//Sınav ortalaması için
    double verbalNote;//Sözlü notu
    boolean isPass;

    Student(String studentsName, String studentsNo, String studentsClasses, Course biology, Course physics, Course mathematic, Course history, Course vBiology, Course vPhysics, Course vMathematic, Course vHistory) {
        this.studentsName = studentsName;
        this.studentsNo = studentsNo;
        this.studentsClasses = studentsClasses;
        this.biology = biology;
        this.physics = physics;
        this.mathematic = mathematic;
        this.history = history;
        this.vBiology = vBiology;
        this.vPhysics = vPhysics;
        this.vMathematic = vMathematic;
        this.vHistory = vHistory;
        this.verbalAvarage = verbalNote;
        calcAvarage();
        this.isPass = false;
    }
//Sınav notlarını 100 ile 0 arasında sabitledim.

    public void addBulkExamNote(int biology, int physics, int mathematic, int history) {
        if (0 < biology && biology > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < physics && physics > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < mathematic && mathematic > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < history && history > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }

        if (biology >= 0 && biology <= 100) {
            this.biology.note = biology;
        }
        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }
        if (mathematic >= 0 && mathematic <= 100) {
            this.mathematic.note = mathematic;
        }
        if (history >= 0 && history <= 100) {
            this.history.note = history;
        }
    }

    // Sınav notları gibi sözlü notlarına da böyle bir işlem uyguladım.
    public void verbalNote(int vBiology, int vPhysics, int vMathematic, int vHistory) {
        if (0 < vBiology && vBiology > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < vPhysics && vPhysics > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < vMathematic && vMathematic > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (0 < vHistory && vHistory > 100) {
            System.out.println("0'dan küçük 100'den büyük not girilemez.");
        }
        if (vBiology >= 0 && vBiology <= 100) {
            this.vBiology.note = vBiology;
        }
        if (vPhysics >= 0 && vPhysics <= 100) {
            this.vPhysics.note = vPhysics;
        }
        if (vMathematic >= 0 && vMathematic <= 100) {
            this.vMathematic.note = vMathematic;
        }
        if (vHistory >= 0 && vHistory <= 100) {
            this.vHistory.note = vHistory;
        }
    }
//Ortalamayı etkileyen durumları hesap ederek ortalamayı buldum

    public void calcAvarage() {
        this.examAvarage = (((this.biology.note * impBiology) + (this.physics.note * this.impPhysics) + (this.mathematic.note * this.impMathematic) + (this.history.note * impHistory)) / 4);
        this.verbalAvarage = (((this.vBiology.note * this.impVBiology) + (this.vPhysics.note * impVPhysics) + (this.vMathematic.note * this.impVMathematic) + (this.vHistory.note * impVHistory)) / 4);
        this.avarage = examAvarage + verbalAvarage;
    }

    //Ekrana çıktı verdim.
    void isPass() {
        if (this.biology.note == 0 || this.physics.note == 0 || this.mathematic.note == 0 || this.history.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }

        }
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("========================");
        System.out.println("Öğrenci adı : " + this.studentsName);
        System.out.println("Öğrenci numarası : " + this.studentsNo);
        System.out.println("Öğrencinin sınıfı : " + this.studentsClasses);
        System.out.println("Öğrencinin Biyoloji Notu : " + this.biology.note);
        System.out.println("Öğrencinin Fizik Notu : " + this.physics.note);
        System.out.println("Öğrencinin Matematik Notu : " + this.mathematic.note);
        System.out.println("Öğrencinin Tarih Notu : " + this.history.note);
        System.out.println("Öğrencinin Sınav Ortalaması : " + this.examAvarage);
        System.out.println("Öğrencinin Sözlü Biyoloji Notu : " + this.vBiology.note);
        System.out.println("Öğrencinin Sözlü Fizik Notu : " + this.vPhysics.note);
        System.out.println("Öğrencinin Sözlü Matematik Notu : " + this.vMathematic.note);
        System.out.println("Öğrencinin Sözlü Tarih Notu : " + this.vHistory.note);
        System.out.println("Öğrencinin Sözlü Notu Ortalaması : " + this.verbalAvarage);
        System.out.println("Öğrencinin Ortalaması : " + this.avarage);
    }

}

