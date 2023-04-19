package ru.oop;

public interface Transport extends Positioned{
    /**
     * получить позицию транспорта
     * @return позиция
     */
    @Override
     Position getPosition();

    /**
     * установить позицию
     * @param position позиция
     */
    @Override
    void setPosition(Position position);

    /**
     * довезти человеа как можно ближе к указанному месту
     * и установить person.setPosition("ближайшая точка к destination, до которой можно доехать")
     *
     * @param person человек
     * @param destination место назначения
     */
    void drive(Person person, Position destination);

}
