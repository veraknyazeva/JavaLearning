package home.work.org.task;

import java.text.SimpleDateFormat;
import java.util.*;

/*
CRUD
*/

public class Solution {
    private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        try {
            if (args[0].equals("-c")) {
                Date bd = format.parse(args[3]);
                if (args[2].equals("м")) {
                    allPeople.add(Person.createMale(args[1], bd));
                    System.out.println(allPeople.size()-1);
                } else {
                    allPeople.add(Person.createFemale(args[1], bd));
                    System.out.println(allPeople.size()-1);
                }
            }
            if (args[0].equals("-u")) {
                Date bd = format.parse(args[4]);
                Person people = allPeople.get(Integer.parseInt(args[1]));
                people.setName(args[2]);
                people.setBirthDate(bd);
                if (args[3].equals("ж")) {
                    people.setSex(Sex.FEMALE);
                } else {
                    people.setSex(Sex.MALE);
                }
            }
            if (args[0].equals("-r")) {
               Person person = allPeople.get(Integer.parseInt(args[1]));
                SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
               String id = args[1];
               String name = person.getName();
               String bd = format.format(person.getBirthDate());
               String sex;
               switch (person.getSex()) {
                   case MALE:
                       sex = "м";
                       break;
                   case FEMALE:
                       sex = "ж";
                       break;
                   default:
                       sex = "";
               }
                System.out.println(id + ":" + " " + name + " " + sex + " " + bd );

            }
            if (args[0].equals("-d")) {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
