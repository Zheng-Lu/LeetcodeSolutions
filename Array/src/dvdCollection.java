// A simple definition for a DVD.
class DVD {


    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
}

public class dvdCollection{

    public static void main(String[] args) {
        // The actual code for creating an Array to hold DVD's.

        DVD dvdCollection[] = new DVD[100000];

        // Firstly, we need to actually create a DVD object for The Avengers.

//        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
//        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
//        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
//        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        // Next, we'll put it into the 8th place of the Array. Remember, because we
        // started numbering from 0, the index we want is 7.
//        dvdCollection[7] = avengersDVD;
//
//        // Put "The Incredibles" into the 4th place: index 3.
//        dvdCollection[3] = incrediblesDVD;
//
//        // Put "Finding Dory" into the 10th place: index 9.
//        dvdCollection[9] = findingDoryDVD;
//
//        // Put "The Lion King" into the 3rd place: index 2.
//        dvdCollection[2] = lionKingDVD;
//
//        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
//        dvdCollection[3] = starWarsDVD;


//        System.out.println(dvdCollection[2]);
//        System.out.println(dvdCollection[3]);
//        System.out.println(dvdCollection[7]);
//        System.out.println(dvdCollection[9]);

//        for (int i = 0; i < 15; i++) {
//            System.out.println(dvdCollection[i]);
//        }

//        int length = 0;
//        for (int i = 0; i < 15; i++) {
//            if (dvdCollection[i] != null){
//                length++;
//            }
//        }
//
//        System.out.println("The Array has a capacity of " + dvdCollection.length);
//        System.out.println("The Array has a length of " + length);




//        int capacity = dvdCollection.length;
//        System.out.println(capacity);
    }
}
