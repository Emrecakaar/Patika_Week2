class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double bonus;
    int currentYear;
    double raiseSalary;

// 4 parametre oluşturarak almam gereken parametreleri belirledim.
    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.bonus = 0;
        this.currentYear = 2021;
        this.raiseSalary = 0;

    }

// Çalışan maaşına göre vergisini hesapladım.
    public double tax() {
        if (0 < salary && salary < 1000) {
            return 0;
        } else {
        }
        return this.salary * 0.03;
    }
//Çalışana verilecek haftalık çalışma saatine göre bonus ücretini hesapladım.
    public double bonus() {
        if (0 < this.workHours && this.workHours < 40) {
            return 0;
        } else {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

// Çalışana tecrübesine göre maaşına zam uyguladım.
    public double raiseSalary() {
        if ((2021 - this.hireYear >= 0) && (2021 - this.hireYear <= 9)) {
            raiseSalary = this.salary * 0.05;
        } else if ((2021 - this.hireYear >= 10) && (2021 - this.hireYear < 20)) {
            raiseSalary = this.salary * 0.10;
        } else if ((2021 - this.hireYear >= 20)) {
            raiseSalary = this.salary * 0.15;
        }
        return raiseSalary;
    }

    // Çıktı aldım.
    public String toString() {
        System.out.println("Çalışan adı : " + this.name);
        System.out.println("Çalışanın normal maaşı : " + this.salary);
        System.out.println("Çalışanın haftalık çalışma saati : " + this.workHours);
        System.out.println("Çalışanın başlangıç yılı : " + this.hireYear);
        System.out.println("Çalışanın ödediği vergi : " + this.tax());
        System.out.println("Çalışanın bu ay sonunda alması gereken bonus ücret : " + this.bonus());
        System.out.println("Çalışana bu yıl için uygulanacak zam : " + this.raiseSalary());
        return "Ekibimizin bir üyesi olduğunuz için teşekkür ederiz\n"+
                "Employee ltd.şti";
    }
}


