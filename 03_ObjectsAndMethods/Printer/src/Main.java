public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        printer1.append("Just text", "Detective");
        printer1.append("Just text", "Detective");
        printer1.append("Many Text on this book", "Detective Story", 399);
        printer1.print();
        System.out.println();

        Printer printer2 = new Printer();
        printer2.append("Journey discover world", "Discover", 150);
        printer2.append("More than..", "World journey");
        System.out.println(printer2);
        printer2.print();
        System.out.println();

        System.out.print(Printer.getLifeTimePrintedPages());

    }
}
