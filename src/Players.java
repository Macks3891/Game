import java.util.Random;

/**
 * Класс, представляющий игрока в футбольной игре.
 */
public class Players {
    private String name;
    private Integer number;
    private Integer stamina;
    private static final int MAX_STAMINA = 10;
    private static final int MIN_STAMINA = 0;
    private Game game;

    /**
     * Конструктор для создания игрока с указанным именем и номером.
     * Выносливость генерируется случайным образом от 0 до 10.
     *
     * @param name   Имя игрока.
     * @param number Номер игрока.
     * @param game   Объект игры, к которой принадлежит игрок.
     */
    public Players(String name, Integer number, Game game) {
        this.name = name;
        this.number = number;
        this.game = game;
        this.stamina = new Random().nextInt(MAX_STAMINA + 1);
    }

    /**
     * Возвращает имя игрока.
     *
     * @return Имя игрока.
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает текущую выносливость игрока.
     *
     * @return Текущая выносливость игрока.
     */
    public Integer getStamina() {
        return stamina;
    }

    /**
     * Игрок бежит, уменьшая свою выносливость на 1.
     * Если выносливость достигает 0, игрок уходит с поля.
     */
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                System.out.println("Игрок " + name + " устал и ушел с поля.");
                game.removePlayer(this);
            }
        }
    }

    /**
     * Возвращает строковое представление игрока.
     *
     * @return Строковое представление игрока.
     */
    @Override
    public String toString() {
        return "Players{name='" + name + "', number=" + number + ", stamina=" + stamina + "}";
    }
}