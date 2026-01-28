package OOPS;

// public class Students {
//      String name;
//     int roll;
//      public Students(){
//         System.out.println("from class");
//     }
// }

// iss class ko hum alag pkg me same pakge ke alag file me access kar sakte hai
//NOte: constructor compusory hai 
//NOTE: import karna jaruru hai 
// import pkgName as it is then file them
//  ex: OOPS.Students
// agar hum directly object bna lete hai to sabki 
//default value save ho jaati hai
// EX: String-null;  int-0; double-0.0 etc


//USE OF GETTER AND SETTER
public class Students {

    public  static class Student {

        String name;
        private int roll;

        //iska use hum value ko read karne ke liye karte hi
        // aisa samjh sakte hai ki getter access deta hai 
        // value ko main ya koi aur pkg me dekhne ki
        public int getroll() { //getter
            return roll;
        }

        //here it is private but we can set roll received from another pkg or main
        //or setter access deta hai value ko main 
        //se update karne ki
        public void setRoll(int Roll) { //setter yahan pe name same nhi rakhna
            roll = Roll;
            // agar same name rakah hai to this ka use karna padega
            // this.roll=roll;
        }

    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="ram";
        s1.roll=21;  // yahan parent class same hi isliye private 
        // value bhi acces kar sakte hai but agar file change hota to nhi kar sakte
    }

}

//note: agar hum var ko private rkhte hai phir bhi 
// kisi main class se value ko acces karna chahte hai to hum
// getter and setter ka use kar sakte hai
