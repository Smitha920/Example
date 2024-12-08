public class Array {
   public Array() {
   }

   public static void main(String[] var0) {
      Student var1 = new Student();
      var1.rollno = 20;
      var1.name = "Shwetha";
      var1.marks = 99;
      Student var2 = new Student();
      var2.rollno = 20;
      var2.name = "Navin";
      var2.marks = 49;
      Student var3 = new Student();
      var3.rollno = 20;
      var3.name = "Siri";
      var3.marks = 67;
      Student[] var4 = new Student[]{var1, var2, var3};
      Student[] var5 = var4;
      int var6 = var4.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         Student var8 = var5[var7];
         System.out.println(var8.name + " :" + var8.marks);
      }

   }
}