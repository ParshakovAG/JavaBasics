public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;
    private static int lifeTimePrintedPages = 0;
    public static int count = 0;

    public Printer() {

    }

    public Printer(String queue, int pendingPagesCount, int lifeTimePrintedPages) {
        this.queue = queue;
        this.pendingPagesCount = pendingPagesCount;
        this.lifeTimePrintedPages = lifeTimePrintedPages;
    }

    public void append(String text) {
        append(text, "", +1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, String name, int pages) {
        queue = queue + "Текст для вывода на печать: " + text + "\n" + "Название документа: "
                + name + "\n" + "Количество страниц: " + pages + "\n";
        pendingPagesCount += pages;
        Printer.count = Printer.count + pages;
    }

    public void clear(String queue) {
        this.queue = "";
    }

    public void print() {
        System.out.println(queue);
        getPendingPagesCount(queue);
        clear(queue);
        System.out.println("Очередь печати очищена!");
        if (queue.isEmpty()) ;
        System.out.println("Очередь печати пуста!");
    }

    public int getPendingPagesCount(String queue) {
        System.out.println("Отправлено на печать страниц: " + pendingPagesCount);
        return pendingPagesCount;
    }

    public static int getLifeTimePrintedPages() {
        lifeTimePrintedPages += count;
        System.out.println("Общее количество страниц за все время существования объекта Printer: ");
        return lifeTimePrintedPages;
    }
}