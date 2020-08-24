package javareview;

public class Student {
    // access specifier / access modifier -------------
    // ตัวระบุการเข้าถึงตัวปรและเมทอด มี 4 ระดับ
    // private,public,package (default), protected


    // 1. field attribute, instance(ตัวแปรของ class) variable
    private int id;
    private String name;
    private double midtermScore;
    private double finalScroe;

    //  2. contructor สร้างขื่อเดียวกับ class
    // ถูกสร้างตอนสร้าง object ช่วยกำหนดค่าเริ่มต้นให้ field

    public Student(int id,String name){
        this.id = id;
        this.name = name;

    }

    // 3 .method same as funtion()
    double getTotalScore(){
      double total = midtermScore + finalScroe;
      return total;
    }
    // getters คืนค่า reference
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
     // setters การกำหนดค่า

    public void setName(String name) {
        this.name = name;
    }

    public void setMidtermScore(double midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScroe(double finalScroe){
        this.finalScroe = finalScroe;
    }
    //toString method
    public String toString() {
        return id +"-----"+name;
    }


}
