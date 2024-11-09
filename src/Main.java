/**
 * Главный класс для запуска и тестирования игры.
 */
public class Main {
    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Game game = new Game();

        // Добавляем игроков
        game.addNewPlayer("Максим", 1);
        game.addNewPlayer("Алексей", 2);
        game.addNewPlayer("Александр", 3);
        game.addNewPlayer("Михаил", 4);
        game.addNewPlayer("Георгий", 5);
        game.addNewPlayer("Дмитрий", 6);
        game.addNewPlayer("Евгений", 7);



        game.run();

        System.out.println("Есть ли игрок с именем Максим? " + game.hasPlayer("Максим"));
        System.out.println("Есть ли игрок с именем Евгений? " + game.hasPlayer("Евгений"));

        game.info();
    }
}