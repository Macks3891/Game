import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий игру в футбол.
 */
public class Game {
    private Integer countPlayers = 0;
    private static final int PLAYERS_ON_FIELD = 6;
    private List<Players> players = new ArrayList<>();

    /**
     * Добавляет нового игрока в игру.
     *
     * @param name   Имя нового игрока.
     * @param number Номер нового игрока.
     */
    public void addNewPlayer(String name, Integer number) {
        if (countPlayers < PLAYERS_ON_FIELD) {
            countPlayers++;
            Players newPlayer = new Players(name, number, this);
            players.add(newPlayer);
            System.out.println("Введён новый игрок, всего - " + countPlayers);
        } else {
            System.out.println("Игроков уже 6, мест нет!");
        }
    }

    /**
     * Удаляет игрока из игры.
     *
     * @param player Игрок, которого нужно удалить.
     */
    public void removePlayer(Players player) {
        players.remove(player);
        countPlayers--;
    }

    /**
     * Выводит информацию о текущих игроках в игре.
     */
    public void info() {
        if (countPlayers < 0) {
            throw new RuntimeException("Количество игроков не может быть отрицательным");
        } else if (countPlayers < PLAYERS_ON_FIELD) {
            System.out.println("Команды неполные. На поле ещё есть  " + (PLAYERS_ON_FIELD - countPlayers) + " мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    /**
     * Возвращает список игроков в игре.
     *
     * @return Список игроков.
     */
    public List<Players> getPlayers() {
        return players;
    }

    /**
     * Запускает игру, вызывая метод run() для каждого игрока.
     */
    public void run() {
        for (Players player : players) {
            player.run();
        }
    }

    /**
     * Проверяет, есть ли игрок с указанным именем в игре.
     *
     * @param name Имя игрока для проверки.
     * @return true, если игрок с таким именем есть в игре, иначе false.
     */
    public boolean hasPlayer(String name) {
        for (Players player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}