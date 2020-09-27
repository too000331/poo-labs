package universities;

public class Main {
    public static void main(String[] args) {
        University UTM = new University("UTM", 1964);
        University ASEM = new University("ASEM", 1991);
        University USM = new University("USM", 1946);

        Student Oleg = new Student("Oleg", 20);
        Oleg.setMark(10);

        Student Cristian = new Student("Cristian", 20);
        Cristian.setMark(8);

        UTM.setStudent(Oleg);
        UTM.setStudent(Cristian);

        Student Bella = new Student("Bella", 19);
        Bella.setMark(7);


        USM.setStudent(Bella);


        Student John = new Student("John", 25);
        John.setMark(8);

        Student Alexa = new Student("Alexa", 20);
        Alexa.setMark(9);

        Student Mina=new Student("Mina",18);
        Mina.setMark(6);

        ASEM.setStudent(John);
        ASEM.setStudent(Alexa);
        ASEM.setStudent(Mina);

        float mediaUTM = UTM.computeAverageMedia();
        float mediaUSM = USM.computeAverageMedia();
        float mediaASEM = ASEM.computeAverageMedia();

        float universitiesMedia = (mediaUTM + mediaUSM + mediaASEM) / 3;

        System.out.println("The average media between universities is:" + universitiesMedia);
    }
}
