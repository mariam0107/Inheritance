
package oct11_2017_inheritance;

import java.util.ArrayList;


public class Oct11_2017_Inheritance {

    
    public static void main(String[] args) {
      
//        System.out.println(at);
ArrayList<Person> peopleOfTown=new ArrayList<>();
Student s1=new Student("Lexicon","Java","Developer",37,"Malieh");
Athlete at=new Athlete(53,"Zlatan",45,"5 Castle");
s1.addGrade(4);
s1.addGrade(5);
s1.addGrade(6);
s1.addGrade(7);
peopleOfTown.add(s1);
peopleOfTown.add(at);
double totalBonus=0;
        for (Person p : peopleOfTown) {
            if(p instanceof Student)
            {
              double bonus_pay=((Student)p).bonus();
              totalBonus+=bonus_pay;
            }
            else 
            {
              double bonus_pay=((Athlete)p).bonus();
              totalBonus+=bonus_pay;
            }
            
        }
        System.out.println("THE TOTAL BONUS IS :"+totalBonus);
for(Person p:peopleOfTown)
{
    if(p instanceof Student)
    {
        System.out.println(p.getName()+" "+((Student) p).calculateAverage());
    }
}
    }
    
}
