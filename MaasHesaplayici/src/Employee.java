public class Employee {
    String name ;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax() {
        double tax = 0;
        
        /*
        tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
        Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
         */
        if (salary>=1000){
            tax=salary*0.03;
            return tax;
        }else {
            return tax;
        }
    }
    public double bonus(){
        double bonusSalary=0;
        //bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
        // fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
        if(workHours >40){
            bonusSalary=30*(workHours-40);
        }

        return bonusSalary;
    }
    public double raiseSalary(){
        /*
        raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
        Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
         */
        int workYear;
        double increasedSalary = 0;
        workYear=2021-hireYear;
        if (workYear>19){//%15 zam yap
            increasedSalary=this.salary*0.15;
        } else if (workYear>9) {//%10 zam yap
            increasedSalary=this.salary*0.10;
        }else {//%5 zam yap
            increasedSalary=this.salary*0.05;
        }
        return increasedSalary;
    }
    public void  print(){
        /*
        Adı : kemal
        Maaşı : 2000.0
        Çalışma Saati : 45
        Başlangıç Yılı : 1985
        Vergi : 60.0
        Bonus : 150.0
        Maaş Artışı : 300.0
        Vergi ve Bonuslar ile birlikte maaş : 2090.0
        Toplam Maaş : 2300.0
         */
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary +  raiseSalary()));

    }

}
